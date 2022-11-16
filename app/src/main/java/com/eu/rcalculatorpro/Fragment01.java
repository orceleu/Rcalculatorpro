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
    int x;
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
            double a = s * y;


            double num3 = a * 100;
            double num2 = a * 10;
            double num1 = a;

            Double[] digitss = getDigits(Double.toString(num1));
            Double[] digits = getDigits(Double.toString(num2));
            Double[] digit = getDigits(Double.toString(num3));





            if (a < 1) {
                Double b1 = digit[0];
                if (b1 == 1) {
                    relativeLayoutbande1.setBackgroundColor(Color.parseColor("#4C1A0B"));
                } else if (b1 == 2) {
                    relativeLayoutbande1.setBackgroundColor(Color.parseColor("#F60202"));
                } else if (b1 == 3) {
                    relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FF5722"));
                } else if (b1 == 4) {
                    relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FFC107"));
                } else if (b1 == 5) {
                    relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0CF115"));
                } else if (b1 == 6) {
                    relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0228FA"));
                } else if (b1 == 7) {
                    relativeLayoutbande1.setBackgroundColor(Color.parseColor("#D703FB"));
                } else if (b1 == 8) {
                    relativeLayoutbande1.setBackgroundColor(Color.parseColor("#9C9A9A"));
                } else if (b1 == 9) {
                    relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FDFBFB"));
                }


                try {



                    Double nbre1 = digit[1];

                      if (nbre1 ==null) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("FF000000"));
                    }
                       else if (nbre1 == 1) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#4C1A0B"));
                    } else if (nbre1 == 2) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#F60202"));
                    } else if (nbre1 == 3) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FF5722"));
                    } else if (nbre1 == 4) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FFC107"));
                    } else if (nbre1 == 5) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0CF115"));
                    } else if (nbre1 == 6) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0228FA"));
                    } else if (nbre1 == 7) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#D703FB"));
                    } else if (nbre1 == 8) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#9C9A9A"));
                    } else if (nbre1 == 9) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FDFBFB"));
                    }


                } catch (Exception ee) {
                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("FF000000"));                }


            }
            Double b1 = digitss[0];
            if (b1 == 1) {
                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#4C1A0B"));
            } else if (b1 == 2) {
                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#F60202"));
            } else if (b1 == 3) {
                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FF5722"));
            } else if (b1 == 4) {
                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FFC107"));
            } else if (b1 == 5) {
                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0CF115"));
            } else if (b1 == 6) {
                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#0228FA"));
            } else if (b1 == 7) {
                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#D703FB"));
            } else if (b1 == 8) {
                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#9C9A9A"));
            } else if (b1 == 9) {
                relativeLayoutbande1.setBackgroundColor(Color.parseColor("#FDFBFB"));
            }
            try {
                if (a < 10) {

                    Double nbre1 = digits[1];
                     if (nbre1 == null) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("FF000000"));
                    }
                   else if (nbre1 == 1) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#4C1A0B"));
                    } else if (nbre1 == 2) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#F60202"));
                    } else if (nbre1 == 3) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FF5722"));
                    } else if (nbre1 == 4) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FFC107"));
                    } else if (nbre1 == 5) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0CF115"));
                    } else if (nbre1 == 6) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0228FA"));
                    } else if (nbre1 == 7) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#D703FB"));
                    } else if (nbre1 == 8) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#9C9A9A"));
                    } else if (nbre1 == 9) {
                        relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FDFBFB"));
                    }

                }
                Double nbre1 = digitss[1];
                if (nbre1 ==null) {
                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("FF000000"));
                }
                else if (nbre1 == 1) {
                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#4C1A0B"));
                } else if (nbre1 == 2) {
                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#F60202"));
                } else if (nbre1 == 3) {
                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FF5722"));
                } else if (nbre1 == 4) {
                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FFC107"));
                } else if (nbre1 == 5) {
                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0CF115"));
                } else if (nbre1 == 6) {
                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#0228FA"));
                } else if (nbre1 == 7) {
                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#D703FB"));
                } else if (nbre1 == 8) {
                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#9C9A9A"));
                } else if (nbre1 == 9) {
                    relativeLayoutbande2.setBackgroundColor(Color.parseColor("#FDFBFB"));
                }
            } catch (Exception e) {
                relativeLayoutbande2.setBackgroundColor(Color.parseColor("FF000000"));
            }

            if (num1 < 1) {
                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#8A8989"));
            } else if (num1 < 10) {
                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#B18603"));
            } else if (num1 < 100) {
                relativeLayoutbande3.setBackgroundColor(Color.parseColor("FF000000"));
            } else if (num1 < 1000) {
                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#4C1A0B"));
            } else if (num1 < 10000) {
                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#F60202"));
            } else if (num1 < 100000) {
                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#FF5722"));
            } else if (num1 < 1000000) {
                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#FFC107"));
            } else if (num1 < 10000000) {
                relativeLayoutbande3.setBackgroundColor(Color.parseColor("#0CF115"));
            }

            relativeLayoutbande4.setBackgroundColor(Color.parseColor("#B18603"));

        }

    }

            //fonction pou separe chaque chiffre
            public static Double[] getDigits (String number){
                List<Double> digits = new ArrayList<>();
                for (int i = 0; i < number.length(); i++) {
                    double j = Character.digit(number.charAt(i), 10);
                    digits.add(j);
                }
                return digits.toArray(new Double[]{});


            }


        }
