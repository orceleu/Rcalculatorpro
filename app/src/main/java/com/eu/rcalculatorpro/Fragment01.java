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
    boolean v=true;

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

                func(convert, v);
            }
        });

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


        return view01;

    }

    public void func(int s, boolean x) {
        //input{{


        if ((editText01.getText().toString().isEmpty())) {
            Toast.makeText(getActivity(), "empty", Toast.LENGTH_LONG).show();
        } else {


            //input{{


            double y = Double.parseDouble(editText01.getText().toString());

            double valueinitial = y * s;
            double multiplicator = valueinitial;

            String calcul = Double.toString(valueinitial);
            String a = calcul;


            //pour la verification de l'entrer

           try {

                if (multiplicator >= 100 && a.charAt(2) != '0') { Toast.makeText(getActivity(), "erreur , la valeur la plus proche est", Toast.LENGTH_LONG).show();}
            } catch (Exception e) {
            }

     /*
            try {

                if (multiplicator >= 100 && a.charAt(3) != '0'){ Toast.makeText(getActivity(), "erreur , la valeur la plus proche est", Toast.LENGTH_LONG).show();}
            } catch (Exception e) {
            }


            try {

                if (multiplicator >= 100 && a.charAt(4) != '0'){ Toast.makeText(getActivity(), "erreur , la valeur la plus proche est", Toast.LENGTH_LONG).show();}
            } catch (Exception e) {
            }


            try {

                if (multiplicator >= 100 && a.charAt(5) != '0'){ Toast.makeText(getActivity(), "erreur , la valeur la plus proche est", Toast.LENGTH_LONG).show();}
            } catch (Exception e) {
            }


            try {

                if (a.charAt(3) != '0') { Toast.makeText(getActivity(), "erreur , la valeur la plus proche est", Toast.LENGTH_LONG).show();}
            } catch (Exception e) {
            }

            try {

                if (multiplicator >= 1 && a.charAt(2) != '0') { Toast.makeText(getActivity(), "erreur , la valeur la plus proche est", Toast.LENGTH_LONG).show();}

            } catch (Exception e) {
            }
   */

                // pour les 0.22
                if (multiplicator < 1) {


                    switch (a.charAt(2)) {

                        case '1':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#4C1A0B"));

                            break;
                        case '2':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#F60202"));
                            break;
                        case '3':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FF5722"));
                            break;
                        case '4':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FFC107"));
                            break;
                        case '5':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0CF115"));
                            break;
                        case '6':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0228FA"));
                            break;
                        case '7':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#D703FB"));
                            break;
                        case '8':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#9C9A9A"));
                            break;
                        case '9':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FDFBFB"));

                            break;

                    }

                    try {

                        switch (a.charAt(3)) {

                            case '0':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0B0303"));
                                break;
                            case '1':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#4C1A0B"));

                                break;
                            case '2':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#F60202"));
                                break;
                            case '3':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FF5722"));
                                break;
                            case '4':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FFC107"));
                                break;
                            case '5':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0CF115"));
                                break;
                            case '6':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0228FA"));
                                break;
                            case '7':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#D703FB"));
                                break;
                            case '8':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#9C9A9A"));
                                break;
                            case '9':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FDFBFB"));

                                break;
                        }
                    } catch (Exception e) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0B0303"));
                    }

                    relativeLayoutbande3.setBackgroundColor(Color.parseColor("#8A8989"));
                } else {

                    //suivant"#0B0303"
                    switch (a.charAt(0)) {
                        case '0':
                            System.out.println("noir");
                            break;
                        case '1':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#4C1A0B"));

                            break;
                        case '2':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#F60202"));
                            break;
                        case '3':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FF5722"));
                            break;
                        case '4':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FFC107"));
                            break;
                        case '5':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0CF115"));
                            break;
                        case '6':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0228FA"));
                            break;
                        case '7':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#D703FB"));
                            break;
                        case '8':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#9C9A9A"));
                            break;
                        case '9':
                            relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FDFBFB"));

                            break;
                        //  relativeLayoutbande2.setBackgroundColor(Color.parseColor("FF000000"));
                        // else if (nbre1 == 1) {
                        // relativeLayoutbande2.setBackgroundColor(Color.parseColor("#4C1A0B"));
                        //relativeLayoutbande2.setBackgroundColor(Color.parseColor("#F60202"));
                        //relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FF5722"));
                        // relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FFC107"));
                        // relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0CF115"));
                        // relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0228FA"));
                        // relativeLayoutbande2.setBackgroundColor(Color.parseColor("#D703FB"));
                        // relativeLayoutbande2.setBackgroundColor(Color.parseColor("#9C9A9A"));
                        // relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FDFBFB"));


                    }

                    try {

                        switch (a.charAt(1)) {

                            case '0':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0B0303"));
                                break;
                            case '1':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#4C1A0B"));

                                break;
                            case '2':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#F60202"));
                                break;
                            case '3':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FF5722"));
                                break;
                            case '4':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FFC107"));
                                break;
                            case '5':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0CF115"));
                                break;
                            case '6':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0228FA"));
                                break;
                            case '7':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#D703FB"));
                                break;
                            case '8':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#9C9A9A"));
                                break;
                            case '9':
                                relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FDFBFB"));

                                break;
                        }
                        //pour les 1.5
                        if (a.charAt(1) == '.') {

                            switch (a.charAt(2)) {


                                case '0':
                                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0B0303"));
                                    break;
                                case '1':
                                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#4C1A0B"));

                                    break;
                                case '2':
                                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#F60202"));
                                    break;
                                case '3':
                                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FF5722"));
                                    break;
                                case '4':
                                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FFC107"));
                                    break;
                                case '5':
                                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0CF115"));
                                    break;
                                case '6':
                                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0228FA"));
                                    break;
                                case '7':
                                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#D703FB"));
                                    break;
                                case '8':
                                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#9C9A9A"));
                                    break;
                                case '9':
                                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FDFBFB"));

                                    break;
                            }

                        }

                    } catch (Exception e) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0B0303"));
                    }


                    if (multiplicator < 1) {
                        relativeLayoutbande3.setBackgroundColor(Color.parseColor("#8A8989"));
                    } else if (multiplicator < 10) {
                        relativeLayoutbande3.setBackgroundColor(Color.parseColor("#B18603"));
                    } else if (multiplicator < 100) {
                        relativeLayoutbande3.setBackgroundColor(Color.parseColor("#0B0303"));
                    } else if (multiplicator < 1000) {
                        relativeLayoutbande3.setBackgroundColor(Color.parseColor("#4C1A0B"));
                    } else if (multiplicator < 10000) {
                        relativeLayoutbande3.setBackgroundColor(Color.parseColor("#F60202"));
                    } else if (multiplicator < 100000) {
                        relativeLayoutbande3.setBackgroundColor(Color.parseColor("#FF5722"));
                    } else if (multiplicator < 1000000) {
                        relativeLayoutbande3.setBackgroundColor(Color.parseColor("#FFC107"));
                    } else if (multiplicator < 10000000) {
                        relativeLayoutbande3.setBackgroundColor(Color.parseColor("#0CF115"));
                    }


                    System.out.println("or");
                }


            }


        }

    }





