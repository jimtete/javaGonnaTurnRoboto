package com.example.roomapui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class insertFragment extends Fragment implements View.OnClickListener {

    Button sailorButton,boatButton,reservationButton;

    public insertFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_insert, container, false);

        sailorButton = view.findViewById(R.id.insert_sailor);
        sailorButton.setOnClickListener(this);
        boatButton = view.findViewById(R.id.insert_boat);
        boatButton.setOnClickListener(this);
        reservationButton = view.findViewById(R.id.insert_reservation);
        reservationButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.insert_sailor:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new InsertSailorFragment()).addToBackStack(null).commit();
                break;
            case R.id.insert_boat:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new InsertBoatFragment()).addToBackStack(null).commit();
                break;
            case R.id.insert_reservation:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new InsertReservationFragment()).addToBackStack(null).commit();
                break;
        }
    }
}
