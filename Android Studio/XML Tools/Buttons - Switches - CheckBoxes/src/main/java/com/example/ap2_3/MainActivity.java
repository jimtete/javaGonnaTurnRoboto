package com.example.ap2_3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    Switch aSwitch;

    TextView textView;
    CheckBox checkBox1, checkBox2, checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = findViewById(R.id.imageButton2);
        aSwitch=findViewById(R.id.switch1);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Image Button",Toast.LENGTH_LONG).show();
            }
        });

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    imageButton.setEnabled(true);
                    aSwitch.setText("Enabled");
                }else{
                    imageButton.setEnabled(false);
                    aSwitch.setText("Disabled");
                }
            }






        });

        //Askhsh 2

        textView = findViewById(R.id.textView);
        checkBox1= findViewById(R.id.checkRed);
        checkBox2= findViewById(R.id.checkGreen);
        checkBox3= findViewById(R.id.checkBlue);

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                textView.setBackgroundColor(getResources().getColor(R.color.gay, null));
                if (checkBox1.isChecked())textView.setBackgroundColor(getColor(R.color.red));

            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                textView.setBackgroundColor(getResources().getColor(R.color.gay, null));
                if (checkBox2.isChecked())textView.setBackgroundColor(getColor(R.color.green));
            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                textView.setBackgroundColor(getResources().getColor(R.color.gay, null));
                if (checkBox3.isChecked())textView.setBackgroundColor(getColor(R.color.blue));
            }
        });
    }
}
