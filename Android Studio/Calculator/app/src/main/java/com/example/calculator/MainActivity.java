package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int number;
    private String maths;
    TextView showNum;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bE,bD,bA,bS,bDiv,bM,bP,bC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=0;

        maths="";
        showNum = findViewById(R.id.editText);
        b0 = findViewById(R.id.button0);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        bE = findViewById(R.id.buttonEquals);
        bE.setEnabled(false);
        bD = findViewById(R.id.buttonDot);
        bA = findViewById(R.id.buttonPlus);
        bS = findViewById(R.id.buttonMinus);
        bDiv =findViewById(R.id.buttonDiv);
        bM = findViewById(R.id.buttonMul);
        bP = findViewById(R.id.powerButton);
        bC = findViewById(R.id.resetButton);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNumber(1,showNum);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNumber(2,showNum);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNumber(3,showNum);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNumber(4,showNum);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNumber(5,showNum);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNumber(6,showNum);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNumber(7,showNum);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNumber(8,showNum);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNumber(9,showNum);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNumber(0,showNum);
            }
        });

        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=0;
                maths="";
                showNum.setText(String.valueOf(""));
                resetButtons(true);
                resetNumeros(true);
            }
        });

        bD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=0;

                showNum.setText(showNum.getText().toString()+".");
                bD.setEnabled(false);

            }
        });

        bA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetNumeros(true);
                maths="Sum";
                resetButtons(false);
                showNum.setText(showNum.getText().toString()+"+");
            }
        });
        bS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetNumeros(true);
                maths="Sub";
                resetButtons(false);
                showNum.setText(showNum.getText().toString()+"-");
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetNumeros(true);
                maths="Div";
                resetButtons(false);
                showNum.setText(showNum.getText().toString()+"/");
            }
        });
        bM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetNumeros(true);
                maths="Multi";
                resetButtons(false);
                showNum.setText(showNum.getText().toString()+"*");
            }
        });
        bP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetNumeros(true);
                maths="Power";
                resetButtons(false);
                showNum.setText(showNum.getText().toString()+"^");
            }
        });
        bE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetNumeros(false);
                String viewer = showNum.getText().toString();
                double a,b;
                resetButtons(true);
                switch (maths){
                    case "Sum":
                        a=Double.valueOf(viewer.substring(0,viewer.indexOf("+")));
                        b=Double.valueOf(viewer.substring(viewer.indexOf("+")+1,viewer.length()));
                        showNum.setText(String.valueOf(calcHub.addCalc(a,b)));
                        break;
                    case "Sub":
                        a=Double.valueOf(viewer.substring(0,viewer.indexOf("-")));
                        b=Double.valueOf(viewer.substring(viewer.indexOf("-")+1,viewer.length()));
                        showNum.setText(String.valueOf(calcHub.subCalc(a,b)));
                        break;
                    case "Div":
                        a=Double.valueOf(viewer.substring(0,viewer.indexOf("/")));
                        b=Double.valueOf(viewer.substring(viewer.indexOf("/")+1,viewer.length()));
                        showNum.setText(String.valueOf(calcHub.divCalc(a,b)));
                        break;
                    case "Multi":
                        a=Double.valueOf(viewer.substring(0,viewer.indexOf("*")));
                        b=Double.valueOf(viewer.substring(viewer.indexOf("*")+1,viewer.length()));
                        showNum.setText(String.valueOf(calcHub.mulCalc(a,b)));
                        break;
                    case "Power":
                        a=Double.valueOf(viewer.substring(0,viewer.indexOf("^")));
                        b=Double.valueOf(viewer.substring(viewer.indexOf("^")+1,viewer.length()));
                        showNum.setText(String.valueOf(calcHub.powCalc(a,b)));
                        break;
                }
                bE.setEnabled(false);
            }
        });

    }

    public void showNumber(int a,TextView yes){
        number=(number*10)+a;
        yes.setText(yes.getText().toString()+String.valueOf(a));
    }

    public void resetButtons(boolean t){
        bD.setEnabled(true);
        bE.setEnabled(true);
        bA.setEnabled(t);
        bS.setEnabled(t);
        bDiv.setEnabled(t);
        bM.setEnabled(t);
        bP.setEnabled(t);
    }

    public void resetNumeros(boolean maybe){
        b1.setEnabled(maybe);
        b2.setEnabled(maybe);
        b3.setEnabled(maybe);
        b4.setEnabled(maybe);
        b5.setEnabled(maybe);
        b6.setEnabled(maybe);
        b7.setEnabled(maybe);
        b8.setEnabled(maybe);
        b9.setEnabled(maybe);
        b0.setEnabled(maybe);
        bD.setEnabled(maybe);

    }
}
