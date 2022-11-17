package com.eu.rcalculatorpro;

import android.graphics.Color;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
public class Fragment1 extends Fragment {

    TextView tv_1;
    TextView tv_point;
    TextView tv_2;
    TextView tv_multip1;
    TextView tv_ohms1;
    TextView tv_pourcentage;
    TextView tv_pointGris;
    CardView toleranceArgent;
    CardView  toleranceOr;
    CardView  pointOr;
    CardView  pointArgent;
    CardView btn_1band;
    CardView btn_1band2;
    CardView btn_1band3;
    CardView btn_1band4;
    CardView  btn_1band5;
    CardView  btn_1band6;
    CardView  btn_1band7;
    CardView btn_1band8;
    CardView  btn_1band9;

    CardView  btn_2band0;
    CardView  btn_2band1;
    CardView  btn_2band2;
    CardView btn_2band3;
    CardView  btn_2band4;
    CardView  btn_2band5;
    CardView  btn_2band6;
    CardView  btn_2band7;
    CardView  btn_2band8;
    CardView  btn_2band9;


    CardView  btn_mult1;
    CardView  btn_mult2;
    CardView  btn_mult3;
    CardView  btn_mult4;
    CardView  btn_mult5;
    CardView  btn_mult6;
    CardView btn_mult7;

    RelativeLayout relativeLayout1;
    RelativeLayout relativeLayout2;
    RelativeLayout relativeLayout3;
    RelativeLayout relativeLayout4;


    @Override
    public View  onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        View view1=inflater.inflate(R.layout.fragment_1, container, false);

        // Inflate the layout for this fragment


        //pour les views
        tv_1= view1.findViewById(R.id.tv_1band);
        tv_point=view1.findViewById(R.id.tv_point);
        tv_2=view1.findViewById(R.id.tv_2band);
        tv_multip1=view1.findViewById(R.id.tv_mult);
        tv_ohms1=view1.findViewById(R.id.tv_ohms);
        tv_pourcentage=view1.findViewById(R.id.tv_pourcentage);
        tv_pointGris=view1.findViewById(R.id.tv_point_gris);
        //pour la premiere bande
        btn_1band=view1.findViewById(R.id.btn_1band_marron);
        btn_1band2=view1.findViewById(R.id.btn_1band_rouge);
        btn_1band3=view1.findViewById(R.id.btn_1band_orange);
        btn_1band4=view1.findViewById(R.id.btn_1band_jaune);
        btn_1band5=view1.findViewById(R.id.btn_1band_vert);
        btn_1band6=view1.findViewById(R.id.btn_1band_bleu);
        btn_1band7=view1.findViewById(R.id.btn_1band_violet);
        btn_1band8=view1.findViewById(R.id.btn_1band_gris);
        btn_1band9=view1.findViewById(R.id.btn_1band_blanc);
        //pour la deuxieme bande
        btn_2band0=view1.findViewById(R.id.btn_2band_noir);
        btn_2band1=view1.findViewById(R.id.btn_2band_marron);
        btn_2band2=view1.findViewById(R.id.btn_2band_rouge);
        btn_2band3=view1.findViewById(R.id.btn_2band_orange);
        btn_2band4=view1.findViewById(R.id.btn_2band_jaune);
        btn_2band5=view1.findViewById(R.id.btn_2band_vert);
        btn_2band6=view1.findViewById(R.id.btn_2band_bleu);
        btn_2band7=view1.findViewById(R.id.btn_2band_violet);
        btn_2band8=view1.findViewById(R.id.btn_2band_gris);
        btn_2band9=view1.findViewById(R.id.btn_2band_blanc);
        // multiplication
        btn_mult1=view1.findViewById(R.id.btn_multiplicator_noir);
        btn_mult2=view1.findViewById(R.id.btn_multiplicator_marron);
        btn_mult3=view1.findViewById(R.id.btn_multiplicator_rouge);
        btn_mult4=view1.findViewById(R.id.btn_multiplicator_orange);
        btn_mult5=view1.findViewById(R.id.btn_multiplicator_jaune);
        btn_mult6=view1.findViewById(R.id.btn_multiplicator_vert);
        btn_mult7=view1.findViewById(R.id.btn_multiplicator_bleu);

        toleranceOr=view1.findViewById(R.id.btn_prc_or);
        toleranceArgent=view1.findViewById(R.id.btn_prc_argent);
        pointOr=view1.findViewById(R.id.btn_point_or);
        pointArgent=view1.findViewById(R.id.btn_point_argent);

        relativeLayout1=view1.findViewById(R.id.layout1);
        relativeLayout2=view1.findViewById(R.id.layout2);
        relativeLayout3=view1.findViewById(R.id.layout3);
        relativeLayout4=view1.findViewById(R.id.layout4);

        //init des donnees


        pointArgent.setOnClickListener(view -> {
            tv_multip1.setText("");
            tv_pointGris.setText("0.");
            tv_point.setText("");relativeLayout3.setBackgroundColor(Color.parseColor("#8A8989" ));
        });


        btn_1band.setOnClickListener(view -> {tv_1.setText("1");relativeLayout1.setBackgroundColor(Color.parseColor("#4C1A0B" ));});
        btn_1band2.setOnClickListener(view -> {tv_1.setText("2");relativeLayout1.setBackgroundColor(Color.parseColor("#F60202"  ));});
        btn_1band3.setOnClickListener(view ->{ tv_1.setText("3");relativeLayout1.setBackgroundColor(Color.parseColor("#FF5722" ));});
        btn_1band4.setOnClickListener(view -> {tv_1.setText("4");relativeLayout1.setBackgroundColor(Color.parseColor("#FFC107" ));});
        btn_1band5.setOnClickListener(view -> {tv_1.setText("5");relativeLayout1.setBackgroundColor(Color.parseColor("#0CF115" ));});
        btn_1band6.setOnClickListener(view -> {tv_1.setText("6");relativeLayout1.setBackgroundColor(Color.parseColor("#0228FA"  ));});
        btn_1band7.setOnClickListener(view -> {tv_1.setText("7");relativeLayout1.setBackgroundColor(Color.parseColor("#D703FB" ));});
        btn_1band8.setOnClickListener(view -> {tv_1.setText("8");relativeLayout1.setBackgroundColor(Color.parseColor("#9C9A9A" ));});
        btn_1band9.setOnClickListener(view -> {tv_1.setText("9");relativeLayout1.setBackgroundColor(Color.parseColor("#FDFBFB" ));});

        pointOr.setOnClickListener(view -> {
            tv_point.setText(".");
            tv_multip1.setText("");
            tv_pointGris.setText("");relativeLayout3.setBackgroundColor(Color.parseColor("#B18603" ));
        });

        btn_2band0.setOnClickListener(view -> {tv_2.setText("0");relativeLayout2.setBackgroundColor(Color.parseColor("#0B0303" ));});
        btn_2band1.setOnClickListener(view -> {tv_2.setText("1");relativeLayout2.setBackgroundColor(Color.parseColor("#4C1A0B" ));});
        btn_2band2.setOnClickListener(view -> {tv_2.setText("2");relativeLayout2.setBackgroundColor(Color.parseColor("#F60202" ));});
        btn_2band3.setOnClickListener(view ->{ tv_2.setText("3");relativeLayout2.setBackgroundColor(Color.parseColor("#FF5722" ));});
        btn_2band4.setOnClickListener(view ->{ tv_2.setText("4");relativeLayout2.setBackgroundColor(Color.parseColor("#FFC107" ));});
        btn_2band5.setOnClickListener(view -> {tv_2.setText("5");relativeLayout2.setBackgroundColor(Color.parseColor("#0CF115" ));});
        btn_2band6.setOnClickListener(view -> {tv_2.setText("6");relativeLayout2.setBackgroundColor(Color.parseColor("#0228FA" ));});
        btn_2band7.setOnClickListener(view -> {tv_2.setText("7");relativeLayout2.setBackgroundColor(Color.parseColor("#D703FB" ));});
        btn_2band8.setOnClickListener(view -> {tv_2.setText("8");relativeLayout2.setBackgroundColor(Color.parseColor("#9C9A9A" ));});
        btn_2band9.setOnClickListener(view ->{ tv_2.setText("9");relativeLayout2.setBackgroundColor(Color.parseColor("#FDFBFB" ));});



        btn_mult1.setOnClickListener(view -> {
            tv_multip1.setText("");
            tv_point.setText("");
            tv_pointGris.setText("");relativeLayout3.setBackgroundColor(Color.parseColor("#0B0303" ));
        });
        btn_mult2.setOnClickListener(view ->{ tv_multip1.setText("0"); tv_point.setText("");tv_pointGris.setText("");relativeLayout3.setBackgroundColor(Color.parseColor("#4C1A0B" ));
        });
        btn_mult3.setOnClickListener(view -> {tv_multip1.setText("00");tv_point.setText("");tv_pointGris.setText("");relativeLayout3.setBackgroundColor(Color.parseColor("#F60202" ));
        });
        btn_mult4.setOnClickListener(view -> {tv_multip1.setText("k");  tv_point.setText("");tv_pointGris.setText("");relativeLayout3.setBackgroundColor(Color.parseColor("#FF5722"  ));});
        btn_mult5.setOnClickListener(view -> {tv_multip1.setText("0k"); tv_point.setText("");tv_pointGris.setText("");relativeLayout3.setBackgroundColor(Color.parseColor("#FFC107" ));});
        btn_mult6.setOnClickListener(view -> {tv_multip1.setText("00k");tv_point.setText("");tv_pointGris.setText("");relativeLayout3.setBackgroundColor(Color.parseColor("#0CF115" ));});
        btn_mult7.setOnClickListener(view -> {tv_multip1.setText("M");tv_point.setText("");tv_pointGris.setText("");relativeLayout3.setBackgroundColor(Color.parseColor("#0228FA" ));});
        toleranceOr.setOnClickListener(view -> {tv_pourcentage.setText("+-5%");relativeLayout4.setBackgroundColor(Color.parseColor("#B18603" ));});
        toleranceArgent.setOnClickListener(view -> {tv_pourcentage.setText("+-10%");relativeLayout4.setBackgroundColor(Color.parseColor("#8A8989" ));});


        tv_ohms1.setText("Ω");

        return view1;


    }

}
