package com.eu.rcalculatorpro;

import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Fragment01 extends Fragment {

   private RelativeLayout relativeLayoutBand1;
   private RelativeLayout relativeLayoutBand2;
   private    RelativeLayout relativeLayoutBand3;
    private RelativeLayout relativeLayoutBand4;
    private TextView tvCtn1,tvCtn2,tvCtn3,tvCtn4;
    private EditText editText01;
    private int convert;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view01 = inflater.inflate(R.layout.fragment_01, container, false);
        relativeLayoutBand1 = view01.findViewById(R.id.value_color1band);
        relativeLayoutBand2 = view01.findViewById(R.id.value_color2band);
        relativeLayoutBand3 = view01.findViewById(R.id.value_color3band);
        relativeLayoutBand4 = view01.findViewById(R.id.value_color4band);
        tvCtn1 = view01.findViewById(R.id.tvctn1);
        tvCtn2 = view01.findViewById(R.id.tvctn2);
        tvCtn3 = view01.findViewById(R.id.tvctn3);
        tvCtn4 = view01.findViewById(R.id.tvctn4);
        editText01 = view01.findViewById(R.id.editText);
        Button button01 = view01.findViewById(R.id.buttonCompute);
        Spinner spinner01 = view01.findViewById(R.id.selector);
        Spinner spinner02 = view01.findViewById(R.id.tolerancectn);

        button01.setOnClickListener(view -> func(convert));

        List<String> name01 = new ArrayList<>();
        name01.add("Ω");
        name01.add("KΩ");
        name01.add("MΩ");
        ArrayAdapter<String> arrayAdapter01 = new ArrayAdapter<>(getActivity(), R.layout.item, name01);
        arrayAdapter01.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner01.setAdapter(arrayAdapter01);

        spinner01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        convert = 1;
                        break;
                    case 1:
                        convert = 1000;
                        break;

                    case 2:
                        convert = 1000000;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        List<String> name02 = new ArrayList<>();
        name02.add("+-20%");
        name02.add("+-10%");
        name02.add("+-5%");
        ArrayAdapter<String> arrayAdapter02 = new ArrayAdapter<>(getActivity(), R.layout.item, name02);
        arrayAdapter02.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner02.setAdapter(arrayAdapter02);

        spinner02.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        relativeLayoutBand4.setBackgroundColor(Color.parseColor("#E2E6E5"));tvCtn4.setText("");

                        break;
                    case 1:
                        relativeLayoutBand4.setBackgroundColor(Color.parseColor("#8A8989"));tvCtn4.setText(R.string.silver);
                        break;

                    case 2:
                        relativeLayoutBand4.setBackgroundColor(Color.parseColor("#B18603"));tvCtn4.setText(R.string.gold);

                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        }


     );


        return view01;

    }



    private void func(int s) {
        //input{{
        if ((editText01.getText().toString().isEmpty())) {
            Toast.makeText(getActivity(), "empty", Toast.LENGTH_LONG).show();
        } else {
            double y = Double.parseDouble(editText01.getText().toString());
            double valueInitial = y * s;
            String a = Double.toString(valueInitial);


            //pour la verification de l'entrer

           try {if (valueInitial >= 100 && a.charAt(2) != '0') { Toast.makeText(getActivity(), "wong code, closest resistor is...", Toast.LENGTH_LONG).show();}
                      } catch (Exception ignored) {
                }

           // pour les nombre decimale <1
                if (valueInitial < 1) {


                    switch (a.charAt(2)) {

                        case '1':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#4C1A0B"));
                              tvCtn1.setText(R.string.brown);
                            break;
                        case '2':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#F60202"));
                            tvCtn1.setText(R.string.red);
                            break;
                        case '3':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#FF5722"));tvCtn1.setText(R.string.orange);
                            break;
                        case '4':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#FFC107"));tvCtn1.setText(R.string.jaunt);
                            break;
                        case '5':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#0CF115"));tvCtn1.setText(R.string.green);
                            break;
                        case '6':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#0228FA"));tvCtn1.setText(R.string.blue);
                            break;
                        case '7':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#D703FB"));tvCtn1.setText(R.string.purple);
                            break;
                        case '8':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#9C9A9A"));tvCtn1.setText(R.string.gray);
                            break;
                        case '9':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#FDFBFB"));tvCtn1.setText(R.string.white);

                            break;

                    }

                    try {

                        switch (a.charAt(3)) {

                            case '0':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0B0303"));tvCtn2.setText(R.string.black);
                                break;
                            case '1':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#4C1A0B"));tvCtn2.setText(R.string.brown);

                                break;
                            case '2':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#F60202"));tvCtn2.setText(R.string.red);
                                break;
                            case '3':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FF5722"));tvCtn2.setText(R.string.orange);
                                break;
                            case '4':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FFC107"));tvCtn2.setText(R.string.jaunt);
                                break;
                            case '5':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0CF115"));tvCtn2.setText(R.string.green);
                                break;
                            case '6':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0228FA"));tvCtn2.setText(R.string.blue);
                                break;
                            case '7':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#D703FB"));tvCtn2.setText(R.string.purple);
                                break;
                            case '8':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#9C9A9A"));tvCtn2.setText(R.string.gray);
                                break;
                            case '9':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FDFBFB"));tvCtn2.setText(R.string.white);

                                break;
                        }
                    } catch (Exception e) {
                        relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0B0303"));tvCtn2.setText(R.string.black);
                    }

                    relativeLayoutBand3.setBackgroundColor(Color.parseColor("#8A8989"));tvCtn3.setText(R.string.silver);
                } else {


                    switch (a.charAt(0)) {

                        case '1':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#4C1A0B"));tvCtn1.setText(R.string.brown);

                            break;
                        case '2':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#F60202"));tvCtn1.setText(R.string.red);
                            break;
                        case '3':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#FF5722"));tvCtn1.setText(R.string.orange);
                            break;
                        case '4':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#FFC107"));tvCtn1.setText(R.string.jaunt);
                            break;
                        case '5':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#0CF115"));tvCtn1.setText(R.string.green);
                            break;
                        case '6':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#0228FA"));tvCtn1.setText(R.string.blue);
                            break;
                        case '7':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#D703FB"));tvCtn1.setText(R.string.purple);
                            break;
                        case '8':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#9C9A9A"));tvCtn1.setText(R.string.gray);
                            break;
                        case '9':
                            relativeLayoutBand1.setBackgroundColor(Color.parseColor("#FDFBFB"));tvCtn1.setText(R.string.white);

                            break;

                    }try {

                        switch (a.charAt(1)) {

                            case '0':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0B0303"));tvCtn2.setText(R.string.black);
                                break;
                            case '1':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#4C1A0B"));tvCtn2.setText(R.string.brown);

                                break;
                            case '2':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#F60202"));tvCtn2.setText(R.string.red);
                                break;
                            case '3':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FF5722"));tvCtn2.setText(R.string.orange);
                                break;
                            case '4':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FFC107"));tvCtn2.setText(R.string.jaunt);
                                break;
                            case '5':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0CF115"));tvCtn2.setText(R.string.green);
                                break;
                            case '6':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0228FA"));tvCtn2.setText(R.string.blue);
                                break;
                            case '7':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#D703FB"));tvCtn2.setText(R.string.purple);
                                break;
                            case '8':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#9C9A9A"));tvCtn2.setText(R.string.gray);
                                break;
                            case '9':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FDFBFB"));tvCtn2.setText(R.string.white);

                                break;
                        }
                        //pour les nombres decimale >1
                        if (a.charAt(1) == '.') {

                            switch (a.charAt(2)) {


                                case '0':
                                    relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0B0303"));tvCtn2.setText(R.string.black);
                                    break;
                                case '1':
                                    relativeLayoutBand2.setBackgroundColor(Color.parseColor("#4C1A0B"));tvCtn2.setText(R.string.brown);

                                    break;
                                case '2':
                                    relativeLayoutBand2.setBackgroundColor(Color.parseColor("#F60202"));tvCtn2.setText(R.string.red);
                                    break;
                                case '3':
                                    relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FF5722"));tvCtn2.setText(R.string.orange);
                                    break;
                                case '4':
                                    relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FFC107"));tvCtn2.setText(R.string.jaunt);
                                    break;
                                case '5':
                                    relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0CF115"));tvCtn2.setText(R.string.green);
                                    break;
                                case '6':
                                    relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0228FA"));tvCtn2.setText(R.string.blue);
                                    break;
                                case '7':
                                    relativeLayoutBand2.setBackgroundColor(Color.parseColor("#D703FB"));tvCtn2.setText(R.string.purple);
                                    break;
                                case '8':
                                    relativeLayoutBand2.setBackgroundColor(Color.parseColor("#9C9A9A"));tvCtn2.setText(R.string.gray);
                                    break;
                                case '9':
                                    relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FDFBFB"));tvCtn2.setText(R.string.white);

                                    break;
                            }

                        }

                    } catch (Exception e) {
                        relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0B0303"));tvCtn2.setText(R.string.black);
                    }


                    if (valueInitial < 10) {
                        relativeLayoutBand3.setBackgroundColor(Color.parseColor("#B18603"));tvCtn3.setText(R.string.gold);
                    } else if (valueInitial < 100) {
                        relativeLayoutBand3.setBackgroundColor(Color.parseColor("#0B0303"));tvCtn3.setText(R.string.black);
                    } else if (valueInitial < 1000) {
                        relativeLayoutBand3.setBackgroundColor(Color.parseColor("#4C1A0B"));tvCtn3.setText(R.string.brown);
                    } else if (valueInitial < 10000) {
                        relativeLayoutBand3.setBackgroundColor(Color.parseColor("#F60202"));tvCtn3.setText(R.string.red);
                    } else if (valueInitial < 100000) {
                        relativeLayoutBand3.setBackgroundColor(Color.parseColor("#FF5722"));tvCtn3.setText(R.string.orange);
                    } else if (valueInitial < 1000000) {
                        relativeLayoutBand3.setBackgroundColor(Color.parseColor("#FFC107"));tvCtn3.setText(R.string.jaunt);
                    } else if (valueInitial < 10000000) {
                        relativeLayoutBand3.setBackgroundColor(Color.parseColor("#0CF115"));tvCtn3.setText(R.string.green);
                    }else if (valueInitial < 100000000) {
                        relativeLayoutBand3.setBackgroundColor(Color.parseColor("#0228FA"));tvCtn3.setText(R.string.blue);
                    }



                }


            }


        }

    }





