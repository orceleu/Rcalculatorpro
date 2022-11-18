package com.eu.rcalculatorpro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.view.Menu;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CardView cardView1;
CardView cardView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            cardView1=findViewById(R.id.colorToNumber);
            cardView2=findViewById(R.id.numberToColor);
        cardView1.setOnClickListener(view -> {
            Intent intent= new Intent(MainActivity.this, ColorToNumber.class);
            startActivity(intent);
        });
        cardView2.setOnClickListener(view -> {
         Intent intent = new Intent(MainActivity.this,NumberToColor.class);
          startActivity(intent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.setting){
            Toast.makeText(this,"setting selected",Toast.LENGTH_SHORT).show();
        }else if(item.getItemId()==R.id.help){
            Toast.makeText(this,"help selected",Toast.LENGTH_SHORT).show();
        }else{
        return super.onOptionsItemSelected(item);
        }return true;
    }
}