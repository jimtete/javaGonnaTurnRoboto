package com.example.ap1_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MessageFragment.OnMessageSendListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.fragmentContainer)!=null){
            if(savedInstanceState!=null)return;
            MessageFragment messageFragment = new MessageFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer,messageFragment,null).commit();
        }
    }
    @Override
    public void onMessageSend(String message){
        DisplayFragment displayFragment = new DisplayFragment();
        Bundle bundle = new Bundle();
        bundle.putString("message",message);
        displayFragment.setArguments(bundle);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, displayFragment, null);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
