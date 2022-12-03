package com.eu.rcalculatorpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Objects;

public class CalculDivers extends AppCompatActivity {
    URIP uripAction;
    LED_resistor LEDAction;
    RadioGroup radioGroup;
    RadioButton radioButtonOhmsLaw;
    RadioButton radioButtonLed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculdivers);

        radioGroup=findViewById(R.id.RadioGroup);
        radioButtonOhmsLaw=findViewById(R.id.ohmLaw);
        radioButtonLed=findViewById(R.id.LED_resistor);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Ohm law");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        uripAction = new URIP();
        LEDAction= new LED_resistor();
       selectfragment(uripAction);



        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(  radioGroup.getCheckedRadioButtonId()== R.id.ohmLaw){
                    selectfragment(uripAction );

                    }else if(radioGroup.getCheckedRadioButtonId()== R.id.LED_resistor) {selectfragment(LEDAction);

                    }

            }
        });
    }

    private void selectfragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayoutDivers,fragment);
        fragmentTransaction.commit();

    }
}