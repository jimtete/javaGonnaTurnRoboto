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
public class InsertBoatFragment extends Fragment {

    EditText editText1,editText2,editText3;
    Button submitButton;

    public InsertBoatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_insert_boat, container, false);

        editText1=view.findViewById(R.id.BoatEditText1);
        editText2=view.findViewById(R.id.BoatEditText2);
        editText3=view.findViewById(R.id.BoatEditText3);
        submitButton=view.findViewById(R.id.insert_boat_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int boatId=0;
                try{
                    boatId=Integer.parseInt(editText1.getText().toString());
                }catch (NumberFormatException ex){
                    System.out.println("Could not parse: "+ex);
                }
                String boatName= editText2.getText().toString();
                String boatColor=editText3.getText().toString();

                try{
                    Boats boats = new Boats();
                    boats.setId(boatId);
                    boats.setName(boatName);
                    boats.setColor(boatColor);

                    MainActivity.myAppDatabase.myDao().insertBoat(boats);
                    Toast.makeText(getActivity(),"Record added.",Toast.LENGTH_LONG).show();
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
