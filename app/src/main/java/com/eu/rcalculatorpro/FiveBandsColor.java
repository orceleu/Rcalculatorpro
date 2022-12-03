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

public class FiveBandsColor extends Fragment {
    private  RelativeLayout  layoutband1,layoutband2,layoutband3,layoutmult,layouttolerance;
   private TextView tvband1;
    private TextView tvband2;
    private TextView tvband3;
    private TextView tvmult;
    private TextView tvtolerance;
    private TextView tvPointor;
    private TextView tvpointargent;


    @Override
    public View  onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View view2= inflater.inflate(R.layout.fivebandscolor, container, false);

        // pour les layout
      layoutband1=view2.findViewById(R.id.layout01);
      layoutband2=view2.findViewById(R.id.layout02);
      layoutband3=view2.findViewById(R.id.layout03);
      layoutmult=view2.findViewById(R.id.layout04);
      layouttolerance=view2.findViewById(R.id.layout05);

      // pour les textes

        tvband1=view2.findViewById(R.id.tv_1band01);
        tvband2=view2.findViewById(R.id.tv_2band01);
        tvband3=view2.findViewById(R.id.tv_3band01);
        tvmult=view2.findViewById(R.id.tv_mult01);
        tvtolerance=view2.findViewById(R.id.tv_pourcentage01);
        tvpointargent=view2.findViewById(R.id.tv_point_argent01);
        tvPointor=view2.findViewById(R.id.tv_point_or01);
        TextView tvohms = view2.findViewById(R.id.tv_ohms01);

      // for botton

        CardView btn1_band1 = view2.findViewById(R.id.btn_01band_marron);
        CardView btn2_band1 = view2.findViewById(R.id.btn_01band_rouge);
        CardView btn3_band1 = view2.findViewById(R.id.btn_01band_orange);
        CardView btn4_band1 = view2.findViewById(R.id.btn_01band_jaune);
        CardView btn5_band1 = view2.findViewById(R.id.btn_01band_vert);
        CardView btn6_band1 = view2.findViewById(R.id.btn_01band_bleu);
        CardView btn7_band1 = view2.findViewById(R.id.btn_01band_violet);
        CardView btn8_band1 = view2.findViewById(R.id.btn_01band_gris);
        CardView btn9_band1 = view2.findViewById(R.id.btn_01band_blanc);

        CardView btn0_band2 = view2.findViewById(R.id.btn_02band_noir);
        CardView btn1_band2 = view2.findViewById(R.id.btn_02band_marron);
        CardView btn2_band2 = view2.findViewById(R.id.btn_02band_rouge);
        CardView btn3_band2 = view2.findViewById(R.id.btn_02band_orange);
        CardView btn4_band2 = view2.findViewById(R.id.btn_02band_jaune);
        CardView btn5_band2 = view2.findViewById(R.id.btn_02band_vert);
        CardView btn6_band2 = view2.findViewById(R.id.btn_02band_bleu);
        CardView btn7_band2 = view2.findViewById(R.id.btn_02band_violet);
        CardView btn8_band2 = view2.findViewById(R.id.btn_02band_gris);
        CardView btn9_band2 = view2.findViewById(R.id.btn_02band_blanc);

        CardView btn0_band3 = view2.findViewById(R.id.btn_03band_noir);
        CardView btn1_band3 = view2.findViewById(R.id.btn_03band_marron);
        CardView btn2_band3 = view2.findViewById(R.id.btn_03band_rouge);
        CardView btn3_band3 = view2.findViewById(R.id.btn_03band_orange);
        CardView btn4_band3 = view2.findViewById(R.id.btn_03band_jaune);
        CardView btn5_band3 = view2.findViewById(R.id.btn_03band_vert);
        CardView btn6_band3 = view2.findViewById(R.id.btn_03band_bleu);
        CardView btn7_band3 = view2.findViewById(R.id.btn_03band_violet);
        CardView btn8_band3 = view2.findViewById(R.id.btn_03band_gris);
        CardView btn9_band3 = view2.findViewById(R.id.btn_03band_blanc);

        CardView btnmult0_band4 = view2.findViewById(R.id.btn_multiplicator_noir01);
        CardView btnmult1_band4 = view2.findViewById(R.id.btn_multiplicator_marron01);
        CardView btnmult2_band4 = view2.findViewById(R.id.btn_multiplicator_rouge01);
        CardView btnmult3_band4 = view2.findViewById(R.id.btn_multiplicator_orange01);
        CardView btnmult4_band4 = view2.findViewById(R.id.btn_multiplicator_jaune01);
        CardView btnmult5_band4 = view2.findViewById(R.id.btn_multiplicator_vert01);
        CardView btnmult6_band4 = view2.findViewById(R.id.btn_multiplicator_bleu01);
        CardView btnmultOr_band4 = view2.findViewById(R.id.btn_point_or01);
        CardView btnmultArgent_band4 = view2.findViewById(R.id.btn_point_argent01);

        CardView btntolerance1_band5 = view2.findViewById(R.id.btn_tolerance_marron01);
        CardView btntolerance2_band5 = view2.findViewById(R.id.btn_tolerance_rouge01);
        CardView btntolerance3_band5 = view2.findViewById(R.id.btn_tolerance_orange01);
        CardView btntolerance4_band5 = view2.findViewById(R.id.btn_tolerance_jaune01);
        CardView btntolerance5_band5 = view2.findViewById(R.id.btn_tolerance_vert01);
        CardView btntolerance6_band5 = view2.findViewById(R.id.btn_tolerance_bleu01);
        CardView btntolerance7_band5 = view2.findViewById(R.id.btn_tolerance_violet01);
        CardView btntolerance8_band5 = view2.findViewById(R.id.btn_tolerance_gris01);
        CardView btntoleranceArgent_band5 = view2.findViewById(R.id.btn_prc_argent01);
        CardView btntoleranceOr_band5 = view2.findViewById(R.id.btn_prc_or01);


         // init des donnees




        btn1_band1.setOnClickListener(view -> { tvband1.setText("1");layoutband1.setBackgroundColor(Color.parseColor("#4C1A0B" ));});
        btn2_band1.setOnClickListener(view -> { tvband1.setText("2");layoutband1.setBackgroundColor(Color.parseColor("#F60202"  ));});
        btn3_band1.setOnClickListener(view ->{ tvband1.setText("3");layoutband1.setBackgroundColor(Color.parseColor("#FF5722" ));});
        btn4_band1.setOnClickListener(view -> { tvband1.setText("4");layoutband1.setBackgroundColor(Color.parseColor("#FFC107" ));});
        btn5_band1.setOnClickListener(view -> { tvband1.setText("5");layoutband1.setBackgroundColor(Color.parseColor("#0CF115" ));});
        btn6_band1.setOnClickListener(view -> { tvband1.setText("6");layoutband1.setBackgroundColor(Color.parseColor("#0228FA"  ));});
        btn7_band1.setOnClickListener(view -> { tvband1.setText("7");layoutband1.setBackgroundColor(Color.parseColor("#D703FB" ));});
        btn8_band1.setOnClickListener(view -> { tvband1.setText("8");layoutband1.setBackgroundColor(Color.parseColor("#9C9A9A" ));});
        btn9_band1.setOnClickListener(view -> { tvband1.setText("9");layoutband1.setBackgroundColor(Color.parseColor("#FDFBFB" ));});



         //for point argent
        btnmultArgent_band4.setOnClickListener(view -> {tvmult.setText("");tvpointargent.setText(".");tvPointor.setText("");layoutmult.setBackgroundColor(Color.parseColor("#8A8989" ));
        });



        btn0_band2.setOnClickListener(view -> { tvband2.setText("0");layoutband2.setBackgroundColor(Color.parseColor("#0B0303" ));});
        btn1_band2.setOnClickListener(view -> {tvband2.setText("1");layoutband2.setBackgroundColor(Color.parseColor("#4C1A0B" ));});
        btn2_band2.setOnClickListener(view -> {tvband2.setText("2");layoutband2.setBackgroundColor(Color.parseColor("#F60202" ));});
        btn3_band2.setOnClickListener(view ->{ tvband2.setText("3");layoutband2.setBackgroundColor(Color.parseColor("#FF5722" ));});
        btn4_band2.setOnClickListener(view ->{ tvband2.setText("4");layoutband2.setBackgroundColor(Color.parseColor("#FFC107" ));});
        btn5_band2.setOnClickListener(view -> {tvband2.setText("5");layoutband2.setBackgroundColor(Color.parseColor("#0CF115" ));});
        btn6_band2.setOnClickListener(view -> {tvband2.setText("6");layoutband2.setBackgroundColor(Color.parseColor("#0228FA" ));});
        btn7_band2.setOnClickListener(view -> {tvband2.setText("7");layoutband2.setBackgroundColor(Color.parseColor("#D703FB" ));});
        btn8_band2.setOnClickListener(view -> {tvband2.setText("8");layoutband2.setBackgroundColor(Color.parseColor("#9C9A9A" ));});
        btn9_band2.setOnClickListener(view ->{ tvband2.setText("9");layoutband2.setBackgroundColor(Color.parseColor("#FDFBFB" ));});



         //for point or
        btnmultOr_band4.setOnClickListener(view -> {tvPointor.setText(".");tvmult.setText("");tvpointargent.setText("");layoutmult.setBackgroundColor(Color.parseColor("#B18603" ));
        });



        btn0_band3.setOnClickListener(view -> {tvband3.setText("0");layoutband3.setBackgroundColor(Color.parseColor("#0B0303" ));});
        btn1_band3.setOnClickListener(view -> {tvband3.setText("1");layoutband3.setBackgroundColor(Color.parseColor("#4C1A0B" ));});
        btn2_band3.setOnClickListener(view -> {tvband3.setText("2");layoutband3.setBackgroundColor(Color.parseColor("#F60202" ));});
        btn3_band3.setOnClickListener(view ->{tvband3.setText("3");layoutband3.setBackgroundColor(Color.parseColor("#FF5722" ));});
        btn4_band3.setOnClickListener(view ->{ tvband3.setText("4");layoutband3.setBackgroundColor(Color.parseColor("#FFC107" ));});
        btn5_band3.setOnClickListener(view -> {tvband3.setText("5");layoutband3.setBackgroundColor(Color.parseColor("#0CF115" ));});
        btn6_band3.setOnClickListener(view -> {tvband3.setText("6");layoutband3.setBackgroundColor(Color.parseColor("#0228FA" ));});
        btn7_band3.setOnClickListener(view -> {tvband3.setText("7");layoutband3.setBackgroundColor(Color.parseColor("#D703FB" ));});
        btn8_band3.setOnClickListener(view -> {tvband3.setText("8");layoutband3.setBackgroundColor(Color.parseColor("#9C9A9A" ));});
        btn9_band3.setOnClickListener(view ->{ tvband3.setText("9");layoutband3.setBackgroundColor(Color.parseColor("#FDFBFB" ));});




        btnmult0_band4.setOnClickListener(view -> {tvmult.setText("");tvPointor.setText("");tvpointargent.setText("");layoutmult.setBackgroundColor(Color.parseColor("#0B0303" ));});
        btnmult1_band4.setOnClickListener(view ->{ tvmult.setText("K"); tvPointor.setText(""); tvpointargent.setText(".");layoutmult.setBackgroundColor(Color.parseColor("#4C1A0B" ));});
        btnmult2_band4.setOnClickListener(view -> {tvmult.setText("K");tvPointor.setText("."); tvpointargent.setText("");layoutmult.setBackgroundColor(Color.parseColor("#F60202" ));});
        btnmult3_band4.setOnClickListener(view -> {tvmult.setText("k");  tvPointor.setText(""); tvpointargent.setText("");layoutmult.setBackgroundColor(Color.parseColor("#FF5722"  ));});
        btnmult4_band4.setOnClickListener(view -> {tvmult.setText("M"); tvPointor.setText(""); tvpointargent.setText(".");layoutmult.setBackgroundColor(Color.parseColor("#FFC107" ));});
        btnmult5_band4.setOnClickListener(view -> {tvmult.setText("M");tvPointor.setText("."); tvpointargent.setText("");layoutmult.setBackgroundColor(Color.parseColor("#0CF115" ));});
        btnmult6_band4.setOnClickListener(view -> {tvmult.setText("M");tvPointor.setText(""); tvpointargent.setText("");layoutmult.setBackgroundColor(Color.parseColor("#0228FA" ));});




        btntoleranceOr_band5.setOnClickListener(view -> {tvtolerance.setText("+-5%");layouttolerance.setBackgroundColor(Color.parseColor("#B18603" ));});
        btntoleranceArgent_band5.setOnClickListener(view -> {tvtolerance.setText("+-10%");layouttolerance.setBackgroundColor(Color.parseColor("#8A8989" ));});
        btntolerance1_band5.setOnClickListener(view -> {tvtolerance.setText("+-1%");layouttolerance.setBackgroundColor(Color.parseColor("#4C1A0B" ));});
        btntolerance2_band5.setOnClickListener(view -> {tvtolerance.setText("+-2%");layouttolerance.setBackgroundColor(Color.parseColor("#F60202"  ));});
        btntolerance3_band5.setOnClickListener(view -> {tvtolerance.setText("+-0.05%");layouttolerance.setBackgroundColor(Color.parseColor("#FF5722" ));});
        btntolerance4_band5.setOnClickListener(view -> {tvtolerance.setText("+-0.02%");layouttolerance.setBackgroundColor(Color.parseColor("#FFC107" ));});
        btntolerance5_band5.setOnClickListener(view -> {tvtolerance.setText("+-0.5%");layouttolerance.setBackgroundColor(Color.parseColor("#0CF115" ));});
        btntolerance6_band5.setOnClickListener(view -> {tvtolerance.setText("+-0.25%");layouttolerance.setBackgroundColor(Color.parseColor("#0228FA" ));});
        btntolerance7_band5.setOnClickListener(view -> {tvtolerance.setText("+-0.1%");layouttolerance.setBackgroundColor(Color.parseColor("#D703FB"  ));});
        btntolerance8_band5.setOnClickListener(view -> {tvtolerance.setText("+-0.01%");layouttolerance.setBackgroundColor(Color.parseColor("#9C9A9A" ));});


        tvohms.setText("Ω");




        return view2;


    }

}
