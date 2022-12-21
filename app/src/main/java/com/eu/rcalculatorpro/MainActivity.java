package com.eu.rcalculatorpro;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity {
CardView cardView1;
CardView cardView2;
CardView smd;
CardView calculDivers;
private AlertDialog alertDialog;
private  AlertDialog.Builder builder;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



            cardView1=findViewById(R.id.colorToNumber);
            cardView2=findViewById(R.id.numberToColor);
            smd=findViewById(R.id.SMD);
            calculDivers=findViewById(R.id.CalculDivers);


        cardView1.setOnClickListener(view -> {
            Intent intent= new Intent(MainActivity.this, ColorToNumber.class);
            startActivity(intent);
        });
        cardView2.setOnClickListener(view -> {
         Intent intent = new Intent(MainActivity.this,NumberToColor.class);
          startActivity(intent);
        });

        smd.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,SmdActivity.class);
            startActivity(intent);
        });
    calculDivers.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,CalculDivers.class);
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

        if(item.getItemId()==R.id.about_us){
            builder=new AlertDialog.Builder(MainActivity.this   );
            builder.setTitle("about us");
            builder.setMessage("Our company * are committed to develop calculator for every field with our best knowledge and accuracy such as for electrical, electronics,etc." +
                    "Please give us your feedback and suggestions. " +
                    "Email address: orceleu@gmail.com");
            builder.setCancelable(true);
            builder.setPositiveButton("send feedback", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    try{

                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        intent.setData(Uri.parse("mailto:"));
                        String[] to ={"exemple@gmail.com"};
                        intent.putExtra(Intent.EXTRA_EMAIL,to);
                        intent.putExtra(Intent.EXTRA_SUBJECT,"give me your feedback");
                        intent.putExtra(Intent.EXTRA_TEXT,"here");
                        startActivity(Intent.createChooser(intent,"send email"));




                    }catch (Exception e){e.printStackTrace();}

                }
            });
            alertDialog=builder.create();
            alertDialog.show();

        }else if(item.getItemId()==R.id.rate) {
            Toast.makeText(this, "rate", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId()==R.id.share) {
            String data = "R calculator pro";
            Intent intent= new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT,data);
            startActivity(Intent.createChooser(intent,"Share using"));
        }else{
        return super.onOptionsItemSelected(item);
        }return true;
    }
}