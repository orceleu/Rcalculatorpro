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

public class Fragment02 extends Fragment {
    private RelativeLayout relativeLayoutbande1;
    private RelativeLayout relativeLayoutbande2;
    private RelativeLayout relativeLayoutbande3;
    private RelativeLayout relativeLayoutbande4;
    private RelativeLayout relativeLayoutbande5;
    private TextView tvCtn1, tvCtn2, tvCtn3, tvCtn4, tvCtn5;
    private EditText editText01;
    private int convert;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view02 = inflater.inflate(R.layout.fragment_02, container, false);


        relativeLayoutbande1 = view02.findViewById(R.id.value_color01band);
        relativeLayoutbande2 = view02.findViewById(R.id.value_color02band);
        relativeLayoutbande3 = view02.findViewById(R.id.value_color03band);
        relativeLayoutbande4 = view02.findViewById(R.id.value_color04band);
        relativeLayoutbande5 = view02.findViewById(R.id.value_color05band);
        tvCtn1 = view02.findViewById(R.id.tvctn01);
        tvCtn2 = view02.findViewById(R.id.tvctn02);
        tvCtn3 = view02.findViewById(R.id.tvctn03);
        tvCtn4 = view02.findViewById(R.id.tvctn04);
        tvCtn5 = view02.findViewById(R.id.tvctn05);
        editText01 = view02.findViewById(R.id.editText02);
        Button button01 = view02.findViewById(R.id.buttonCompute02);
        Spinner spinner01 = view02.findViewById(R.id.selector02);
        Spinner spinner02 = view02.findViewById(R.id.tolerancectn02);

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
                                                            relativeLayoutbande5.setBackgroundColor(Color.parseColor("#B18603"));
                                                            tvCtn5.setText("");

                                                            break;
                                                        case 1:
                                                            relativeLayoutbande5.setBackgroundColor(Color.parseColor("#8A8989"));
                                                            tvCtn5.setText("silver");
                                                            break;

                                                        case 2:
                                                            relativeLayoutbande5.setBackgroundColor(Color.parseColor("#B18603"));
                                                            tvCtn5.setText("gold");

                                                            break;
                                                    }
                                                }

                                                @Override
                                                public void onNothingSelected(AdapterView<?> adapterView) {
                                                    relativeLayoutbande5.setBackgroundColor(Color.parseColor("#B18603"));
                                                    tvCtn5.setText("gold");

                                                }
                                            }


        );


        return view02;

    }


    private void func(int s) {
        //input{{
        if ((editText01.getText().toString().isEmpty())) {
            Toast.makeText(getActivity(), "empty", Toast.LENGTH_LONG).show();

        } else {
            double y = Double.parseDouble(editText01.getText().toString());
            double valueinitial = y * s;
            String a = Double.toString(valueinitial);

            if (valueinitial < 1) {
                Toast.makeText(getActivity(), "error", Toast.LENGTH_LONG).show();

            } else {
                //pour la verification de l'entrer

                try {
                    if (valueinitial >= 1000 && a.charAt(3) != '0') {
                        Toast.makeText(getActivity(), "wong code, closest resistor is...", Toast.LENGTH_LONG).show();
                    }
                } catch (Exception ignored) {
                }


                switch (a.charAt(0)) {

                    case '1':
                        relativeLayoutbande1.setBackgroundColor(Color.parseColor("#4C1A0B"));
                        tvCtn1.setText("brown");

                        break;
                    case '2':
                        relativeLayoutbande1.setBackgroundColor(Color.parseColor("#F60202"));
                        tvCtn1.setText("red");
                        break;
                    case '3':
                        relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FF5722"));
                        tvCtn1.setText("orange");
                        break;
                    case '4':
                        relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FFC107"));
                        tvCtn1.setText("jaunt");
                        break;
                    case '5':
                        relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0CF115"));
                        tvCtn1.setText("green");
                        break;
                    case '6':
                        relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0228FA"));
                        tvCtn1.setText("blue");
                        break;
                    case '7':
                        relativeLayoutbande1.setBackgroundColor(Color.parseColor("#D703FB"));
                        tvCtn1.setText("purple");
                        break;
                    case '8':
                        relativeLayoutbande1.setBackgroundColor(Color.parseColor("#9C9A9A"));
                        tvCtn1.setText("gray");
                        break;
                    case '9':
                        relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FDFBFB"));
                        tvCtn1.setText("white");
                        break;
                }

                    try {

                        switch (a.charAt(1)) {

                            case '0':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0B0303"));
                                tvCtn2.setText("black");
                                break;
                            case '1':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#4C1A0B"));
                                tvCtn2.setText("brown");
                                break;
                            case '2':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#F60202"));
                                tvCtn2.setText("red");
                                break;
                            case '3':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FF5722"));
                                tvCtn2.setText("orange");
                                break;
                            case '4':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FFC107"));
                                tvCtn2.setText("jaunt");
                                break;
                            case '5':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0CF115"));
                                tvCtn2.setText("green");
                                break;
                            case '6':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0228FA"));
                                tvCtn2.setText("blue");
                                break;
                            case '7':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#D703FB"));
                                tvCtn2.setText("purple");
                                break;
                            case '8':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#9C9A9A"));
                                tvCtn2.setText("gray");
                                break;
                            case '9':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FDFBFB"));
                                tvCtn2.setText("white");
                                break;
                        }
                    } catch (Exception e) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0B0303"));
                        tvCtn2.setText("black");}

                try {

                    switch (a.charAt(2)) {

                        case '0':
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#0B0303"));
                            tvCtn3.setText("black");
                            break;
                        case '1':
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#4C1A0B"));
                            tvCtn3.setText("brown");

                            break;
                        case '2':
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#F60202"));
                            tvCtn3.setText("red");
                            break;
                        case '3':
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#FF5722"));
                            tvCtn3.setText("orange");
                            break;
                        case '4':
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#FFC107"));
                            tvCtn3.setText("jaunt");
                            break;
                        case '5':
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#0CF115"));
                            tvCtn3.setText("green");
                            break;
                        case '6':
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#0228FA"));
                            tvCtn3.setText("blue");
                            break;
                        case '7':
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#D703FB"));
                            tvCtn3.setText("purple");
                            break;
                        case '8':
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#9C9A9A"));
                            tvCtn3.setText("gray");
                            break;
                        case '9':
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#FDFBFB"));
                            tvCtn3.setText("white");
                            break;
                    }
                } catch (Exception e) {
                    relativeLayoutbande3.setBackgroundColor(Color.parseColor("#0B0303"));
                    tvCtn3.setText("black");
                }

                //pour les nombres decimale >1
                if (a.charAt(1) == '.') {
                    try {
                        switch (a.charAt(2)) {


                            case '0':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0B0303"));
                                tvCtn2.setText("black");
                                break;
                            case '1':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#4C1A0B"));
                                tvCtn2.setText("brown");

                                break;
                            case '2':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#F60202"));
                                tvCtn2.setText("red");
                                break;
                            case '3':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FF5722"));
                                tvCtn2.setText("orange");
                                break;
                            case '4':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FFC107"));
                                tvCtn2.setText("jaunt");
                                break;
                            case '5':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0CF115"));
                                tvCtn2.setText("green");
                                break;
                            case '6':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0228FA"));
                                tvCtn2.setText("blue");
                                break;
                            case '7':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#D703FB"));
                                tvCtn2.setText("purple");
                                break;
                            case '8':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#9C9A9A"));
                                tvCtn2.setText("gray");
                                break;
                            case '9':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FDFBFB"));
                                tvCtn2.setText("white");

                                break;
                        }


                    } catch (Exception e) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0B0303"));
                        tvCtn2.setText("black");
                    }
                    try {
                        switch (a.charAt(3)) {


                            case '0':
                                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#0B0303"));
                                tvCtn3.setText("black");
                                break;
                            case '1':
                                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#4C1A0B"));
                                tvCtn3.setText("brown");

                                break;
                            case '2':
                                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#F60202"));
                                tvCtn3.setText("red");
                                break;
                            case '3':
                                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#FF5722"));
                                tvCtn3.setText("orange");
                                break;
                            case '4':
                                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#FFC107"));
                                tvCtn3.setText("jaunt");
                                break;
                            case '5':
                                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#0CF115"));
                                tvCtn3.setText("green");
                                break;
                            case '6':
                                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#0228FA"));
                                tvCtn3.setText("blue");
                                break;
                            case '7':
                                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#D703FB"));
                                tvCtn3.setText("purple");
                                break;
                            case '8':
                                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#9C9A9A"));
                                tvCtn3.setText("gray");
                                break;
                            case '9':
                                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#FDFBFB"));
                                tvCtn3.setText("white");

                                break;
                        }


                    } catch (Exception e) {
                        relativeLayoutbande3.setBackgroundColor(Color.parseColor("#0B0303"));
                        tvCtn3.setText("black");
                    }
                }

                if (valueinitial < 10) {
                    relativeLayoutbande4.setBackgroundColor(Color.parseColor("#8A8989"));
                    tvCtn4.setText("silver");
                } else if (valueinitial < 100) {
                    relativeLayoutbande4.setBackgroundColor(Color.parseColor("##B18603"));
                    tvCtn4.setText("gold");
                } else if (valueinitial < 1000) {
                    relativeLayoutbande4.setBackgroundColor(Color.parseColor("#0B0303"));
                    tvCtn4.setText("black");
                } else if (valueinitial < 10000) {
                    relativeLayoutbande4.setBackgroundColor(Color.parseColor("#4C1A0B"));
                    tvCtn4.setText("brown");
                } else if (valueinitial < 100000) {
                    relativeLayoutbande4.setBackgroundColor(Color.parseColor("#F60202"));
                    tvCtn4.setText("red");
                } else if (valueinitial < 1000000) {
                    relativeLayoutbande4.setBackgroundColor(Color.parseColor("#FF5722"));
                    tvCtn4.setText("orange");
                } else if (valueinitial < 10000000) {
                    relativeLayoutbande4.setBackgroundColor(Color.parseColor("#FFC107"));
                    tvCtn4.setText("jaunt");
                }


            }


        }


    }

}