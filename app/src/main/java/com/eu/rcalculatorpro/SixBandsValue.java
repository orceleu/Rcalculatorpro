package com.eu.rcalculatorpro;

import android.graphics.Color;
import android.os.Bundle;
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

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class SixBandsValue extends Fragment {
    private RelativeLayout relativeLayoutBand1;
    private RelativeLayout relativeLayoutBand2;
    private RelativeLayout relativeLayoutBand3;
    private RelativeLayout relativeLayoutBand4;
    private RelativeLayout relativeLayoutBand5;
    private RelativeLayout relativeLayoutBand6;
    private TextView tvCtn1, tvCtn2, tvCtn3, tvCtn4, tvCtn5, tvCtn6;
    private EditText editText01;
    private int convert;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view9 = inflater.inflate(R.layout.sixbandsvalue, container, false);


        relativeLayoutBand1 = view9.findViewById(R.id.value_color001band);
        relativeLayoutBand2 = view9.findViewById(R.id.value_color002band);
        relativeLayoutBand3 = view9.findViewById(R.id.value_color003band);
        relativeLayoutBand4 = view9.findViewById(R.id.value_color004band);
        relativeLayoutBand5 = view9.findViewById(R.id.value_color005band);
        relativeLayoutBand6 = view9.findViewById(R.id.value_color006band);
        tvCtn1 = view9.findViewById(R.id.tvctn001);
        tvCtn2 = view9.findViewById(R.id.tvctn002);
        tvCtn3 = view9.findViewById(R.id.tvctn003);
        tvCtn4 = view9.findViewById(R.id.tvctn004);
        tvCtn5 = view9.findViewById(R.id.tvctn005);
        tvCtn6 = view9.findViewById(R.id.tvctn006);
        editText01 = view9.findViewById(R.id.editText002);
        Button button01 = view9.findViewById(R.id.buttonCompute002);
        Spinner spinner01 = view9.findViewById(R.id.selector002);
        Spinner spinner02 = view9.findViewById(R.id.tolerancectn002);
        Spinner spinner03 = view9.findViewById(R.id.tolerancectnTemp002);

        button01.setOnClickListener(view -> func(convert));

        List<String> name01 = new ArrayList<>();
        name01.add("Ω");
        name01.add("KΩ");
        name01.add("MΩ");
        ArrayAdapter<String> arrayAdapter01 = new ArrayAdapter<>(getActivity(), R.layout.bolditem, name01);
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
        name02.add("+-1%");
        name02.add("+-2%");
        name02.add("+-0.05%");
        name02.add("+-0.02%");
        name02.add("+-0.5%");
        name02.add("+-0.25%");
        name02.add("+-0.1%");
        name02.add("+-0.01%");
        name02.add("+-10%");
        name02.add("+-5%");
        ArrayAdapter<String> arrayAdapter02 = new ArrayAdapter<>(getActivity(), R.layout.bolditem, name02);
        arrayAdapter02.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner02.setAdapter(arrayAdapter02);

        spinner02.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                                    switch (i) {
                                                        case 0:
                                                            relativeLayoutBand5.setBackgroundColor(Color.parseColor("#4C1A0B"));
                                                            tvCtn5.setText(R.string.brown);

                                                            break;
                                                        case 1:
                                                            relativeLayoutBand5.setBackgroundColor(Color.parseColor("#F60202"));
                                                            tvCtn5.setText(R.string.red);
                                                            break;

                                                        case 2:
                                                            relativeLayoutBand5.setBackgroundColor(Color.parseColor("#FF5722"));
                                                            tvCtn5.setText(R.string.orange);
                                                            break;

                                                        case 3:
                                                            relativeLayoutBand5.setBackgroundColor(Color.parseColor("#FFC107"));
                                                            tvCtn5.setText(R.string.jaunt);
                                                            break;
                                                        case 4:
                                                            relativeLayoutBand5.setBackgroundColor(Color.parseColor("#0CF115"));
                                                            tvCtn5.setText(R.string.green);
                                                            break;
                                                        case 5:
                                                            relativeLayoutBand5.setBackgroundColor(Color.parseColor("#0228FA"));
                                                            tvCtn5.setText(R.string.blue);
                                                            break;
                                                        case 6:
                                                            relativeLayoutBand5.setBackgroundColor(Color.parseColor("#D703FB"));
                                                            tvCtn5.setText(R.string.purple);
                                                            break;
                                                        case 7:
                                                            relativeLayoutBand5.setBackgroundColor(Color.parseColor("#9C9A9A"));
                                                            tvCtn5.setText(R.string.gray);
                                                            break;

                                                        case 8:
                                                            relativeLayoutBand5.setBackgroundColor(Color.parseColor("#8A8989"));
                                                            tvCtn5.setText(R.string.silver);
                                                            break;

                                                        case 9:
                                                            relativeLayoutBand5.setBackgroundColor(Color.parseColor("#B18603"));
                                                            tvCtn5.setText(R.string.gold);
                                                            break;
                                                    }
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> adapterView) {


                                                }
                                            }
        );
        List<String> name03 = new ArrayList<>();
        name03.add("250ppm/ºC");
        name03.add("100ppm/ºC");
        name03.add("50ppm/ºC");
        name03.add("15ppm/ºC");
        name03.add("25ppm/ºC");
        name03.add("20ppm/ºC");
        name03.add("10ppm/ºC");
        name03.add("5ppm/ºC");
        name03.add("1ppm/ºC");
        ArrayAdapter<String> arrayAdapter03 = new ArrayAdapter<>(getActivity(), R.layout.bolditem, name03);
        arrayAdapter03.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner03.setAdapter(arrayAdapter03);

        spinner03.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                @Override
                                                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                                    switch (i) {
                                                        case 0:
                                                            relativeLayoutBand6.setBackgroundColor(Color.parseColor("#0B0303"));
                                                            tvCtn6.setText(R.string.black);

                                                            break;
                                                        case 1:
                                                            relativeLayoutBand6.setBackgroundColor(Color.parseColor("#4C1A0B"));
                                                            tvCtn6.setText(R.string.brown);
                                                            break;

                                                        case 2:
                                                            relativeLayoutBand6.setBackgroundColor(Color.parseColor("#F60202"));
                                                            tvCtn6.setText(R.string.red);
                                                            break;

                                                        case 3:
                                                            relativeLayoutBand6.setBackgroundColor(Color.parseColor("#FF5722"));
                                                            tvCtn6.setText(R.string.orange);
                                                            break;
                                                        case 4:
                                                            relativeLayoutBand6.setBackgroundColor(Color.parseColor("#FFC107"));
                                                            tvCtn6.setText(R.string.jaunt);
                                                            break;
                                                        case 5:
                                                            relativeLayoutBand6.setBackgroundColor(Color.parseColor("#0CF115"));
                                                            tvCtn6.setText(R.string.green);
                                                            break;
                                                        case 6:
                                                            relativeLayoutBand6.setBackgroundColor(Color.parseColor("#0228FA"));
                                                            tvCtn6.setText(R.string.blue);
                                                            break;
                                                        case 7:
                                                            relativeLayoutBand6.setBackgroundColor(Color.parseColor("#D703FB"));
                                                            tvCtn6.setText(R.string.purple);
                                                            break;

                                                        case 8:
                                                            relativeLayoutBand6.setBackgroundColor(Color.parseColor("#9C9A9A"));
                                                            tvCtn6.setText(R.string.gray);
                                                            break;


                                                    }
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> adapterView) {


                                                }
                                            }
        );
        return view9;

    }


    private void func(int s) {
        //input{{
        if ((editText01.getText().toString().isEmpty())) {
            Toast.makeText(getActivity(), "Empty", Toast.LENGTH_LONG).show();

        } else {
            double y = Double.parseDouble(editText01.getText().toString());
            double valueInitial = y * s;
            String a = Double.toString(valueInitial);

            if (valueInitial < 1) {
                Toast.makeText(getActivity(), "Error", Toast.LENGTH_LONG).show();

            } else {
                //pour la verification de l'entrer

                try {
                    if (valueInitial >= 1000 && a.charAt(3) != '0') {
                        Toast.makeText(getActivity(), "invalid code, closest value is...", Toast.LENGTH_LONG).show();
                    }
                } catch (Exception ignored) {
                }


                switch (a.charAt(0)) {

                    case '1':
                        relativeLayoutBand1.setBackgroundColor(Color.parseColor("#4C1A0B"));
                        tvCtn1.setText(R.string.brown);

                        break;
                    case '2':
                        relativeLayoutBand1.setBackgroundColor(Color.parseColor("#F60202"));
                        tvCtn1.setText(R.string.red);
                        break;
                    case '3':
                        relativeLayoutBand1.setBackgroundColor(Color.parseColor("#FF5722"));
                        tvCtn1.setText(R.string.orange);
                        break;
                    case '4':
                        relativeLayoutBand1.setBackgroundColor(Color.parseColor("#FFC107"));
                        tvCtn1.setText(R.string.jaunt);
                        break;
                    case '5':
                        relativeLayoutBand1.setBackgroundColor(Color.parseColor("#0CF115"));
                        tvCtn1.setText(R.string.green);
                        break;
                    case '6':
                        relativeLayoutBand1.setBackgroundColor(Color.parseColor("#0228FA"));
                        tvCtn1.setText(R.string.blue);
                        break;
                    case '7':
                        relativeLayoutBand1.setBackgroundColor(Color.parseColor("#D703FB"));
                        tvCtn1.setText(R.string.purple);
                        break;
                    case '8':
                        relativeLayoutBand1.setBackgroundColor(Color.parseColor("#9C9A9A"));
                        tvCtn1.setText(R.string.gray);
                        break;
                    case '9':
                        relativeLayoutBand1.setBackgroundColor(Color.parseColor("#FDFBFB"));
                        tvCtn1.setText(R.string.white);
                        break;
                }

                try {

                    switch (a.charAt(1)) {

                        case '0':
                            relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0B0303"));
                            tvCtn2.setText(R.string.black);
                            break;
                        case '1':
                            relativeLayoutBand2.setBackgroundColor(Color.parseColor("#4C1A0B"));
                            tvCtn2.setText(R.string.brown);
                            break;
                        case '2':
                            relativeLayoutBand2.setBackgroundColor(Color.parseColor("#F60202"));
                            tvCtn2.setText(R.string.red);
                            break;
                        case '3':
                            relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FF5722"));
                            tvCtn2.setText(R.string.orange);
                            break;
                        case '4':
                            relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FFC107"));
                            tvCtn2.setText(R.string.jaunt);
                            break;
                        case '5':
                            relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0CF115"));
                            tvCtn2.setText(R.string.green);
                            break;
                        case '6':
                            relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0228FA"));
                            tvCtn2.setText(R.string.blue);
                            break;
                        case '7':
                            relativeLayoutBand2.setBackgroundColor(Color.parseColor("#D703FB"));
                            tvCtn2.setText(R.string.purple);
                            break;
                        case '8':
                            relativeLayoutBand2.setBackgroundColor(Color.parseColor("#9C9A9A"));
                            tvCtn2.setText(R.string.gray);
                            break;
                        case '9':
                            relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FDFBFB"));
                            tvCtn2.setText(R.string.white);
                            break;
                    }
                } catch (Exception e) {
                    relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0B0303"));
                    tvCtn2.setText(R.string.black);
                }

                try {

                    switch (a.charAt(2)) {

                        case '0':
                            relativeLayoutBand3.setBackgroundColor(Color.parseColor("#0B0303"));
                            tvCtn3.setText(R.string.black);
                            break;
                        case '1':
                            relativeLayoutBand3.setBackgroundColor(Color.parseColor("#4C1A0B"));
                            tvCtn3.setText(R.string.brown);

                            break;
                        case '2':
                            relativeLayoutBand3.setBackgroundColor(Color.parseColor("#F60202"));
                            tvCtn3.setText(R.string.red);
                            break;
                        case '3':
                            relativeLayoutBand3.setBackgroundColor(Color.parseColor("#FF5722"));
                            tvCtn3.setText(R.string.orange);
                            break;
                        case '4':
                            relativeLayoutBand3.setBackgroundColor(Color.parseColor("#FFC107"));
                            tvCtn3.setText(R.string.jaunt);
                            break;
                        case '5':
                            relativeLayoutBand3.setBackgroundColor(Color.parseColor("#0CF115"));
                            tvCtn3.setText(R.string.green);
                            break;
                        case '6':
                            relativeLayoutBand3.setBackgroundColor(Color.parseColor("#0228FA"));
                            tvCtn3.setText(R.string.blue);
                            break;
                        case '7':
                            relativeLayoutBand3.setBackgroundColor(Color.parseColor("#D703FB"));
                            tvCtn3.setText(R.string.purple);
                            break;
                        case '8':
                            relativeLayoutBand3.setBackgroundColor(Color.parseColor("#9C9A9A"));
                            tvCtn3.setText(R.string.gray);
                            break;
                        case '9':
                            relativeLayoutBand3.setBackgroundColor(Color.parseColor("#FDFBFB"));
                            tvCtn3.setText(R.string.white);
                            break;
                    }
                } catch (Exception e) {
                    relativeLayoutBand3.setBackgroundColor(Color.parseColor("#0B0303"));
                    tvCtn3.setText(R.string.black);
                }

                //pour les nombres decimale >1
                if (a.charAt(1) == '.') {
                    try {
                        switch (a.charAt(2)) {


                            case '0':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0B0303"));
                                tvCtn2.setText(R.string.black);
                                break;
                            case '1':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#4C1A0B"));
                                tvCtn2.setText(R.string.brown);

                                break;
                            case '2':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#F60202"));
                                tvCtn2.setText(R.string.red);
                                break;
                            case '3':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FF5722"));
                                tvCtn2.setText(R.string.orange);
                                break;
                            case '4':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FFC107"));
                                tvCtn2.setText(R.string.jaunt);
                                break;
                            case '5':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0CF115"));
                                tvCtn2.setText(R.string.green);
                                break;
                            case '6':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0228FA"));
                                tvCtn2.setText(R.string.blue);
                                break;
                            case '7':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#D703FB"));
                                tvCtn2.setText(R.string.purple);
                                break;
                            case '8':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#9C9A9A"));
                                tvCtn2.setText(R.string.gray);
                                break;
                            case '9':
                                relativeLayoutBand2.setBackgroundColor(Color.parseColor("#FDFBFB"));
                                tvCtn2.setText(R.string.white);

                                break;
                        }


                    } catch (Exception e) {
                        relativeLayoutBand2.setBackgroundColor(Color.parseColor("#0B0303"));
                        tvCtn2.setText(R.string.black);
                    }
                    try {
                        switch (a.charAt(3)) {


                            case '0':
                                relativeLayoutBand3.setBackgroundColor(Color.parseColor("#0B0303"));
                                tvCtn3.setText(R.string.black);
                                break;
                            case '1':
                                relativeLayoutBand3.setBackgroundColor(Color.parseColor("#4C1A0B"));
                                tvCtn3.setText(R.string.brown);

                                break;
                            case '2':
                                relativeLayoutBand3.setBackgroundColor(Color.parseColor("#F60202"));
                                tvCtn3.setText(R.string.red);
                                break;
                            case '3':
                                relativeLayoutBand3.setBackgroundColor(Color.parseColor("#FF5722"));
                                tvCtn3.setText(R.string.orange);
                                break;
                            case '4':
                                relativeLayoutBand3.setBackgroundColor(Color.parseColor("#FFC107"));
                                tvCtn3.setText(R.string.jaunt);
                                break;
                            case '5':
                                relativeLayoutBand3.setBackgroundColor(Color.parseColor("#0CF115"));
                                tvCtn3.setText(R.string.green);
                                break;
                            case '6':
                                relativeLayoutBand3.setBackgroundColor(Color.parseColor("#0228FA"));
                                tvCtn3.setText(R.string.blue);
                                break;
                            case '7':
                                relativeLayoutBand3.setBackgroundColor(Color.parseColor("#D703FB"));
                                tvCtn3.setText(R.string.purple);
                                break;
                            case '8':
                                relativeLayoutBand3.setBackgroundColor(Color.parseColor("#9C9A9A"));
                                tvCtn3.setText(R.string.gray);
                                break;
                            case '9':
                                relativeLayoutBand3.setBackgroundColor(Color.parseColor("#FDFBFB"));
                                tvCtn3.setText(R.string.white);
                                break;
                        }


                    } catch (Exception e) {
                        relativeLayoutBand3.setBackgroundColor(Color.parseColor("#0B0303"));
                        tvCtn3.setText(R.string.black);
                    }
                }

                if (valueInitial < 10) {
                    relativeLayoutBand4.setBackgroundColor(Color.parseColor("#8A8989"));
                    tvCtn4.setText(R.string.silver);
                } else if (valueInitial < 100) {
                    relativeLayoutBand4.setBackgroundColor(Color.parseColor("#B18603"));
                    tvCtn4.setText(R.string.gold);
                } else if (valueInitial < 1000) {
                    relativeLayoutBand4.setBackgroundColor(Color.parseColor("#0B0303"));
                    tvCtn4.setText(R.string.black);
                } else if (valueInitial < 10000) {
                    relativeLayoutBand4.setBackgroundColor(Color.parseColor("#4C1A0B"));
                    tvCtn4.setText(R.string.brown);
                } else if (valueInitial < 100000) {
                    relativeLayoutBand4.setBackgroundColor(Color.parseColor("#F60202"));
                    tvCtn4.setText(R.string.red);
                } else if (valueInitial < 1000000) {
                    relativeLayoutBand4.setBackgroundColor(Color.parseColor("#FF5722"));
                    tvCtn4.setText(R.string.orange);
                } else if (valueInitial < 10000000) {
                    relativeLayoutBand4.setBackgroundColor(Color.parseColor("#FFC107"));
                    tvCtn4.setText(R.string.jaunt);
                } else if (valueInitial < 100000000) {
                    relativeLayoutBand4.setBackgroundColor(Color.parseColor("#0CF115"));
                    tvCtn4.setText(R.string.green);
                }


            }


        }


    }


}