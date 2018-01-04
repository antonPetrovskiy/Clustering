package com.example.tosch.clustering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText X1text;
    EditText X2text;
    EditText X3text;
    EditText X4text;
    EditText X5text;
    EditText X6text;
    EditText X7text;
    EditText X8text;

    EditText Y1text;
    EditText Y2text;
    EditText Y3text;
    EditText Y4text;
    EditText Y5text;
    EditText Y6text;
    EditText Y7text;
    EditText Y8text;

    EditText x1text,x2text,x3text,x4text,x5text,x6text,x7text,x8text,x9text,x10text,x11text,x12text,x13text,x14text,x15text,x16text,x17text,x18text,x19text,x20text,x21text,x22text,x23text,x24text;
    EditText y1text,y2text,y3text,y4text,y5text,y6text,y7text,y8text,y9text,y10text,y11text,y12text,y13text,y14text,y15text,y16text,y17text,y18text,y19text,y20text,y21text,y22text,y23text,y24text;
    public double x1,x2,x3,x4,x5,x6,x7,x8,y1,y2,y3,y4,y5,y6,y7,y8;

    Button start;

    double centr_x1,centr_x2;
    double centr_y1,centr_y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                castNumbers();
                iteration_1();
                iteration_2();
                iteration_3();
            }
        };
        start.setOnClickListener(oclBtnOk);
    }

    public void initViews(){
        X1text = (EditText)findViewById(R.id.editText1);
        X2text = (EditText)findViewById(R.id.editText2);
        X3text = (EditText)findViewById(R.id.editText3);
        X4text = (EditText)findViewById(R.id.editText4);
        X5text = (EditText)findViewById(R.id.editText5);
        X6text = (EditText)findViewById(R.id.editText6);
        X7text = (EditText)findViewById(R.id.editText7);
        X8text = (EditText)findViewById(R.id.editText8);

        Y1text = (EditText)findViewById(R.id.editText9);
        Y2text = (EditText)findViewById(R.id.editText10);
        Y3text = (EditText)findViewById(R.id.editText11);
        Y4text = (EditText)findViewById(R.id.editText12);
        Y5text = (EditText)findViewById(R.id.editText13);
        Y6text = (EditText)findViewById(R.id.editText14);
        Y7text = (EditText)findViewById(R.id.editText15);
        Y8text = (EditText)findViewById(R.id.editText16);

        start = (Button) findViewById(R.id.button);
    }

    public void castNumbers(){
        x1 = Double.parseDouble(X1text.getText().toString());
        x2 = Double.parseDouble(X2text.getText().toString());
        x3 = Double.parseDouble(X3text.getText().toString());
        x4 = Double.parseDouble(X4text.getText().toString());
        x5 = Double.parseDouble(X5text.getText().toString());
        x6 = Double.parseDouble(X6text.getText().toString());
        x7 = Double.parseDouble(X7text.getText().toString());
        x8 = Double.parseDouble(X8text.getText().toString());

        y1 = Double.parseDouble(Y1text.getText().toString());
        y2 = Double.parseDouble(Y2text.getText().toString());
        y3 = Double.parseDouble(Y3text.getText().toString());
        y4 = Double.parseDouble(Y4text.getText().toString());
        y5 = Double.parseDouble(Y5text.getText().toString());
        y6 = Double.parseDouble(Y6text.getText().toString());
        y7 = Double.parseDouble(Y7text.getText().toString());
        y8 = Double.parseDouble(Y8text.getText().toString());


    }

    public void findCentre(){
        EditText x17 = (EditText)findViewById(R.id.editText17);
        EditText x18 = (EditText)findViewById(R.id.editText18);
        EditText x19 = (EditText)findViewById(R.id.editText19);
        EditText x20 = (EditText)findViewById(R.id.editText20);
        EditText x21 = (EditText)findViewById(R.id.editText21);
        EditText x22 = (EditText)findViewById(R.id.editText22);
        EditText x23 = (EditText)findViewById(R.id.editText23);
        EditText x24 = (EditText)findViewById(R.id.editText24);

        double all1 = 0;
        double all2 = 0;
        double x1sum = 0;
        double y1sum = 0;
        double x2sum = 0;
        double y2sum = 0;



        if(Integer.parseInt(x17.getText().toString())<=0){
            x1sum+=x1;
            y1sum+=y1;
            all1+=1;
        }else{
            x2sum+=x1;
            y2sum+=y1;
            all2+=1;
        }
        if(Integer.parseInt(x18.getText().toString())<=0){
            x1sum+=x2;
            y1sum+=y2;
            all1+=1;
        }else{
            x2sum+=x2;
            y2sum+=y2;
            all2+=1;
        }
        if(Integer.parseInt(x19.getText().toString())<=0){
            x1sum+=x3;
            y1sum+=y3;
            all1+=1;
        }else{
            x2sum+=x3;
            y2sum+=y3;
            all2+=1;
        }
        if(Integer.parseInt(x20.getText().toString())<=0){
            x1sum+=x4;
            y1sum+=y4;
            all1+=1;
        }else{
            x2sum+=x4;
            y2sum+=y4;
            all2+=1;
        }
        if(Integer.parseInt(x21.getText().toString())<=0){
            x1sum+=x5;
            y1sum+=y5;
            all1+=1;
        }else{
            x2sum+=x5;
            y2sum+=y5;
            all2+=1;
        }
        if(Integer.parseInt(x22.getText().toString())<=0){
            x1sum+=x6;
            y1sum+=y6;
            all1+=1;
        }else{
            x2sum+=x6;
            y2sum+=y6;
            all2+=1;
        }
        if(Integer.parseInt(x23.getText().toString())<=0){
            x1sum+=x7;
            y1sum+=y7;
            all1+=1;
        }else{
            x2sum+=x7;
            y2sum+=y7;
            all2+=1;
        }
        if(Integer.parseInt(x24.getText().toString())<=0){
            x1sum+=x8;
            y1sum+=y8;
            all1+=1;
        }else{
            x2sum+=x8;
            y2sum+=y8;
            all2+=1;
        }

        /*centr_x1 = (x1+x2+x3+x4)/4;
        centr_x2 = (x5+x6+x7+x8)/4;
        centr_y1 = (y1+y2+y3+y4)/4;
        centr_y2 = (y5+y6+y7+y8)/4;*/
        centr_x1 = x1sum/all1;
        centr_x2 = x2sum/all2;
        centr_y1 = y1sum/all1;
        centr_y2 = y2sum/all2;

        EditText centreX1 = (EditText)findViewById(R.id.editText97);
        EditText centreY1 = (EditText)findViewById(R.id.editText98);
        centreX1.setText(Double.toString(centr_x1)+" ; "+Double.toString(centr_y1));
        centreY1.setText(Double.toString(centr_x2)+" ; "+Double.toString(centr_y2));
    }

    public void iteration_1(){

        findCentre();

        EditText x25 = (EditText)findViewById(R.id.editText25);
        EditText x26 = (EditText)findViewById(R.id.editText26);
        EditText x27 = (EditText)findViewById(R.id.editText27);
        EditText x28 = (EditText)findViewById(R.id.editText28);
        EditText x29 = (EditText)findViewById(R.id.editText29);
        EditText x30 = (EditText)findViewById(R.id.editText30);
        EditText x31 = (EditText)findViewById(R.id.editText31);
        EditText x32 = (EditText)findViewById(R.id.editText32);
        x25.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x1),2) + Math.pow((centr_y1-y1),2))));
        x26.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x2),2) + Math.pow((centr_y1-y2),2))));
        x27.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x3),2) + Math.pow((centr_y1-y3),2))));
        x28.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x4),2) + Math.pow((centr_y1-y4),2))));
        x29.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x5),2) + Math.pow((centr_y1-y5),2))));
        x30.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x6),2) + Math.pow((centr_y1-y6),2))));
        x31.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x7),2) + Math.pow((centr_y1-y7),2))));
        x32.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x8),2) + Math.pow((centr_y1-y8),2))));


        EditText x33 = (EditText)findViewById(R.id.editText33);
        EditText x34 = (EditText)findViewById(R.id.editText34);
        EditText x35 = (EditText)findViewById(R.id.editText35);
        EditText x36 = (EditText)findViewById(R.id.editText36);
        EditText x37 = (EditText)findViewById(R.id.editText37);
        EditText x38 = (EditText)findViewById(R.id.editText38);
        EditText x39 = (EditText)findViewById(R.id.editText39);
        EditText x40 = (EditText)findViewById(R.id.editText40);
        x33.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x1),2) + Math.pow((centr_y2-y1),2))));
        x34.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x2),2) + Math.pow((centr_y2-y2),2))));
        x35.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x3),2) + Math.pow((centr_y2-y3),2))));
        x36.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x4),2) + Math.pow((centr_y2-y4),2))));
        x37.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x5),2) + Math.pow((centr_y2-y5),2))));
        x38.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x6),2) + Math.pow((centr_y2-y6),2))));
        x39.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x7),2) + Math.pow((centr_y2-y7),2))));
        x40.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x8),2) + Math.pow((centr_y2-y8),2))));


        EditText x41 = (EditText)findViewById(R.id.editText41);
        EditText x42 = (EditText)findViewById(R.id.editText42);
        EditText x43 = (EditText)findViewById(R.id.editText43);
        EditText x44 = (EditText)findViewById(R.id.editText44);
        EditText x45 = (EditText)findViewById(R.id.editText45);
        EditText x46 = (EditText)findViewById(R.id.editText46);
        EditText x47 = (EditText)findViewById(R.id.editText47);
        EditText x48 = (EditText)findViewById(R.id.editText48);


        double all1 = 0;
        double all2 = 0;
        double x1sum = 0;
        double y1sum = 0;
        double x2sum = 0;
        double y2sum = 0;
        if(Double.parseDouble(x25.getText().toString()) < Double.parseDouble(x33.getText().toString())){
            x41.setText("0");
            x1sum+=x1;
            y1sum+=y1;
            all1+=1;
        }else{
            x41.setText("1");
            x2sum+=x1;
            y2sum+=y1;
            all2+=1;
        }
        if(Double.parseDouble(x26.getText().toString()) < Double.parseDouble(x34.getText().toString())){
            x42.setText("0");
            x1sum+=x2;
            y1sum+=y2;
            all1+=1;
        }else{
            x42.setText("1");
            x2sum+=x2;
            y2sum+=y2;
            all2+=1;
        }
        if(Double.parseDouble(x27.getText().toString()) < Double.parseDouble(x35.getText().toString())){
            x43.setText("0");
            x1sum+=x3;
            y1sum+=y3;
            all1+=1;
        }else{
            x43.setText("1");
            x2sum+=x3;
            y2sum+=y3;
            all2+=1;
        }
        if(Double.parseDouble(x28.getText().toString()) < Double.parseDouble(x36.getText().toString())){
            x44.setText("0");
            x1sum+=x4;
            y1sum+=y4;
            all1+=1;
        }else{
            x44.setText("1");
            x2sum+=x4;
            y2sum+=y4;
            all2+=1;
        }
        if(Double.parseDouble(x29.getText().toString()) < Double.parseDouble(x37.getText().toString())){
            x45.setText("0");
            x1sum+=x5;
            y1sum+=y5;
            all1+=1;
        }else{
            x45.setText("1");
            x2sum+=x5;
            y2sum+=y5;
            all2+=1;
        }
        if(Double.parseDouble(x30.getText().toString()) < Double.parseDouble(x38.getText().toString())){
            x46.setText("0");
            x1sum+=x6;
            y1sum+=y6;
            all1+=1;
        }else{
            x46.setText("1");
            x2sum+=x6;
            y2sum+=y6;
            all2+=1;
        }
        if(Double.parseDouble(x31.getText().toString()) < Double.parseDouble(x39.getText().toString())){
            x47.setText("0");
            x1sum+=x7;
            y1sum+=y7;
            all1+=1;
        }else{
            x47.setText("1");
            x2sum+=x7;
            y2sum+=y7;
            all2+=1;
        }
        if(Double.parseDouble(x32.getText().toString()) < Double.parseDouble(x40.getText().toString())){
            x48.setText("0");
            x1sum+=x8;
            y1sum+=y8;
            all1+=1;
        }else{
            x48.setText("1");
            x2sum+=x8;
            y2sum+=y8;
            all2+=1;
        }

        centr_x1 = x1sum/all1;
        centr_x2 = x2sum/all2;
        centr_y1 = y1sum/all1;
        centr_y2 = y2sum/all2;


        EditText centreX1 = (EditText)findViewById(R.id.editText99);
        EditText centreY1 = (EditText)findViewById(R.id.editText100);
        centreX1.setText(Double.toString(centr_x1)+" ; "+Double.toString(centr_y1));
        centreY1.setText(Double.toString(centr_x2)+" ; "+Double.toString(centr_y2));

    }
    public void iteration_2(){

        EditText x49 = (EditText)findViewById(R.id.editText49);
        EditText x50 = (EditText)findViewById(R.id.editText50);
        EditText x51 = (EditText)findViewById(R.id.editText51);
        EditText x52 = (EditText)findViewById(R.id.editText52);
        EditText x53 = (EditText)findViewById(R.id.editText53);
        EditText x54 = (EditText)findViewById(R.id.editText54);
        EditText x55 = (EditText)findViewById(R.id.editText55);
        EditText x56 = (EditText)findViewById(R.id.editText56);
        x49.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x1),2) + Math.pow((centr_y1-y1),2))));
        x50.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x2),2) + Math.pow((centr_y1-y2),2))));
        x51.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x3),2) + Math.pow((centr_y1-y3),2))));
        x52.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x4),2) + Math.pow((centr_y1-y4),2))));
        x53.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x5),2) + Math.pow((centr_y1-y5),2))));
        x54.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x6),2) + Math.pow((centr_y1-y6),2))));
        x55.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x7),2) + Math.pow((centr_y1-y7),2))));
        x56.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x8),2) + Math.pow((centr_y1-y8),2))));


        EditText x57 = (EditText)findViewById(R.id.editText57);
        EditText x58 = (EditText)findViewById(R.id.editText58);
        EditText x59 = (EditText)findViewById(R.id.editText59);
        EditText x60 = (EditText)findViewById(R.id.editText60);
        EditText x61 = (EditText)findViewById(R.id.editText61);
        EditText x62 = (EditText)findViewById(R.id.editText62);
        EditText x63 = (EditText)findViewById(R.id.editText63);
        EditText x64 = (EditText)findViewById(R.id.editText64);
        x57.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x1),2) + Math.pow((centr_y2-y1),2))));
        x58.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x2),2) + Math.pow((centr_y2-y2),2))));
        x59.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x3),2) + Math.pow((centr_y2-y3),2))));
        x60.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x4),2) + Math.pow((centr_y2-y4),2))));
        x61.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x5),2) + Math.pow((centr_y2-y5),2))));
        x62.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x6),2) + Math.pow((centr_y2-y6),2))));
        x63.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x7),2) + Math.pow((centr_y2-y7),2))));
        x64.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x8),2) + Math.pow((centr_y2-y8),2))));

        EditText x65 = (EditText)findViewById(R.id.editText65);
        EditText x66 = (EditText)findViewById(R.id.editText66);
        EditText x67 = (EditText)findViewById(R.id.editText67);
        EditText x68 = (EditText)findViewById(R.id.editText68);
        EditText x69 = (EditText)findViewById(R.id.editText69);
        EditText x70 = (EditText)findViewById(R.id.editText70);
        EditText x71 = (EditText)findViewById(R.id.editText71);
        EditText x72 = (EditText)findViewById(R.id.editText72);


        double all1 = 0;
        double all2 = 0;
        double x1sum = 0;
        double y1sum = 0;
        double x2sum = 0;
        double y2sum = 0;
        if(Double.parseDouble(x49.getText().toString()) < Double.parseDouble(x57.getText().toString())){
            x65.setText("0");
            x1sum+=x1;
            y1sum+=y1;
            all1+=1;
        }else{
            x65.setText("1");
            x2sum+=x1;
            y2sum+=y1;
            all2+=1;
        }
        if(Double.parseDouble(x50.getText().toString()) < Double.parseDouble(x58.getText().toString())){
            x66.setText("0");
            x1sum+=x2;
            y1sum+=y2;
            all1+=1;
        }else{
            x66.setText("1");
            x2sum+=x2;
            y2sum+=y2;
            all2+=1;
        }
        if(Double.parseDouble(x51.getText().toString()) < Double.parseDouble(x59.getText().toString())){
            x67.setText("0");
            x1sum+=x3;
            y1sum+=y3;
            all1+=1;
        }else{
            x67.setText("1");
            x2sum+=x3;
            y2sum+=y3;
            all2+=1;
        }
        if(Double.parseDouble(x52.getText().toString()) < Double.parseDouble(x60.getText().toString())){
            x68.setText("0");
            x1sum+=x4;
            y1sum+=y4;
            all1+=1;
        }else{
            x68.setText("1");
            x2sum+=x4;
            y2sum+=y4;
            all2+=1;
        }
        if(Double.parseDouble(x53.getText().toString()) < Double.parseDouble(x61.getText().toString())){
            x69.setText("0");
            x1sum+=x5;
            y1sum+=y5;
            all1+=1;
        }else{
            x69.setText("1");
            x2sum+=x5;
            y2sum+=y5;
            all2+=1;
        }
        if(Double.parseDouble(x54.getText().toString()) < Double.parseDouble(x62.getText().toString())){
            x70.setText("0");
            x1sum+=x6;
            y1sum+=y6;
            all1+=1;
        }else{
            x70.setText("1");
            x2sum+=x6;
            y2sum+=y6;
            all2+=1;
        }
        if(Double.parseDouble(x55.getText().toString()) < Double.parseDouble(x63.getText().toString())){
            x71.setText("0");
            x1sum+=x7;
            y1sum+=y7;
            all1+=1;
        }else{
            x71.setText("1");
            x2sum+=x7;
            y2sum+=y7;
            all2+=1;
        }
        if(Double.parseDouble(x56.getText().toString()) < Double.parseDouble(x64.getText().toString())){
            x72.setText("0");
            x1sum+=x8;
            y1sum+=y8;
            all1+=1;
        }else{
            x72.setText("1");
            x2sum+=x8;
            y2sum+=y8;
            all2+=1;
        }

        centr_x1 = x1sum/all1;
        centr_x2 = x2sum/all2;
        centr_y1 = y1sum/all1;
        centr_y2 = y2sum/all2;

        EditText centreX1 = (EditText)findViewById(R.id.editText101);
        EditText centreY1 = (EditText)findViewById(R.id.editText102);
        centreX1.setText(Double.toString(centr_x1)+" ; "+Double.toString(centr_y1));
        centreY1.setText(Double.toString(centr_x2)+" ; "+Double.toString(centr_y2));

    }
    public void iteration_3(){

        EditText x73 = (EditText)findViewById(R.id.editText73);
        EditText x74 = (EditText)findViewById(R.id.editText74);
        EditText x75 = (EditText)findViewById(R.id.editText75);
        EditText x76 = (EditText)findViewById(R.id.editText76);
        EditText x77 = (EditText)findViewById(R.id.editText77);
        EditText x78 = (EditText)findViewById(R.id.editText78);
        EditText x79 = (EditText)findViewById(R.id.editText79);
        EditText x80 = (EditText)findViewById(R.id.editText80);
        x73.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x1),2) + Math.pow((centr_y1-y1),2))));
        x74.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x2),2) + Math.pow((centr_y1-y2),2))));
        x75.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x3),2) + Math.pow((centr_y1-y3),2))));
        x76.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x4),2) + Math.pow((centr_y1-y4),2))));
        x77.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x5),2) + Math.pow((centr_y1-y5),2))));
        x78.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x6),2) + Math.pow((centr_y1-y6),2))));
        x79.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x7),2) + Math.pow((centr_y1-y7),2))));
        x80.setText(Double.toString(Math.sqrt(Math.pow((centr_x1-x8),2) + Math.pow((centr_y1-y8),2))));


        EditText x81 = (EditText)findViewById(R.id.editText81);
        EditText x82 = (EditText)findViewById(R.id.editText82);
        EditText x83 = (EditText)findViewById(R.id.editText83);
        EditText x84 = (EditText)findViewById(R.id.editText84);
        EditText x85 = (EditText)findViewById(R.id.editText85);
        EditText x86 = (EditText)findViewById(R.id.editText86);
        EditText x87 = (EditText)findViewById(R.id.editText87);
        EditText x88 = (EditText)findViewById(R.id.editText88);
        x81.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x1),2) + Math.pow((centr_y2-y1),2))));
        x82.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x2),2) + Math.pow((centr_y2-y2),2))));
        x83.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x3),2) + Math.pow((centr_y2-y3),2))));
        x84.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x4),2) + Math.pow((centr_y2-y4),2))));
        x85.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x5),2) + Math.pow((centr_y2-y5),2))));
        x86.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x6),2) + Math.pow((centr_y2-y6),2))));
        x87.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x7),2) + Math.pow((centr_y2-y7),2))));
        x88.setText(Double.toString(Math.sqrt(Math.pow((centr_x2-x8),2) + Math.pow((centr_y2-y8),2))));

        EditText x89 = (EditText)findViewById(R.id.editText89);
        EditText x90 = (EditText)findViewById(R.id.editText90);
        EditText x91 = (EditText)findViewById(R.id.editText91);
        EditText x92 = (EditText)findViewById(R.id.editText92);
        EditText x93 = (EditText)findViewById(R.id.editText93);
        EditText x94 = (EditText)findViewById(R.id.editText94);
        EditText x95 = (EditText)findViewById(R.id.editText95);
        EditText x96 = (EditText)findViewById(R.id.editText96);


        double all1 = 0;
        double all2 = 0;
        double x1sum = 0;
        double y1sum = 0;
        double x2sum = 0;
        double y2sum = 0;
        if(Double.parseDouble(x73.getText().toString()) < Double.parseDouble(x81.getText().toString())){
            x89.setText("0");
            x1sum+=x1;
            y1sum+=y1;
            all1+=1;
        }else{
            x89.setText("1");
            x2sum+=x1;
            y2sum+=y1;
            all2+=1;
        }
        if(Double.parseDouble(x74.getText().toString()) < Double.parseDouble(x82.getText().toString())){
            x90.setText("0");
            x1sum+=x2;
            y1sum+=y2;
            all1+=1;
        }else{
            x90.setText("1");
            x2sum+=x2;
            y2sum+=y2;
            all2+=1;
        }
        if(Double.parseDouble(x75.getText().toString()) < Double.parseDouble(x83.getText().toString())){
            x91.setText("0");
            x1sum+=x3;
            y1sum+=y3;
            all1+=1;
        }else{
            x91.setText("1");
            x2sum+=x3;
            y2sum+=y3;
            all2+=1;
        }
        if(Double.parseDouble(x76.getText().toString()) < Double.parseDouble(x84.getText().toString())){
            x92.setText("0");
            x1sum+=x4;
            y1sum+=y4;
            all1+=1;
        }else{
            x92.setText("1");
            x2sum+=x4;
            y2sum+=y4;
            all2+=1;
        }
        if(Double.parseDouble(x77.getText().toString()) < Double.parseDouble(x85.getText().toString())){
            x93.setText("0");
            x1sum+=x5;
            y1sum+=y5;
            all1+=1;
        }else{
            x93.setText("1");
            x2sum+=x5;
            y2sum+=y5;
            all2+=1;
        }
        if(Double.parseDouble(x78.getText().toString()) < Double.parseDouble(x86.getText().toString())){
            x94.setText("0");
            x1sum+=x6;
            y1sum+=y6;
            all1+=1;
        }else{
            x94.setText("1");
            x2sum+=x6;
            y2sum+=y6;
            all2+=1;
        }
        if(Double.parseDouble(x79.getText().toString()) < Double.parseDouble(x87.getText().toString())){
            x95.setText("0");
            x1sum+=x7;
            y1sum+=y7;
            all1+=1;
        }else{
            x95.setText("1");
            x2sum+=x7;
            y2sum+=y7;
            all2+=1;
        }
        if(Double.parseDouble(x80.getText().toString()) < Double.parseDouble(x88.getText().toString())){
            x96.setText("0");
            x1sum+=x8;
            y1sum+=y8;
            all1+=1;
        }else{
            x96.setText("1");
            x2sum+=x8;
            y2sum+=y8;
            all2+=1;
        }

        centr_x1 = x1sum/all1;
        centr_x2 = x2sum/all2;
        centr_y1 = y1sum/all1;
        centr_y2 = y2sum/all2;

        EditText centreX1 = (EditText)findViewById(R.id.editText103);
        EditText centreY1 = (EditText)findViewById(R.id.editText104);
        centreX1.setText(Double.toString(centr_x1)+" ; "+Double.toString(centr_y1));
        centreY1.setText(Double.toString(centr_x2)+" ; "+Double.toString(centr_y2));
    }


}
