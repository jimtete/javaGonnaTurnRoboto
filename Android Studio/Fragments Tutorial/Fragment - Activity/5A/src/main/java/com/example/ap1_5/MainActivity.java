package com.example.ap1_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MessageFragment.OnMessageReadListener{ /**/

    private TextView textView;
    public static FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        if(findViewById(R.id.fragmentContainer)!=null){
            if(savedInstanceState!=null){
                return;
            }
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            MessageFragment messageFragment = new MessageFragment();
            fragmentTransaction.add(R.id.fragmentContainer,messageFragment,null);
            fragmentTransaction.commit();
       }
    }

    @Override
    public void onMessageRead(String message){
        textView = findViewById(R.id.txt_display_msg);
        textView.setText(message);
    }


}
