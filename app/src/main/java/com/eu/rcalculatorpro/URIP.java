package com.eu.rcalculatorpro;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class URIP extends Fragment {

    EditText editTextU, editTextR, editTextI, editTextW;
    Button buttonComputeURI;
    Button buttonClearURI;
    double tension;
    double resistance;
    double intensite;
    double power;
    String color = "#0B0303";

    private double resistance3(double p, double i) {
        return p / (i * i);
    }

    private double resistance2(double u, double p) {
        return (u * u) / p;
    }

    private double power3(double u, double r) {
        return (u * u) / r;
    }

    private double power2(double r, double i) {
        return r * (i * i);
    }

    private double current3(double p, double u) {
        return p / u;
    }

    private double current2(double p, double r) {
        return Math.sqrt(p / r);
    }

    private double voltage3(double p, double i) {
        return p / i;
    }

    private double voltage2(double p, double r) {
        return Math.sqrt(p * r);
    }

    private double resistance1(double u, double i) {
        return u / i;
    }

    private double power1(double u, double i) {
        return u * i;
    }

    private double current1(double u, double r) {
        return u / r;
    }

    private static double voltage1(double r, double i) {
        return r * i;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view7 = inflater.inflate(R.layout.fragment_u_r_i_p, container, false);
        editTextU = view7.findViewById(R.id.voltage);
        editTextR = view7.findViewById(R.id.resistance);
        editTextI = view7.findViewById(R.id.current);
        editTextW = view7.findViewById(R.id.wattage);
        buttonComputeURI = view7.findViewById(R.id.computeURIP);
        buttonClearURI = view7.findViewById(R.id.ClearURIP);

        editTextU.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                editTextU.setTextColor(Color.parseColor(color));

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editTextR.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                editTextR.setTextColor(Color.parseColor(color));

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editTextI.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                editTextI.setTextColor(Color.parseColor(color));

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editTextW.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                editTextW.setTextColor(Color.parseColor(color));

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        buttonClearURI.setOnClickListener(view -> {
            color = "#0B0303";
            editTextU.setText("");
            editTextR.setText("");
            editTextI.setText("");
            editTextW.setText("");
        });
        buttonComputeURI.setOnClickListener(view -> {
            if (editTextW.getText().toString().isEmpty() &&
                    editTextI.getText().toString().isEmpty() &&
                    editTextR.getText().toString().isEmpty() &&
                    editTextU.getText().toString().isEmpty()) {

                Toast.makeText(getActivity(), "enter min: two value", Toast.LENGTH_SHORT).show();
            } else {
                color = "#F60202";
                try {
                    tension = Double.parseDouble(editTextU.getText().toString());
                } catch (Exception ignored) {
                }

                try {
                    resistance = Double.parseDouble(editTextR.getText().toString());
                } catch (Exception ignored) {
                }

                try {
                    intensite = Double.parseDouble(editTextI.getText().toString());
                } catch (Exception ignored) {
                }

                try {
                    power = Double.parseDouble(editTextW.getText().toString());
                } catch (Exception ignored) {
                }


                if (editTextU.getText().toString().isEmpty()) {
                    double voltage1 = voltage1(resistance, intensite);
                    double voltage2 = voltage2(power, resistance);
                    double voltage3 = voltage3(power, intensite);


                    if (editTextW.getText().toString().isEmpty()) {

                        editTextU.setTextColor(Color.parseColor(color));
                        editTextW.setTextColor(Color.parseColor(color));
                        editTextU.setText(String.valueOf(voltage1));
                        editTextW.setText(String.valueOf(power1(voltage1, intensite)));

                    } else if (editTextI.getText().toString().isEmpty()) {

                        editTextU.setTextColor(Color.parseColor(color));
                        editTextI.setTextColor(Color.parseColor(color));
                        editTextU.setText(String.valueOf(voltage2));
                        editTextI.setText(String.valueOf(current1(voltage2, resistance)));

                    } else if (editTextR.getText().toString().isEmpty()) {

                        editTextU.setTextColor(Color.parseColor(color));
                        editTextR.setTextColor(Color.parseColor(color));
                        editTextU.setText(String.valueOf(voltage3));
                        editTextR.setText(String.valueOf(resistance1(voltage3, intensite)));

                    }

                } else if (editTextI.getText().toString().isEmpty()) {


                    double current1 = current1(tension, resistance);
                    double current2 = current2(power, resistance);
                    double current3 = current3(power, tension);
                    if (editTextW.getText().toString().isEmpty()) {

                        editTextI.setTextColor(Color.parseColor(color));
                        editTextW.setTextColor(Color.parseColor(color));
                        editTextI.setText(String.valueOf(current1));
                        editTextW.setText(String.valueOf(power2(resistance, current1)));

                    } else if (editTextU.getText().toString().isEmpty()) {

                        editTextI.setTextColor(Color.parseColor(color));
                        editTextU.setTextColor(Color.parseColor(color));
                        editTextI.setText(String.valueOf(current2));
                        editTextU.setText(String.valueOf(voltage1(resistance, current2)));

                    } else if (editTextR.getText().toString().isEmpty()) {

                        editTextI.setTextColor(Color.parseColor(color));
                        editTextR.setTextColor(Color.parseColor(color));
                        editTextI.setText(String.valueOf(current3));
                        editTextR.setText(String.valueOf(resistance3(power, current3)));

                    }

                } else if (editTextW.getText().toString().isEmpty()) {


                    double power1 = power1(tension, intensite);
                    double power2 = power2(resistance, intensite);
                    double power3 = power3(tension, resistance);
                    if (editTextR.getText().toString().isEmpty()) {

                        editTextW.setTextColor(Color.parseColor(color));
                        editTextR.setTextColor(Color.parseColor(color));
                        editTextW.setText(String.valueOf(power1));
                        editTextR.setText(String.valueOf(resistance2(tension, power1)));

                    } else if (editTextU.getText().toString().isEmpty()) {

                        editTextW.setTextColor(Color.parseColor(color));
                        editTextU.setTextColor(Color.parseColor(color));
                        editTextW.setText(String.valueOf(power2));
                        editTextU.setText(String.valueOf(voltage2(power2, resistance)));


                    } else if (editTextI.getText().toString().isEmpty()) {

                        editTextW.setTextColor(Color.parseColor(color));
                        editTextI.setTextColor(Color.parseColor(color));
                        editTextW.setText(String.valueOf(power3));
                        editTextI.setText(String.valueOf(current3(power3, tension)));

                    }

                } else if (editTextR.getText().toString().isEmpty()) {


                    double resistance1 = resistance1(tension, intensite);
                    double resistance2 = resistance2(tension, power);
                    double resistance3 = resistance3(power, intensite);
                    if (editTextW.getText().toString().isEmpty()) {

                        editTextR.setTextColor(Color.parseColor(color));
                        editTextW.setTextColor(Color.parseColor(color));
                        editTextR.setText(String.valueOf(resistance1));
                        editTextW.setText(String.valueOf(power2(resistance1, intensite)));

                    } else if (editTextI.getText().toString().isEmpty()) {

                        editTextR.setTextColor(Color.parseColor(color));
                        editTextI.setTextColor(Color.parseColor(color));
                        editTextR.setText(String.valueOf(resistance2));
                        editTextI.setText(String.valueOf(current2(power, resistance2)));

                    } else if (editTextU.getText().toString().isEmpty()) {

                        editTextR.setTextColor(Color.parseColor(color));
                        editTextU.setTextColor(Color.parseColor(color));
                        editTextR.setText(String.valueOf(resistance3));
                        editTextU.setText(String.valueOf(voltage1(resistance3, intensite)));

                    }

                }

            }
        });


        return view7;
    }


}