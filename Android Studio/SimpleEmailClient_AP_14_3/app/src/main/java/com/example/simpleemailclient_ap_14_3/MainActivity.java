package com.example.simpleemailclient_ap_14_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText1,editText2,editText3;
    Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editText_to);
        editText2=findViewById(R.id.editText_Subject);
        editText3=findViewById(R.id.editText_Message);

        submitButton = findViewById(R.id.button_send);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });
    }

    private boolean haveNetwork(){
        boolean hasWifi = false;
        boolean hasMobileData = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo [] networkInfos = connectivityManager.getAllNetworkInfo();

        for (NetworkInfo info: networkInfos){
            if (info.getTypeName().equalsIgnoreCase("WIFI")){
                if (info.isConnected()) hasWifi=true;
            }else{
                if (info.getTypeName().equalsIgnoreCase("MOBILE")){
                    if (info.isConnected())hasMobileData=true;
                }
            }
        }

        return (hasWifi||hasMobileData);
    }

    private void sendMail() {
        if(haveNetwork()){
            String recipientsLists = editText1.getText().toString();
            String[] recipients = recipientsLists.split(",");
            String subject = editText2.getText().toString();
            String message = editText3.getText().toString();

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_EMAIL, recipients);
            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            intent.putExtra(Intent.EXTRA_TEXT,message);

            intent.setType("message/rfc822");
            startActivity(intent);
        }else{
            Toast.makeText(this,"No internet access",Toast.LENGTH_LONG).show();
        }
    }
}
