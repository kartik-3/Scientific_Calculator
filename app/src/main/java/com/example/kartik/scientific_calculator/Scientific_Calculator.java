package com.example.kartik.scientific_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Scientific_Calculator extends AppCompatActivity {
    Button zero, one, two, three, four, five, six, seven, eight, nine, dec, add, sub, mul, div, equal, sin, log, cos, tan, inv, square, clear,fac,sqrt;
    EditText edt1;
    double val1, val2, pi=22/7;
    boolean mAdd, mSub, mMul, mDiv, mSin, mCos, mTan, mLog, mSquare, mInv, mFac, mSqrt;
    public double factorial(double a){
        for(double i=a-1;i>1;i--)
        {
            a*=i;
        }
        return (a);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific__calculator);
        zero = (Button) findViewById(R.id.button11);
        one = (Button) findViewById(R.id.button);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eight = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);
        dec = (Button) findViewById(R.id.button10);
        clear = (Button) findViewById(R.id.button12);
        sin = (Button) findViewById(R.id.button13);
        cos = (Button) findViewById(R.id.button14);
        tan = (Button) findViewById(R.id.button15);
        log = (Button) findViewById(R.id.button16);
        inv = (Button) findViewById(R.id.button17);
        square = (Button) findViewById(R.id.button18);
        add = (Button) findViewById(R.id.button19);
        sub = (Button) findViewById(R.id.button20);
        mul = (Button) findViewById(R.id.button21);
        div = (Button) findViewById(R.id.button22);
        equal = (Button) findViewById(R.id.button23);
        fac= (Button) findViewById(R.id.button25);
        sqrt= (Button) findViewById(R.id.button24);
        edt1 = (EditText) findViewById(R.id.editText);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "0");

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + "9");

            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText() + ".");

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAdd=false;
                mCos=false;
                mSin=false;
                mDiv=false;
                mInv=false;
                mLog=false;
                mMul=false;
                mSin=false;
                mSquare=false;
                mSub=false;
                mTan=false;
                edt1.setText(null);


            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Double.parseDouble(edt1.getText()+"");
                /*mSin=true;
                edt1.setText(null);
                */val1=(val1*pi)/180;
                edt1.setText(Math.sin(val1)+"");
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Double.parseDouble(edt1.getText()+"");
                /*mCos=true;
                edt1.setText(null);
*/
                val1=(val1*pi)/180;
                edt1.setText(Math.cos(val1)+"");
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Double.parseDouble(edt1.getText()+"");
             /*   mTan=true;
                edt1.setText(null);
*/
                val1=(val1*pi)/180;
                edt1.setText(Math.tan(val1)+"");
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Double.parseDouble(edt1.getText()+"");
               /* mLog=true;
                edt1.setText(null);
*/
                edt1.setText(Math.log(val1)+"");
            }
        });

        inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Float.parseFloat(edt1.getText()+"");
               /* mInv=true;
                edt1.setText(null);
*/
                val2=1/val1;
                edt1.setText(val2+ "");
            }
        });

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Float.parseFloat(edt1.getText()+"");
                /*mSquare=true;
                edt1.setText(null);*/
                edt1.setText(val1*val1+"");

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Float.parseFloat(edt1.getText()+"");
                mAdd=true;
                edt1.setText(null);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Float.parseFloat(edt1.getText()+"");
                mSub=true;
                edt1.setText(null);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Float.parseFloat(edt1.getText()+"");
                mMul=true;
                edt1.setText(null);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Float.parseFloat(edt1.getText()+"");
                mDiv=true;
                edt1.setText(null);

            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Double.parseDouble(edt1.getText()+"");
                edt1.setText(Math.sqrt(val1)+"");
            }
        });

        fac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Double.parseDouble(edt1.getText()+"");
                val2=factorial(val1);
                edt1.setText(val2+"");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mAdd==true)
                {
                    val2=Float.parseFloat(edt1.getText()+"");
                    edt1.setText(val1+val2+"");
                    mAdd=false;
                }
                if(mSub==true)
                {
                    val2=Float.parseFloat(edt1.getText()+"");
                    edt1.setText(val1-val2+"");
                    mSub=false;
                }
                if(mMul==true)
                {
                    val2=Float.parseFloat(edt1.getText()+"");
                    edt1.setText(val1*val2+"");
                    mMul=false;
                }
                if(mDiv==true)
                {
                    val2=Float.parseFloat(edt1.getText()+"");
                    edt1.setText(val1/val2+"");
                    mDiv=false;
                }/*
                if(mInv==true)
                {
                    val2=1/val1;
                    edt1.setText(val2+ "");
                    mInv=false;
                }
                if(mSquare==true)
                {
                    edt1.setText(val1*val1+"");
                    mSquare=false;
                }
                if(mSin==true)
                {
                    val1=(val1*pi)/180;
                    edt1.setText(Math.sin(val1)+"");
                    mSin=false;
                }
                if(mCos==true)
                {
                    val1=(val1*pi)/180;
                    edt1.setText(Math.cos(val1)+"");
                    mCos=false;
                }
                if(mTan==true)
                {
                    val1=(val1*pi)/180;
                    edt1.setText(Math.tan(val1)+"");
                    mTan=false;
                }
                if(mLog==true)
                {
                    edt1.setText(Math.log(val1)+"");
                    mLog=false;
                }
                if(mFac==true)
                {
                    val2=factorial(val1);
                    edt1.setText(val2+"");
                    mFac=false;
                }
                if(mSqrt==true)
                {
                    edt1.setText(Math.sqrt(val1)+"");
                    mSqrt=false;
                }*/
            }
        });
    }
}