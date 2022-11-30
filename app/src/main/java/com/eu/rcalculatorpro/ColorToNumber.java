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

public class ColorToNumber extends AppCompatActivity {



  FourBandsColor fourBandsColorAction;
  FiveBandsColor fiveBandsColorAction;
   SixBandsColor sixBandsColorAction;
  Spinner spinner;
   List<String> name;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_to_number);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Color to number");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spinner = findViewById(R.id.spinner1);
        fourBandsColorAction = new FourBandsColor();
        fiveBandsColorAction = new FiveBandsColor();
        sixBandsColorAction = new SixBandsColor();

        name = new ArrayList<>();
        name.add("4 bands");
        name.add("5 bands");
        name.add("6 bands");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(ColorToNumber.this, R.layout.item, name);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        selectfragment(fourBandsColorAction);break;
                    case 1:
                        selectfragment(fiveBandsColorAction);break;

                    case 2:
                       selectfragment(sixBandsColorAction);break;


                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

  private void selectfragment(Fragment fragment) {

    FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
    fragmentTransaction.replace(R.id.frameLayout,fragment);
    fragmentTransaction.commit();

  }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenuctn,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.about){
            Toast.makeText(this,"about selected",Toast.LENGTH_SHORT).show();
        }else if(item.getItemId()==R.id.valueToColorCtn) {
            Intent intent=new Intent(this,NumberToColor.class);startActivity(intent);finish();
        }else if(item.getItemId()==R.id.smdCtn) {
            Intent intent=new Intent(this,SmdActivity.class);startActivity(intent);finish();

        }else{
            return super.onOptionsItemSelected(item);
        }return true;
    }
}