package com.eu.rcalculatorpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NumberToColor extends AppCompatActivity {


    Fragment01 fragment01Action;
    Fragment02 fragment02Action;
    Fragment03 fragment03Action;
    Spinner spinner1;
    List<String> name1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_to_color);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Number to color");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        spinner1 = findViewById(R.id.spinner2);
        fragment01Action = new Fragment01();
        fragment02Action = new Fragment02();
        fragment03Action = new Fragment03();

        name1 = new ArrayList<>();
        name1.add("4 bands");
        name1.add("5 bands");
        name1.add("6 bands");
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(NumberToColor.this, R.layout.item, name1);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        selectfragment1(fragment01Action);
                        break;
                    case 1:
                        selectfragment1(fragment02Action);
                        break;

                    case 2:
                        selectfragment1(fragment03Action);
                        break;


                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void selectfragment1(Fragment fragment1) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout1, fragment1);
        fragmentTransaction.commit();

    }
}
