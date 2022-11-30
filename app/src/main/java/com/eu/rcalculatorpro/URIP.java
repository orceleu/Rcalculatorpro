package com.eu.rcalculatorpro;

import android.os.Bundle;
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
     double tension;
     double resistance;
     double intensite;
     double power;

    private static double resistance3(double p, double i) {
        return p / (i * i);
    }

    private static double resistance2(double u, double p) {
        return (u * u) / p;
    }

    private static double power3(double u, double r) {
        return (u * u) / r;
    }

    private static double power2(double r, double i) {
        return r * (i * i);
    }

    private static double current3(double p, double u) {
        return p / u;
    }

    private static double current2(double p, double r) {
        return Math.sqrt(p / r);
    }

    private static double voltage3(double p, double i) {
        return p / i;
    }

    private static double voltage2(double p, double r) {
        return Math.sqrt(p * r);
    }

    private static double resistance1(double u, double i) {
        return u / i;
    }

    private static double power1(double u, double i) {
        return u * i;
    }

    private static double current1(double u, double r) {
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
        buttonComputeURI.setOnClickListener(view -> {


            if (editTextW.getText().toString().isEmpty() &&
                    editTextI.getText().toString().isEmpty() &&
                    editTextR.getText().toString().isEmpty() &&
                    editTextU.getText().toString().isEmpty()) {

                Toast.makeText(getActivity(), "enter min: two value", Toast.LENGTH_SHORT).show();
            } else {
               try{
                 tension = Double.parseDouble(editTextU.getText().toString());}catch (Exception e){};
               try{
                 resistance = Double.parseDouble(editTextR.getText().toString());}catch (Exception e){};
               try{
                intensite = Double.parseDouble(editTextI.getText().toString());}catch (Exception e){};
               try {
                    power = Double.parseDouble(editTextW.getText().toString());
               }catch (Exception e){};





                if (editTextU.getText().toString().isEmpty()) {
                    double voltage1 = voltage1(resistance, intensite);
                    double voltage2 = voltage2(power, resistance);
                    double voltage3 = voltage3(power, intensite);



                    if (editTextW.getText().toString().isEmpty()) {
                        try {
                        editTextU.setText(String.valueOf(voltage1));
                        editTextW.setText(String.valueOf( power1(voltage1, intensite)));}catch (Exception e){}
                    }
                  else if (editTextI.getText().toString().isEmpty()) {try {
                        editTextU.setText(String.valueOf(voltage2));
                        editTextI.setText(String.valueOf(current1(voltage2, resistance)));}catch (Exception e){}
                    } else if (editTextR.getText().toString().isEmpty()) {try{
                        editTextU.setText(String.valueOf(voltage3));
                        editTextR.setText(String.valueOf(resistance1(voltage3, intensite)));}catch (Exception e){}
                    }

                } else if (editTextI.getText().toString().isEmpty()) {


                    double current1 = current1(tension, resistance);
                    double current2 = current2(power, resistance);
                    double current3 = current3(power, tension);
                    if (editTextW.getText().toString().isEmpty()) {try{
                        editTextI.setText(String.valueOf( current1));
                        editTextW.setText(String.valueOf( power2(resistance, current1)));}catch (Exception e){}
                    } else if (editTextU.getText().toString().isEmpty()) {try{
                        editTextI.setText(String.valueOf(current2));
                        editTextU.setText(String.valueOf( voltage1(resistance, current2)));}catch (Exception e){}
                    } else if (editTextR.getText().toString().isEmpty()) {try{
                        editTextI.setText(String.valueOf( current3));
                        editTextR.setText(String.valueOf( resistance3(power, current3)));}catch (Exception e){}
                    }

                } else if (editTextW.getText().toString().isEmpty()) {


                    double power1 = power1(tension, intensite);
                    double power2 = power2(resistance, intensite);
                    double power3 = power3(tension, resistance);
                    if (editTextR.getText().toString().isEmpty()) {try{
                        editTextW.setText(String.valueOf( power1));
                        editTextR.setText(String.valueOf( resistance2(tension, power1)));}catch (Exception e){}
                    } else if (editTextU.getText().toString().isEmpty()) {try{
                        editTextW.setText(String.valueOf(power2));
                        editTextU.setText(String.valueOf( voltage2(power2, resistance)));}catch (Exception e){}
                    } else if (editTextI.getText().toString().isEmpty()) {try{
                        editTextW.setText(String.valueOf(power3));
                        editTextI.setText(String.valueOf(current3(power3, tension)));}catch (Exception e){}
                    }

                } else if (editTextR.getText().toString().isEmpty()) {


                    double resistance1 = resistance1(tension, intensite);
                    double resistance2 = resistance2(tension, power);
                    double resistance3 = resistance3(power, intensite);
                    if (editTextW.getText().toString().isEmpty()) {try{
                        editTextR.setText(String.valueOf(resistance1));
                        editTextW.setText(String.valueOf( power2(resistance1, intensite)));}catch (Exception e){}
                    } else if (editTextI.getText().toString().isEmpty()) {try{
                        editTextR.setText(String.valueOf( resistance2));
                        editTextI.setText(String.valueOf( current2(power, resistance2)));}catch (Exception e){}
                    } else if (editTextU.getText().toString().isEmpty()) {try{
                        editTextR.setText(String.valueOf( resistance3));
                        editTextU.setText(String.valueOf( voltage1(resistance3, intensite)));}catch (Exception e){}
                    }

                }

            }
        });


        return view7;
    }


}