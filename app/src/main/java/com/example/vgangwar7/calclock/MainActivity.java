package com.example.vgangwar7.calclock;


import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual, buttondel;

    EditText edttxt ;

    float mValueOne , mValueTwo ,mtemp ;

    int mpass = 12345;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        edttxt = (EditText) findViewById(R.id.edt1);
        buttondel = (Button) findViewById(R.id.buttondel);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                edttxt.setText(edttxt.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                edttxt.setText(edttxt.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                edttxt.setText(edttxt.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                edttxt.setText(edttxt.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                edttxt.setText(edttxt.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                edttxt.setText(edttxt.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                edttxt.setText(edttxt.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                edttxt.setText(edttxt.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                edttxt.setText(edttxt.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                edttxt.setText(edttxt.getText()+"0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                if (edttxt == null){
                    edttxt.setText("");
                }else {
                    mValueOne = Float.parseFloat(edttxt.getText() + "");
                    mAddition = true;
                    edttxt.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                if (edttxt == null){
                    edttxt.setText("");
                }else {
                    mValueOne = Float.parseFloat(edttxt.getText() + "");
                    mSubtract = true;
                    edttxt.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                if (edttxt == null){
                    edttxt.setText("");
                }else {
                    mValueOne = Float.parseFloat(edttxt.getText() + "");
                    mMultiplication = true;
                    edttxt.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                if (edttxt == null){
                    edttxt.setText("");
                }else {
                    mValueOne = Float.parseFloat(edttxt.getText()+"");
                    mDivision = true ;
                    edttxt.setText(null);
                }

            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                mValueOne = (int)Float.parseFloat(edttxt.getText() + "");
                if (mValueOne == mpass){
                    edttxt.setText("found");
                    Intent intent = new Intent(v.getContext() , StorageActivity.class);
                    startActivity(intent);
                }else {
                    if (edttxt == null) {
                        edttxt.setText("");
                    } else {
                        mValueTwo = Float.parseFloat(edttxt.getText() + "");
                        if (mAddition == true) {

                            edttxt.setText(mValueOne + mValueTwo + "");
                            mAddition = false;
                        }


                        if (mSubtract == true) {
                            edttxt.setText(mValueOne - mValueTwo + "");
                            mSubtract = false;
                        }

                        if (mMultiplication == true) {
                            edttxt.setText(mValueOne * mValueTwo + "");
                            mMultiplication = false;
                        }

                        if (mDivision == true) {
                            edttxt.setText(mValueOne / mValueTwo + "");
                            mDivision = false;
                        }
                    }
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                edttxt.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                edttxt.setText(edttxt.getText()+".");
            }
        });

        buttondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(30);
                if (edttxt == null) {
                    edttxt.setText("");
                }else {
                    mtemp = Float.parseFloat(edttxt.getText() + "");
                    int value = (int) (Math.floor(mtemp / 10));
                    edttxt.setText(value + "");
                    if (mtemp == 0.0) {
                        edttxt.setText("");
                    }
                }
        }});
        }



}