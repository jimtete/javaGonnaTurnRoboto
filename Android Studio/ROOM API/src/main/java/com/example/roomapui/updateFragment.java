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
public class updateFragment extends Fragment implements View.OnClickListener {

    Button sailorButton,boatButton,reservationButton;

    public updateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_update, container, false);

        sailorButton = view.findViewById(R.id.update_sailor);
        sailorButton.setOnClickListener(this);
        boatButton = view.findViewById(R.id.update_boat);
        boatButton.setOnClickListener(this);
        reservationButton = view.findViewById(R.id.update_reservation);
        reservationButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.delete_sailor:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new UpdateSailorFragment()).addToBackStack(null).commit();
                break;
            case R.id.delete_boat:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new UpdateBoatFragment()).addToBackStack(null).commit();
                break;
            case R.id.delete_reservation:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new UpdateReservationFragment()).addToBackStack(null).commit();
                break;
        }
    }
}
