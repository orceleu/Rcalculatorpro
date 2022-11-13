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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Fragment01 extends Fragment {

    RelativeLayout relativeLayoutbande1;
    RelativeLayout relativeLayoutbande2;
    RelativeLayout relativeLayoutbande3;
    RelativeLayout relativeLayoutbande4;

    EditText editText01;
    Button button01;
    Spinner spinner01;
    List<String> name01;
    int convert;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view01 = inflater.inflate(R.layout.fragment_01, container, false);


        //put the code here

        relativeLayoutbande1 = view01.findViewById(R.id.value_color1band);
        relativeLayoutbande2 = view01.findViewById(R.id.value_color2band);
        relativeLayoutbande3 = view01.findViewById(R.id.value_color3band);
        relativeLayoutbande4 = view01.findViewById(R.id.value_color4band);
        editText01 = view01.findViewById(R.id.editText);
        button01 = view01.findViewById(R.id.buttonCompute);
        spinner01 = view01.findViewById(R.id.selector);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                func(convert);}});

        name01 = new ArrayList<>();
        name01.add("ohm");
        name01.add("kohms");
        name01.add("megaohms");
        ArrayAdapter<String> arrayAdapter01 = new ArrayAdapter<>(getActivity(), R.layout.item01, name01);
        arrayAdapter01.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner01.setAdapter(arrayAdapter01);

        spinner01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        convert=1;
                        break;
                    case 1:
                        convert=1000;
                        break;

                    case 2:
                        convert=1000000;
                        break;


                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });








        return view01;

    }

    public void func(int s) {
        //input{{


        if ((editText01.getText().toString().isEmpty())) {
            Toast.makeText(getActivity(), "empty", Toast.LENGTH_LONG).show();
        } else {


            //input{{


            double y = Double.parseDouble(editText01.getText().toString());
            double x = s * y;

            if (x < 10) {

                //pour les valeurs improbable
                if (x != 2.2 && x != 3.3 && x != 1 && x != 0.47 && x != 4.7 && x != 2.5) {
                    System.out.println("valeur improbable!!");
                } else {

                    if (x == 0.47) System.out.println("jaune violet argent");
                    if (x == 1) System.out.println("marron noir noir ");
                    if (x == 2.2) System.out.println("rouge rouge or or");
                    if (x == 2.5) System.out.println("rouge vert or");
                    if (x == 3.3) System.out.println("orange orange noir");
                    if (x == 4.7) System.out.println("jaune violet noir");
                }


            } else {

                int a = (int) Math.round(x);

                Integer num1 = a;
                Integer[] digitss = getDigits(num1.toString());
                if (a < 10) {

                    int b1 = digitss[0];
                    switch (b1) {
                        case 1:
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#4C1A0B"));
                            break;
                        case 2:
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#F60202"));
                            break;
                        case 3:
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FF5722"));
                            break;
                        case 4:
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FFC107"));
                            break;
                        case 5:
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0CF115"));
                            break;
                        case 6:
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0228FA"));
                            break;
                        case 7:
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#D703FB"));
                            break;
                        case 8:
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#9C9A9A"));
                            break;
                        case 9:
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FDFBFB"));
                            break;
                    }


                } else {


                    if (a > 10 && a < 100) {
                        int nbre04 = digitss[0];

                        switch (nbre04) {
                            case 1:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#4C1A0B"));
                                break;
                            case 2:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#F60202"));
                                break;
                            case 3:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FF5722"));
                                break;
                            case 4:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FFC107"));
                                break;
                            case 5:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0CF115"));
                                break;
                            case 6:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0228FA"));
                                break;
                            case 7:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#D703FB"));
                                break;
                            case 8:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#9C9A9A"));
                                break;
                            case 9:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FDFBFB"));
                                break;
                        }
                        // 2eme bande
                        int nbre1 = digitss[1];
                        switch (nbre1) {
                            case 1:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#4C1A0B"));
                                break;
                            case 2:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#F60202"));
                                break;
                            case 3:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FF5722"));
                                break;
                            case 4:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FFC107"));
                                break;
                            case 5:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0CF115"));
                                break;
                            case 6:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0228FA"));
                                break;
                            case 7:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#D703FB"));
                                break;
                            case 8:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#9C9A9A"));
                                break;
                            case 9:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FDFBFB"));
                                break;
                            case 0:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0B0303"));
                                break;
                        }


                    }
                    if (a > 99) {
                        Integer num = a;
                        Integer[] digits = getDigits(num.toString());

                        relativeLayoutbande1.setBackgroundColor(Color.parseColor("#4C1A0B"));
                        //1er bande
                        int nbre = digits[0];

                        switch (nbre) {
                            case 1:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#4C1A0B"));
                                break;
                            case 2:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#F60202"));
                                break;
                            case 3:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FF5722"));
                                break;
                            case 4:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FFC107"));
                                break;
                            case 5:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0CF115"));
                                break;
                            case 6:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0228FA"));
                                break;
                            case 7:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#D703FB"));
                                break;
                            case 8:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#9C9A9A"));
                                break;
                            case 9:
                                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FDFBFB"));
                                break;
                        }
                        // 2eme bande
                        int nbre11 = digits[1];
                        switch (nbre11) {
                            case 1:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#4C1A0B"));
                                break;
                            case 2:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#F60202"));
                                break;
                            case 3:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FF5722"));
                                break;
                            case 4:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FFC107"));
                                break;
                            case 5:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0CF115"));
                                break;
                            case 6:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0228FA"));
                                break;
                            case 7:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#D703FB"));
                                break;
                            case 8:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#9C9A9A"));
                                break;
                            case 9:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FDFBFB"));
                                break;
                            case 0:
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0B0303"));
                                break;

                        }


                        //bande multiplicatrice
                        if (num < 1000) {
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#4C1A0B"));
                        } else if (num < 10000) {
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#F60202"));
                        } else if (num < 100000) {
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#FF5722"));
                        } else if (num < 1000000) {
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#FFC107"));
                        } else if (num < 10000000) {
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#0CF115"));
                        } else if (num < 100000000) {
                            relativeLayoutbande3.setBackgroundColor(Color.parseColor("#0228FA"));
                        }

                    }
                }
            }
        }
    }

    //fonction pou separe chaque chiffre
    public static Integer[] getDigits (String number){
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            digits.add(j);
        }
        return digits.toArray(new Integer[]{});

    }

}
