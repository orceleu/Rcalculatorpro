package com.eu.rcalculatorpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SmdActivity extends AppCompatActivity {
   TextView valueOut1,valueOut2,valueOut3,valueOut4;
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
        smdA=findViewById(R.id.smdA);
        smdB=findViewById(R.id.smdB);
        smdC=findViewById(R.id.smdC);
        smdD=findViewById(R.id.smdD);
        smdE=findViewById(R.id.smdE);
        smdF=findViewById(R.id.smdF);
        smdH=findViewById(R.id.smdH);
        smdY=findViewById(R.id.smdY);
        smdS=findViewById(R.id.smdS);
        smdZ=findViewById(R.id.smdZ);
        smdX=findViewById(R.id.smdX);
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
        smdA.setOnClickListener(view -> initBtn("A",'A'));
        smdB.setOnClickListener(view -> initBtn("B",'B'));
        smdC.setOnClickListener(view -> initBtn("C",'C'));
        smdD.setOnClickListener(view -> initBtn("D",'D'));
        smdE.setOnClickListener(view -> initBtn("E",'E'));
        smdF.setOnClickListener(view -> initBtn("F",'F'));
        smdH.setOnClickListener(view -> initBtn("G",'G'));
        smdX.setOnClickListener(view -> initBtn("X",'X'));
        smdS.setOnClickListener(view -> initBtn("S",'S'));
        smdZ.setOnClickListener(view -> initBtn("Z",'Z'));
       // smdLine.setOnClickListener(view -> initBtn("9",'9'));
        smdR.setOnClickListener(view -> initBtn("R",'R'));
        smdM.setOnClickListener(view -> initBtn("M",'M'));

        result.setOnClickListener(view -> resultat());

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

    private void resultat() {

        if(count<3){
            Toast.makeText(this,"invalid code:min 3 digit",Toast.LENGTH_SHORT).show();
        }else{

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
                case 'R':{valueOut1.setText("R");}break;
                case 'M':{valueOut1.setText('M');}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}

            }

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
                case 'R':{valueOut2.setText("R");}break;
                case 'M':{valueOut2.setText("M");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}






            }
            switch (third){
                case '0':{valueOut3.setText("");}break;
                case '1':{valueOut3.setText("0");}break;
                case '2':{valueOut3.setText("00");}break;
                case '3':{valueOut3.setText("K");}break;
                case '4':{valueOut3.setText("0K");}break;
                case '5':{valueOut3.setText("00k");}break;
                case '6':{valueOut3.setText("M");}break;
                case '7':{valueOut3.setText("0M");}break;
                case '8':{valueOut3.setText("00M");}break;
                case '9':{valueOut3.setText("G");}break;
                case 'R':{valueOut3.setText("R");}break;
                case 'M':{valueOut3.setText("M");}break;
                default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}



                   }//switch (second){
                //case '1':{valueOut3.setText("1");}break;
               // case '2':{valueOut3.setText("2");}break;
               // case '3':{valueOut3.setText("3");}break;
               // case '4':{valueOut3.setText("4");}break;
               // case '5':{valueOut3.setText("5");}break;
               // case '6':{valueOut3.setText("6");}break;
               // case '7':{valueOut3.setText("7");}break;
               // case '8':{valueOut3.setText("8");}break;
              //  case '9':{valueOut3.setText("9");}break;
               // case 'R':{valueOut3.setText("R");}break;
             //   case 'M':{valueOut3.setText("M");}break;
              //  default: {Toast.makeText(this,"only R and M can be in first digit",Toast.LENGTH_SHORT).show();}






            }
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