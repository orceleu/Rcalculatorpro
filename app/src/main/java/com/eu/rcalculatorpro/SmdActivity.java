package com.eu.rcalculatorpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SmdActivity extends AppCompatActivity {
   TextView valueOut1,valueOut2,valueOut3,valueOut4,tvSmdohm;
    CardView smdClear,smd0,smd1,smd2,smd3,smd4,smd5,smd6,smd7,smd8,smd9,delete,result,smdA,smdB,smdC,smdD,smdE,smdF,smdX,smdY,smdZ,smdH,smdR,smdM,smdS,smdLine;
    char first;
    char second;
    char third;
    char fourth;
    byte count=0;
   private TextView value1,value2,value3,value4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smd);
        smd0=findViewById(R.id.smd0);
        smd1=findViewById(R.id.smd1);
        smd2=findViewById(R.id.smd2);
        smd3=findViewById(R.id.smd3);
        smd4=findViewById(R.id.smd4);
        smd5=findViewById(R.id.smd5);
        smd6=findViewById(R.id.smd6);
        smd7=findViewById(R.id.smd7);
        smd8=findViewById(R.id.smd8);
        smd9=findViewById(R.id.smd9);
        tvSmdohm=findViewById(R.id.tvSmdohm);

        smdZ=findViewById(R.id.smdZ);
        smdLine=findViewById(R.id.smdLine);
        smdClear=findViewById(R.id.smdClear);
        smdR=findViewById(R.id.smdR);
        smdM=findViewById(R.id.smdM);

        delete=findViewById(R.id.smdDelete);
        result=findViewById(R.id.smdeResultat);

        value1=findViewById(R.id.value1);
        value2=findViewById(R.id.value2);
        value3=findViewById(R.id.value3);
        value4=findViewById(R.id.value4);

        valueOut1=findViewById(R.id.valueOut1);
        valueOut2=findViewById(R.id.valueOut2);
        valueOut3=findViewById(R.id.valueOut3);
        valueOut4=findViewById(R.id.valueOut4);

        smd0.setOnClickListener(view -> initBtn("0",'0'));
        smd1.setOnClickListener(view -> initBtn("1",'1'));
        smd2.setOnClickListener(view -> initBtn("2",'2'));
        smd3.setOnClickListener(view -> initBtn("3",'3'));
        smd4.setOnClickListener(view -> initBtn("4",'4'));
        smd5.setOnClickListener(view -> initBtn("5",'5'));
        smd6.setOnClickListener(view -> initBtn("6",'6'));
        smd7.setOnClickListener(view -> initBtn("7",'7'));
        smd8.setOnClickListener(view -> initBtn("8",'8'));
        smd9.setOnClickListener(view -> initBtn("9",'9'));
        smdClear.setOnClickListener(view ->{ valueOut1.setText(""); valueOut2.setText("");valueOut3.setText("");valueOut4.setText("");
            value1.setText(""); value2.setText("");value3.setText("");value4.setText("");tvSmdohm.setText("");
            first='0';
            second='0';
            third='0';
            fourth='0';
            count=0;
               });


       // smdLine.setOnClickListener(view -> initBtn("9",'9'));
        smdR.setOnClickListener(view -> initBtn("R",'R'));
        smdM.setOnClickListener(view -> initBtn("M",'M'));
     //for result
        result.setOnClickListener(view ->{
            if(count<3){
                Toast.makeText(this,"invalid code:min 3 digit",Toast.LENGTH_SHORT).show();
            }else{

                if(count==3) {


                    if(first=='R'){
                        rResult1();
                    }else if(first=='M')
                        mResult1();
                    else{
                        if(second=='R'){
                            rResult();
                        }else if(second=='M'){
                            mResult();
                        }else {
                            resultat3();
                        }

                    }}

                if(count==4) {
                    if(first=='R'){
                        rResult2();
                    }else if(first=='M')
                        mResult2();
                    else{
                        if(second=='R'){
                            rResult3();
                        }else if(second=='M'){
                            mResult3();
                        }else {
                            resultat4();
                        }}}}



                    });














        delete.setOnClickListener(view -> {  if(count>0){count--;
            if(count==3){
                value4.setText("");
                first='0';}
            else if(count==2){
                value3.setText("");
                second='0';}
            else if(count==1){
                value2.setText("");
                third='0';}
            else{
                value1.setText("");
                fourth='0';
            }}});

    }

    private void mResult3() {



            switch (first){
                case '0':{valueOut1.setText("");}break;
                case '1':{valueOut1.setText("1");}break;
                case '2':{valueOut1.setText("2");}break;
                case '3':{valueOut1.setText("3");}break;
                case '4':{valueOut1.setText("4");}break;
                case '5':{valueOut1.setText("5");}break;
                case '6':{valueOut1.setText("6");}break;
                case '7':{valueOut1.setText("7");}break;
                case '8':{valueOut1.setText("8");}break;
                case '9':{valueOut1.setText("9");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

            switch (second){
                case 'M':{valueOut2.setText(".");}break;

                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}
            }
            switch (third){
                case '0':{valueOut3.setText("0");}break;
                case '1':{valueOut3.setText("1");}break;
                case '2':{valueOut3.setText("2");}break;
                case '3':{valueOut3.setText("3");}break;
                case '4':{valueOut3.setText("4");}break;
                case '5':{valueOut3.setText("5");}break;
                case '6':{valueOut3.setText("6");}break;
                case '7':{valueOut3.setText("7");}break;
                case '8':{valueOut3.setText("8");}break;
                case '9':{valueOut3.setText("9");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

            switch (fourth){
                case '0':{valueOut4.setText("0");}break;
                case '1':{valueOut4.setText("1");}break;
                case '2':{valueOut4.setText("2");}break;
                case '3':{valueOut4.setText("3");}break;
                case '4':{valueOut4.setText("4");}break;
                case '5':{valueOut4.setText("5");}break;
                case '6':{valueOut4.setText("6");}break;
                case '7':{valueOut4.setText("7");}break;
                case '8':{valueOut4.setText("8");}break;
                case '9':{valueOut4.setText("9");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}




            tvSmdohm.setText("mΩ");


        }



    private void rResult3() {


            switch (first){
                case '0':{valueOut1.setText("");}break;
                case '1':{valueOut1.setText("1");}break;
                case '2':{valueOut1.setText("2");}break;
                case '3':{valueOut1.setText("3");}break;
                case '4':{valueOut1.setText("4");}break;
                case '5':{valueOut1.setText("5");}break;
                case '6':{valueOut1.setText("6");}break;
                case '7':{valueOut1.setText("7");}break;
                case '8':{valueOut1.setText("8");}break;
                case '9':{valueOut1.setText("9");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

            switch (second){
                case 'R':{valueOut2.setText(".");}break;

                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}
            }
            switch (third){
                case '0':{valueOut3.setText("0");}break;
                case '1':{valueOut3.setText("1");}break;
                case '2':{valueOut3.setText("2");}break;
                case '3':{valueOut3.setText("3");}break;
                case '4':{valueOut3.setText("4");}break;
                case '5':{valueOut3.setText("5");}break;
                case '6':{valueOut3.setText("6");}break;
                case '7':{valueOut3.setText("7");}break;
                case '8':{valueOut3.setText("8");}break;
                case '9':{valueOut3.setText("9");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

            switch (fourth){
                case '0':{valueOut4.setText("0");}break;
                case '1':{valueOut4.setText("1");}break;
                case '2':{valueOut4.setText("2");}break;
                case '3':{valueOut4.setText("3");}break;
                case '4':{valueOut4.setText("4");}break;
                case '5':{valueOut4.setText("5");}break;
                case '6':{valueOut4.setText("6");}break;
                case '7':{valueOut4.setText("7");}break;
                case '8':{valueOut4.setText("8");}break;
                case '9':{valueOut4.setText("9");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}




            tvSmdohm.setText("Ω");


        }



    private void mResult2() {


            switch (first){
                case 'M':{valueOut1.setText("0.");}break;

                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

            switch (second){
                case '0':{valueOut2.setText("");}break;
                case '1':{valueOut2.setText("1");}break;
                case '2':{valueOut2.setText("2");}break;
                case '3':{valueOut2.setText("3");}break;
                case '4':{valueOut2.setText("4");}break;
                case '5':{valueOut2.setText("5");}break;
                case '6':{valueOut2.setText("6");}break;
                case '7':{valueOut2.setText("7");}break;
                case '8':{valueOut2.setText("8");}break;
                case '9':{valueOut2.setText("9");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}


            switch (third){
                case '0':{valueOut3.setText("0");}break;
                case '1':{valueOut3.setText("1");}break;
                case '2':{valueOut3.setText("2");}break;
                case '3':{valueOut3.setText("3");}break;
                case '4':{valueOut3.setText("4");}break;
                case '5':{valueOut3.setText("5");}break;
                case '6':{valueOut3.setText("6");}break;
                case '7':{valueOut3.setText("7");}break;
                case '8':{valueOut3.setText("8");}break;
                case '9':{valueOut3.setText("9");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

             switch (fourth){
                 case '0':{valueOut4.setText("0");}break;
                 case '1':{valueOut4.setText("1");}break;
                 case '2':{valueOut4.setText("2");}break;
                 case '3':{valueOut4.setText("3");}break;
                 case '4':{valueOut4.setText("4");}break;
                 case '5':{valueOut4.setText("5");}break;
                 case '6':{valueOut4.setText("6");}break;
                 case '7':{valueOut4.setText("7");}break;
                 case '8':{valueOut4.setText("8");}break;
                 case '9':{valueOut4.setText("9");}break;
                 default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}





             tvSmdohm.setText("mΩ");
        }



    private void rResult2() {

        switch (second){
            case '0':{valueOut2.setText("0");}break;
            case '1':{valueOut2.setText("1");}break;
            case '2':{valueOut2.setText("2");}break;
            case '3':{valueOut2.setText("3");}break;
            case '4':{valueOut2.setText("4");}break;
            case '5':{valueOut2.setText("5");}break;
            case '6':{valueOut2.setText("6");}break;
            case '7':{valueOut2.setText("7");}break;
            case '8':{valueOut2.setText("8");}break;
            case '9':{valueOut2.setText("9");}break;
            default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

    switch (first){
        case 'R':{valueOut1.setText("0.");}break;

        default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}
   }
        switch (third){
            case '0':{valueOut3.setText("0");}break;
            case '1':{valueOut3.setText("1");}break;
            case '2':{valueOut3.setText("2");}break;
            case '3':{valueOut3.setText("3");}break;
            case '4':{valueOut3.setText("4");}break;
            case '5':{valueOut3.setText("5");}break;
            case '6':{valueOut3.setText("6");}break;
            case '7':{valueOut3.setText("7");}break;
            case '8':{valueOut3.setText("8");}break;
            case '9':{valueOut3.setText("9");}break;
            default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

  switch (fourth){
            case '0':{valueOut4.setText("0");}break;
            case '1':{valueOut4.setText("1");}break;
            case '2':{valueOut4.setText("2");}break;
            case '3':{valueOut4.setText("3");}break;
            case '4':{valueOut4.setText("4");}break;
            case '5':{valueOut4.setText("5");}break;
            case '6':{valueOut4.setText("6");}break;
            case '7':{valueOut4.setText("7");}break;
            case '8':{valueOut4.setText("8");}break;
            case '9':{valueOut4.setText("9");}break;
            default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}




        tvSmdohm.setText("Ω");


    }

    private void mResult1() {

        switch (first){
            case 'M':{valueOut1.setText("0.");}break;

            default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

     switch (second){
        case '0':{valueOut2.setText("");}break;
        case '1':{valueOut2.setText("1");}break;
        case '2':{valueOut2.setText("2");}break;
        case '3':{valueOut2.setText("3");}break;
        case '4':{valueOut2.setText("4");}break;
        case '5':{valueOut2.setText("5");}break;
        case '6':{valueOut2.setText("6");}break;
        case '7':{valueOut2.setText("7");}break;
        case '8':{valueOut2.setText("8");}break;
        case '9':{valueOut2.setText("9");}break;
        default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}


        switch (third){
            case '0':{valueOut3.setText("0");}break;
            case '1':{valueOut3.setText("1");}break;
            case '2':{valueOut3.setText("2");}break;
            case '3':{valueOut3.setText("3");}break;
            case '4':{valueOut3.setText("4");}break;
            case '5':{valueOut3.setText("5");}break;
            case '6':{valueOut3.setText("6");}break;
            case '7':{valueOut3.setText("7");}break;
            case '8':{valueOut3.setText("8");}break;
            case '9':{valueOut3.setText("9");}break;
            default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}




        valueOut4.setText("mΩ");
        tvSmdohm.setText("");
    }
    private void rResult1() {
        switch (first){
            case 'R':{valueOut1.setText("0.");}break;

            default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

        switch (second){
            case '0':{valueOut2.setText("0");}break;
            case '1':{valueOut2.setText("1");}break;
            case '2':{valueOut2.setText("2");}break;
            case '3':{valueOut2.setText("3");}break;
            case '4':{valueOut2.setText("4");}break;
            case '5':{valueOut2.setText("5");}break;
            case '6':{valueOut2.setText("6");}break;
            case '7':{valueOut2.setText("7");}break;
            case '8':{valueOut2.setText("8");}break;
            case '9':{valueOut2.setText("9");}break;
            default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}


        switch (third){
            case '0':{valueOut3.setText("0");}break;
            case '1':{valueOut3.setText("1");}break;
            case '2':{valueOut3.setText("2");}break;
            case '3':{valueOut3.setText("3");}break;
            case '4':{valueOut3.setText("4");}break;
            case '5':{valueOut3.setText("5");}break;
            case '6':{valueOut3.setText("6");}break;
            case '7':{valueOut3.setText("7");}break;
            case '8':{valueOut3.setText("8");}break;
            case '9':{valueOut3.setText("9");}break;
            default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}




        valueOut4.setText("Ω");
        tvSmdohm.setText("");
    }
    private void mResult() {
        switch (first){
            case '0':{valueOut1.setText("");}break;
            case '1':{valueOut1.setText("1");}break;
            case '2':{valueOut1.setText("2");}break;
            case '3':{valueOut1.setText("3");}break;
            case '4':{valueOut1.setText("4");}break;
            case '5':{valueOut1.setText("5");}break;
            case '6':{valueOut1.setText("6");}break;
            case '7':{valueOut1.setText("7");}break;
            case '8':{valueOut1.setText("8");}break;
            case '9':{valueOut1.setText("9");}break;
            default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}



            switch (second){
                case 'M':{valueOut2.setText(".");}break;

                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

                switch (third){
                    case '0':{valueOut3.setText("0");}break;
                    case '1':{valueOut3.setText("1");}break;
                    case '2':{valueOut3.setText("2");}break;
                    case '3':{valueOut3.setText("3");}break;
                    case '4':{valueOut3.setText("4");}break;
                    case '5':{valueOut3.setText("5");}break;
                    case '6':{valueOut3.setText("6");}break;
                    case '7':{valueOut3.setText("7");}break;
                    case '8':{valueOut3.setText("8");}break;
                    case '9':{valueOut3.setText("9");}break;
                    default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}




    valueOut4.setText("mΩ");
        tvSmdohm.setText("");
    }
    private void rResult() {
        switch (first){
            case '0':{valueOut1.setText("");}break;
            case '1':{valueOut1.setText("1");}break;
            case '2':{valueOut1.setText("2");}break;
            case '3':{valueOut1.setText("3");}break;
            case '4':{valueOut1.setText("4");}break;
            case '5':{valueOut1.setText("5");}break;
            case '6':{valueOut1.setText("6");}break;
            case '7':{valueOut1.setText("7");}break;
            case '8':{valueOut1.setText("8");}break;
            case '9':{valueOut1.setText("9");}break;
            default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}
            }

            switch (second){
                case 'R':{valueOut2.setText(".");}break;

                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}
             }
                switch (third){
                    case '0':{valueOut3.setText("0");}break;
                    case '1':{valueOut3.setText("1");}break;
                    case '2':{valueOut3.setText("2");}break;
                    case '3':{valueOut3.setText("3");}break;
                    case '4':{valueOut3.setText("4");}break;
                    case '5':{valueOut3.setText("5");}break;
                    case '6':{valueOut3.setText("6");}break;
                    case '7':{valueOut3.setText("7");}break;
                    case '8':{valueOut3.setText("8");}break;
                    case '9':{valueOut3.setText("9");}break;
                    default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}

                }


        valueOut4.setText("Ω");
        tvSmdohm.setText("");
    }
    private void resultat4() {


            switch (first){
                case '0':{valueOut1.setText("");}break;
                case '1':{valueOut1.setText("1");}break;
                case '2':{valueOut1.setText("2");}break;
                case '3':{valueOut1.setText("3");}break;
                case '4':{valueOut1.setText("4");}break;
                case '5':{valueOut1.setText("5");}break;
                case '6':{valueOut1.setText("6");}break;
                case '7':{valueOut1.setText("7");}break;
                case '8':{valueOut1.setText("8");}break;
                case '9':{valueOut1.setText("9");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

            switch (second){
                case '0':{valueOut2.setText("0");}break;
                case '1':{valueOut2.setText("1");}break;
                case '2':{valueOut2.setText("2");}break;
                case '3':{valueOut2.setText("3");}break;
                case '4':{valueOut2.setText("4");}break;
                case '5':{valueOut2.setText("5");}break;
                case '6':{valueOut2.setText("6");}break;
                case '7':{valueOut2.setText("7");}break;
                case '8':{valueOut2.setText("8");}break;
                case '9':{valueOut2.setText("9");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

            switch (third){
                case '0':{valueOut3.setText("0");}break;
                case '1':{valueOut3.setText("1");}break;
                case '2':{valueOut3.setText("2");}break;
                case '3':{valueOut3.setText("3");}break;
                case '4':{valueOut3.setText("4");}break;
                case '5':{valueOut3.setText("5");}break;
                case '6':{valueOut3.setText("6");}break;
                case '7':{valueOut3.setText("7");}break;
                case '8':{valueOut3.setText("8");}break;
                case '9':{valueOut3.setText("9");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

            switch (fourth){
                case '0':{valueOut4.setText("");tvSmdohm.setText("");}break;
                case '1':{valueOut4.setText("0Ω");tvSmdohm.setText("");}break;
                case '2':{valueOut4.setText("00Ω");tvSmdohm.setText("");}break;
                case '3':{valueOut4.setText("kΩ");tvSmdohm.setText("");}break;
                case '4':{valueOut4.setText("0kΩ");tvSmdohm.setText("");}break;
                case '5':{valueOut4.setText("00kΩ");tvSmdohm.setText("");}break;
                case '6':{valueOut4.setText("MΩ");tvSmdohm.setText("");}break;
                case '7':{valueOut4.setText("0MΩ");tvSmdohm.setText("");}break;
                case '8':{valueOut4.setText("00MΩ");tvSmdohm.setText("");}break;
                case '9':{valueOut4.setText("GΩ");tvSmdohm.setText("");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}







        }


    private void resultat3() {


            switch (first){
                case '0':{valueOut1.setText("");}break;
                case '1':{valueOut1.setText("1");}break;
                case '2':{valueOut1.setText("2");}break;
                case '3':{valueOut1.setText("3");}break;
                case '4':{valueOut1.setText("4");}break;
                case '5':{valueOut1.setText("5");}break;
                case '6':{valueOut1.setText("6");}break;
                case '7':{valueOut1.setText("7");}break;
                case '8':{valueOut1.setText("8");}break;
                case '9':{valueOut1.setText("9");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}



              switch (second){
                case '0':{valueOut2.setText("0");}break;
                case '1':{valueOut2.setText("1");}break;
                case '2':{valueOut2.setText("2");}break;
                case '3':{valueOut2.setText("3");}break;
                case '4':{valueOut2.setText("4");}break;
                case '5':{valueOut2.setText("5");}break;
                case '6':{valueOut2.setText("6");}break;
                case '7':{valueOut2.setText("7");}break;
                case '8':{valueOut2.setText("8");}break;
                case '9':{valueOut2.setText("9");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}

                  switch (third){
                case '0':{valueOut3.setText("Ω");valueOut4.setText("");}break;
                case '1':{valueOut3.setText("0Ω");valueOut4.setText("");}break;
                case '2':{valueOut3.setText("00Ω");valueOut4.setText("");}break;
                case '3':{valueOut3.setText("KΩ");valueOut4.setText("");}break;
                case '4':{valueOut3.setText("0KΩ");valueOut4.setText("");}break;
                case '5':{valueOut3.setText("00kΩ");valueOut4.setText("");}break;
                case '6':{valueOut3.setText("MΩ");valueOut4.setText("");}break;
                case '7':{valueOut3.setText("0MΩ");valueOut4.setText("");}break;
                case '8':{valueOut3.setText("00MΩ");valueOut4.setText("");}break;
                case '9':{valueOut3.setText("G");valueOut4.setText("");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}}



    }
    private void initBtn(String s, char s1) {
        if(count<4) {
            count++;
            if (count == 1) {
                value1.setText(s);
                first = s1;
            }
           else if (count == 2) {
                value2.setText(s);
                second = s1;
            }
           else if (count == 3) {
                value3.setText(s);
                third = s1;
            }
            else  {
                value4.setText(s);
                fourth = s1;
            }
        }
    }


}