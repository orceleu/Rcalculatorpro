package com.eu.rcalculatorpro;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class LED_resistor extends Fragment {

    EditText editText_V_Led, editText_Nbre, editText_ma;
    RadioGroup radioGroup_Led;
    RadioButton radioButton_serie, radioButtonParallel;
    Button btn_Compute_Led;
    TextView textView_result_Led;
    Spinner spinner_type_led;
    double V_type_de_Led;
    double nbrdeLed = 1;
    double tensionAppliquer;
    double intensiteMa = 10;
    boolean check_type_montage = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view8 = inflater.inflate(R.layout.fragment_l_e_d_resistor, container, false);

        editText_V_Led = view8.findViewById(R.id.editText_Led_V);
        editText_Nbre = view8.findViewById(R.id.editText_nbre_Led);
        editText_ma = view8.findViewById(R.id.editText_Led_ma);
        radioGroup_Led = view8.findViewById(R.id.radio_group_Led);
        radioButton_serie = view8.findViewById(R.id.radio_Led_serie);
        radioButtonParallel = view8.findViewById(R.id.radio_Led_parallel);
        textView_result_Led = view8.findViewById(R.id.textView_result_Led);
        spinner_type_led = view8.findViewById(R.id.spinner_Type_led);
        btn_Compute_Led = view8.findViewById(R.id.compute_Led);
        //pour resynchroniser les valeurs de : nbre de led et intensite ma
        editText_Nbre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                nbrdeLed = 1;
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editText_ma.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                intensiteMa = 10;
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btn_Compute_Led.setOnClickListener(view -> {
            if (editText_V_Led.getText().toString().isEmpty()) {
                Toast.makeText(getActivity(), "Empty", Toast.LENGTH_SHORT).show();
            } else {
                try {
                    tensionAppliquer = Double.parseDouble(editText_V_Led.getText().toString());
                } catch (Exception ignored) {
                }
                try {
                    nbrdeLed = Double.parseDouble(editText_Nbre.getText().toString());
                } catch (Exception ignored) {
                }
                try {
                    intensiteMa = Double.parseDouble(editText_ma.getText().toString());
                } catch (Exception ignored) {
                }
                if (check_type_montage) {

                    textView_result_Led.setText(resultatFinalDeLed());
                } else {
                    textView_result_Led.setText(resultaFinaleLedParallele());
                }
            }
        });

        //select the type of montage
        radioGroup_Led.setOnCheckedChangeListener((radioGroup, i) -> {
            if (radioGroup.getCheckedRadioButtonId() == R.id.radio_Led_serie) {
                check_type_montage = true;

            } else if (radioGroup.getCheckedRadioButtonId() == R.id.radio_Led_parallel) {
                check_type_montage = false;
            }
        });


        //select type of led
        List<String> name_Led = new ArrayList<>();
        name_Led.add("LED_red");
        name_Led.add("LED_blue");
        name_Led.add("LED_green");
        name_Led.add("LED_jaunt");
        name_Led.add("LED_white");
        name_Led.add("1W (white)");
        ArrayAdapter<String> arrayAdapter01 = new ArrayAdapter<>(getActivity(), R.layout.bolditem, name_Led);
        arrayAdapter01.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_type_led.setAdapter(arrayAdapter01);

        spinner_type_led.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        V_type_de_Led = 1.8;
                        break;
                    case 1:
                        V_type_de_Led = 3.6;
                        break;

                    case 2:
                        V_type_de_Led = 3.5;
                        break;

                    case 3:
                        V_type_de_Led = 2.2;
                        break;

                    case 4:
                        V_type_de_Led = 4;
                        break;
                    case 5:
                        V_type_de_Led = 3.3;
                        intensiteMa = 330;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });


        return view8;
    }


    //serie ...
    private String resultatFinalDeLed() {
        double voltsFinal = (tensionAppliquer - (nbrdeLed * V_type_de_Led));
        double resutlOhm = voltsFinal / (intensiteMa * 0.001);
        double nbreWatts = resutlOhm * ((intensiteMa * 0.001) * (intensiteMa * 0.001));
        if (resutlOhm < 1) {
            return ("tension des LEDs sup. a l'entré");
        }
        return ("*serie...\nResistance: ~" + resutlOhm + " ohm\nPower:  ~" + nbreWatts + " W");

    }

    //parralele...
    private String resultaFinaleLedParallele() {

        double voltFinal = (tensionAppliquer - V_type_de_Led);
        double intensiteFinal = nbrdeLed * (intensiteMa * 0.001);
        double calculFinalLedPar = voltFinal / intensiteFinal;
        double nbredeWatts = calculFinalLedPar * ((intensiteMa * 0.001) * (intensiteMa * 0.001));
        if (calculFinalLedPar < 1) {
            return ("tension trop basse");
        }
        return ("*Parralele...\nResistance: ~" + calculFinalLedPar + " ohms\nPower: ~" + nbredeWatts + " W");
    }
}