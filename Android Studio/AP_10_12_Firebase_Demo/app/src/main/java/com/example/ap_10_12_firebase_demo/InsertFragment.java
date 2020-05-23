package com.example.ap_10_12_firebase_demo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class InsertFragment extends Fragment implements View.OnClickListener {


    Button sailorButton,boatButton,reserveButton;
    Button query1Button,query2Button,query3Button,query4Button,query5Button;

    public InsertFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_insert, container, false);

        sailorButton = view.findViewById(R.id.button_insert_sailor_fragment);
        sailorButton.setOnClickListener(this);
        boatButton = view.findViewById(R.id.button_insert_boat_fragment);
        boatButton.setOnClickListener(this);
        reserveButton = view.findViewById(R.id.button_insert_reservation_fragment);
        reserveButton.setOnClickListener(this);
        query1Button = view.findViewById(R.id.button_query1_fragment);
        query1Button.setOnClickListener(this);
        query2Button = view.findViewById(R.id.button_query2_fragment);
        query2Button.setOnClickListener(this);
        query3Button = view.findViewById(R.id.button_query3_fragment);
        query3Button.setOnClickListener(this);
        query4Button = view.findViewById(R.id.button_query4_fragment);
        query4Button.setOnClickListener(this);
        query5Button = view.findViewById(R.id.button_query5_fragment);
        query5Button.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_insert_sailor_fragment:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new InsertSailorFragment()).addToBackStack(null).commit();
                break;
            case R.id.button_insert_boat_fragment:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new InsertBoatFragment()).addToBackStack(null).commit();
                break;
            case R.id.button_insert_reservation_fragment:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new InsertReserveFragment()).addToBackStack(null).commit();
                break;
            case R.id.button_query1_fragment:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Query1Fragment()).addToBackStack(null).commit();
                break;
            case R.id.button_query2_fragment:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Query2Fragment()).addToBackStack(null).commit();
                break;
            case R.id.button_query3_fragment:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Query3Fragment()).addToBackStack(null).commit();
                break;
            case R.id.button_query4_fragment:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Query4Fragment()).addToBackStack(null).commit();
                break;
            case R.id.button_query5_fragment:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Query5Fragment()).addToBackStack(null).commit();
                break;
        }
    }
}
