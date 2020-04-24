package com.example.roomapui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.room.Room;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    public static ReservationDatabase myAppDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        myAppDatabase = Room.databaseBuilder(getApplicationContext(),ReservationDatabase.class,"reservesDB").allowMainThreadQueries().build();
        if(findViewById(R.id.fragmentContainer)!=null){
            if(savedInstanceState!=null)return;
            fragmentManager.beginTransaction().add(R.id.fragmentContainer, new MenuFragment()).commit();
        }
    }
}
