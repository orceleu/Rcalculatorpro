package com.eu.rcalculatorpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ColorToNumber extends AppCompatActivity {



  Fragment1 fragment1Action;
  Fragment2 fragment2Action;
   Fragment3 fragment3Action;
  Spinner spinner;
   List<String> name;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_to_number);

        spinner = findViewById(R.id.spinner1);
        fragment1Action = new Fragment1();
        fragment2Action = new Fragment2();
        fragment3Action = new Fragment3();

        name = new ArrayList<>();
        name.add("4 band");
        name.add("5 band");
        name.add("6 band");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(ColorToNumber.this, R.layout.item, name);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        selectfragment(fragment1Action);break;
                    case 1:
                        selectfragment(fragment2Action);break;

                    case 2:
                       selectfragment(fragment3Action);break;


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

}