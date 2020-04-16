package com.example.ap2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextInputLayout txt1, txt2;
    TextInputEditText txtName, txtTele;

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1= findViewById(R.id.til1);
        txt2 = findViewById(R.id.til2);
        txtName = findViewById(R.id.tied1);
        txtTele = findViewById(R.id.tied2);

        submit = findViewById(R.id.btn1);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitForm();
            }
        });


    }



    public void requestFocus(View view){
        if (view.requestFocus()){
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }

    private boolean validate_name(){
        if(txtName.getText().toString().trim().isEmpty()){
            txt1.setError("Συμπληρώστε το όνομα σας");
            requestFocus(txtName);
            return false;
        }

        if (txtName.getText().toString().length()<3){
            txt1.setError("Το όνομα δεν μπορεί να είναι μικρότερο από 3 χαρακτήρες");
            requestFocus(txtName);
            return false;
        }else{
            txt1.setErrorEnabled(false);
        }

        return true;
    }

    private boolean validate_tele(){
        if (txtTele.getText().toString().length()!=10){
            txt2.setError("Το τηλέφωνο πρέπει να είναι μήκους 10 χαρακτήρες");
            requestFocus(txtTele);
            return false;
        }else{
            txt2.setErrorEnabled(false);
        }

        return true;
    }

    private void submitForm(){
        if (!validate_name()) return;
        if (!validate_tele()) return;

        String name = txtName.getText().toString().trim()+"";
        String tele = txtTele.getText().toString().trim()+"";

        Toast.makeText(getApplicationContext(), name+"\n"+tele+"\n OK", Toast.LENGTH_LONG).show();
    }
}
