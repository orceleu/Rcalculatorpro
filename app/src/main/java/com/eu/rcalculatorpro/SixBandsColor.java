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

public class SixBandsColor extends Fragment {
    private RelativeLayout layoutband1,layoutband2,layoutband3,layoutmult,layouttolerance,relativeLayoutTemp;
    private TextView tvband1;
    private TextView tvband2;
    private TextView tvband3;
    private TextView tvmult;
    private TextView tvtolerance;
    private TextView tvPointor;
    private TextView tvpointargent;
    private TextView temp;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view3= inflater.inflate(R.layout.sixbandscolor, container, false);

        // pour les layout
        layoutband1=view3.findViewById(R.id.layout001);
        layoutband2=view3.findViewById(R.id.layout002);
        layoutband3=view3.findViewById(R.id.layout003);
        layoutmult=view3.findViewById(R.id.layout004);
        layouttolerance=view3.findViewById(R.id.layout005);
        relativeLayoutTemp=view3.findViewById(R.id.layout006);

        // pour les textes

        tvband1=view3.findViewById(R.id.tv_1band001);
        tvband2=view3.findViewById(R.id.tv_2band001);
        tvband3=view3.findViewById(R.id.tv_3band001);
        tvmult=view3.findViewById(R.id.tv_mult001);
        tvtolerance=view3.findViewById(R.id.tv_pourcentage001);
        tvpointargent=view3.findViewById(R.id.tv_point_argent001);
        temp=view3.findViewById(R.id.tv_temp001);
        tvPointor=view3.findViewById(R.id.tv_point_or001);
        TextView tvohms = view3.findViewById(R.id.tv_ohms001);

        // for botton

        CardView btn1_band1 = view3.findViewById(R.id.btn_001band_marron);
        CardView btn2_band1 = view3.findViewById(R.id.btn_001band_rouge);
        CardView btn3_band1 = view3.findViewById(R.id.btn_001band_orange);
        CardView btn4_band1 = view3.findViewById(R.id.btn_001band_jaune);
        CardView btn5_band1 = view3.findViewById(R.id.btn_001band_vert);
        CardView btn6_band1 = view3.findViewById(R.id.btn_001band_bleu);
        CardView btn7_band1 = view3.findViewById(R.id.btn_001band_violet);
        CardView btn8_band1 = view3.findViewById(R.id.btn_001band_gris);
        CardView btn9_band1 = view3.findViewById(R.id.btn_001band_blanc);

        CardView btn0_band2 = view3.findViewById(R.id.btn_002band_noir);
        CardView btn1_band2 = view3.findViewById(R.id.btn_002band_marron);
        CardView btn2_band2 = view3.findViewById(R.id.btn_002band_rouge);
        CardView btn3_band2 = view3.findViewById(R.id.btn_002band_orange);
        CardView btn4_band2 = view3.findViewById(R.id.btn_002band_jaune);
        CardView btn5_band2 = view3.findViewById(R.id.btn_002band_vert);
        CardView btn6_band2 = view3.findViewById(R.id.btn_002band_bleu);
        CardView btn7_band2 = view3.findViewById(R.id.btn_002band_violet);
        CardView btn8_band2 = view3.findViewById(R.id.btn_002band_gris);
        CardView btn9_band2 = view3.findViewById(R.id.btn_002band_blanc);

        CardView btn0_band3 = view3.findViewById(R.id.btn_003band_noir);
        CardView btn1_band3 = view3.findViewById(R.id.btn_003band_marron);
        CardView btn2_band3 = view3.findViewById(R.id.btn_003band_rouge);
        CardView btn3_band3 = view3.findViewById(R.id.btn_003band_orange);
        CardView btn4_band3 = view3.findViewById(R.id.btn_003band_jaune);
        CardView btn5_band3 = view3.findViewById(R.id.btn_003band_vert);
        CardView btn6_band3 = view3.findViewById(R.id.btn_003band_bleu);
        CardView btn7_band3 = view3.findViewById(R.id.btn_003band_violet);
        CardView btn8_band3 = view3.findViewById(R.id.btn_003band_gris);
        CardView btn9_band3 = view3.findViewById(R.id.btn_003band_blanc);

        CardView btnmult0_band4 = view3.findViewById(R.id.btn_multiplicator_noir001);
        CardView btnmult1_band4 = view3.findViewById(R.id.btn_multiplicator_marron001);
        CardView btnmult2_band4 = view3.findViewById(R.id.btn_multiplicator_rouge001);
        CardView btnmult3_band4 = view3.findViewById(R.id.btn_multiplicator_orange001);
        CardView btnmult4_band4 = view3.findViewById(R.id.btn_multiplicator_jaune001);
        CardView btnmult5_band4 = view3.findViewById(R.id.btn_multiplicator_vert001);
        CardView btnmult6_band4 = view3.findViewById(R.id.btn_multiplicator_bleu001);
        CardView btnmultOr_band4 = view3.findViewById(R.id.btn_point_or001);
        CardView btnmultArgent_band4 = view3.findViewById(R.id.btn_point_argent001);

        CardView btntolerance1_band5 = view3.findViewById(R.id.btn_tolerance_marron001);
        CardView btntolerance2_band5 = view3.findViewById(R.id.btn_tolerance_rouge001);
        CardView btntolerance3_band5 = view3.findViewById(R.id.btn_tolerance_orange001);
        CardView btntolerance4_band5 = view3.findViewById(R.id.btn_tolerance_jaune001);
        CardView btntolerance5_band5 = view3.findViewById(R.id.btn_tolerance_vert001);
        CardView btntolerance6_band5 = view3.findViewById(R.id.btn_tolerance_bleu001);
        CardView btntolerance7_band5 = view3.findViewById(R.id.btn_tolerance_violet001);
        CardView btntolerance8_band5 = view3.findViewById(R.id.btn_tolerance_gris001);
        CardView btntoleranceArgent_band5 = view3.findViewById(R.id.btn_prc_argent001);
        CardView btntoleranceOr_band5 = view3.findViewById(R.id.btn_prc_or001);

        CardView btntolerance0_band6 = view3.findViewById(R.id.btn_temp_noir);
        CardView btntolerance1_band6 = view3.findViewById(R.id.btn_temp_marron);
        CardView btntolerance2_band6 = view3.findViewById(R.id.btn_temp_rouge);
        CardView btntolerance3_band6 = view3.findViewById(R.id.btn_temp_orange);
        CardView btntolerance4_band6 = view3.findViewById(R.id.btn_temp_jaune);
        CardView btntolerance5_band6 = view3.findViewById(R.id.btn_temp_vert);
        CardView btntolerance6_band6 = view3.findViewById(R.id.btn_temp_bleu);
        CardView btntolerance7_band6 = view3.findViewById(R.id.btn_temp_violet);
        CardView btntolerance8_band6 = view3.findViewById(R.id.btn_temp_gris);


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

        btntolerance0_band6.setOnClickListener(view -> {temp.setText("250ppm/ºC");relativeLayoutTemp.setBackgroundColor(Color.parseColor("#0B0303" ));});
        btntolerance1_band6.setOnClickListener(view -> {temp.setText("100ppm/ºC");relativeLayoutTemp.setBackgroundColor(Color.parseColor("#4C1A0B" ));});
        btntolerance2_band6.setOnClickListener(view -> {temp.setText("50ppm/ºC");relativeLayoutTemp.setBackgroundColor(Color.parseColor("#F60202"  ));});
        btntolerance3_band6.setOnClickListener(view -> {temp.setText("15ppm/ºC");relativeLayoutTemp.setBackgroundColor(Color.parseColor("#FF5722" ));});
        btntolerance4_band6.setOnClickListener(view -> {temp.setText("25ppm/ºC");relativeLayoutTemp.setBackgroundColor(Color.parseColor("#FFC107" ));});
        btntolerance5_band6.setOnClickListener(view -> {temp.setText("20ppm/ºC");relativeLayoutTemp.setBackgroundColor(Color.parseColor("#0CF115" ));});
        btntolerance6_band6.setOnClickListener(view -> {temp.setText("10ppm/ºC");relativeLayoutTemp.setBackgroundColor(Color.parseColor("#0228FA" ));});
        btntolerance7_band6.setOnClickListener(view -> {temp.setText("5ppm/ºC");relativeLayoutTemp.setBackgroundColor(Color.parseColor("#D703FB"  ));});
        btntolerance8_band6.setOnClickListener(view -> {temp.setText("1ppm/ºC");relativeLayoutTemp.setBackgroundColor(Color.parseColor("#9C9A9A" ));});

        tvohms.setText("Ω");




        return view3;


    }
}