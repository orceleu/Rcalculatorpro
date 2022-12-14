package com.eu.rcalculatorpro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NumberToColor extends AppCompatActivity {


    FourBandsValue fourBandsValueAction;
    FiveBandsValue fiveBandsValueAction;
    SixBandsValue sixBandsValueAction;
    Spinner spinner1;
    List<String> name1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_to_color);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Number to color");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        spinner1 = findViewById(R.id.spinner2);
        fourBandsValueAction = new FourBandsValue();
        fiveBandsValueAction = new FiveBandsValue();
        sixBandsValueAction = new SixBandsValue();

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
                        selectfragment1(fourBandsValueAction);
                        break;
                    case 1:
                        selectfragment1(fiveBandsValueAction);
                        break;

                    case 2:
                        selectfragment1(sixBandsValueAction);
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenuntc,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.about){
            Toast.makeText(this,"about selected",Toast.LENGTH_SHORT).show();
        }else if(item.getItemId()==R.id.colorToValue) {
            Intent intent=new Intent(this,ColorToNumber.class);startActivity(intent);finish();
        }else if(item.getItemId()==R.id.smdNtc) {
            Intent intent=new Intent(this,SmdActivity.class);startActivity(intent);finish();

        }else{
            return super.onOptionsItemSelected(item);
        }return true;
    }
}
