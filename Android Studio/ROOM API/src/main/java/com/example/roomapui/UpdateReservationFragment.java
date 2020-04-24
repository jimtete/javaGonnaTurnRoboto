package com.example.roomapui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpdateReservationFragment extends Fragment {

    EditText editText1,editText2,editText3;
    Button submitButton;

    public UpdateReservationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update_reservation, container, false);

        editText1=view.findViewById(R.id.UpdateReservationEditText1);
        editText2=view.findViewById(R.id.UpdateReservationEditText1);
        editText3=view.findViewById(R.id.UpdateReservationEditText1);
        submitButton=view.findViewById(R.id.update_reservation_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int boatId=0;
                try{
                    boatId=Integer.parseInt(editText1.getText().toString());
                }catch (NumberFormatException ex){
                    System.out.println("Could not parse: "+ex);
                }
                int sailorId=0;
                try{
                    sailorId=Integer.parseInt(editText2.getText().toString());
                }catch (NumberFormatException ex){
                    System.out.println("Could not parse: "+ex);
                }

                String date=editText3.getText().toString();

                try{
                    Reserves reserves = new Reserves();
                    reserves.setSid(sailorId);
                    reserves.setBid(boatId);
                    reserves.setRes_day(date);

                    MainActivity.myAppDatabase.myDao().updateReservation(reserves);
                    Toast.makeText(getActivity(),"Record updated...",Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    String message = e.getMessage();
                    Toast.makeText(getActivity(),message,Toast.LENGTH_LONG).show();
                }
                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
            }

        });

        return view;
    }
}
