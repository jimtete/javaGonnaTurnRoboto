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
public class InsertSailorFragment extends Fragment {

    EditText editText1,editText2,editText3,editText4;
    Button submitButton;

    public InsertSailorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_insert_sailor, container, false);

        editText1 = view.findViewById(R.id.SailorEditText1);
        editText2 = view.findViewById(R.id.SailorEditText2);
        editText3 = view.findViewById(R.id.SailorEditText3);
        editText4 = view.findViewById(R.id.SailorEditText4);

        submitButton = view.findViewById(R.id.insert_sailor_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sailorId = 0;
                try {
                    sailorId = Integer.parseInt(editText1.getText().toString());
                }catch (NumberFormatException ex){
                    System.out.println("Could not parse "+ex);
                }
                String sailorName=editText2.getText().toString();
                int sailorRating = 0;
                try {
                    sailorRating = Integer.parseInt(editText3.getText().toString());
                }catch (NumberFormatException ex){
                    System.out.println("Could not parse "+ex);
                }
                int sailorAge=0;
                try {
                    sailorAge = Integer.parseInt(editText4.getText().toString());
                }catch (NumberFormatException ex){
                    System.out.println("Could not parse "+ex);
                }

                try {
                    Sailors sailors = new Sailors();
                    sailors.setId(sailorId);
                    sailors.setName(sailorName);
                    sailors.setRating(sailorRating);
                    sailors.setAge(sailorAge);
                    MainActivity.myAppDatabase.myDao().insertSailor(sailors);
                    Toast.makeText(getActivity(),"Record added",Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    String message = e.getMessage();
                    Toast.makeText(getActivity(),message,Toast.LENGTH_LONG).show();
                }

                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
                editText4.setText("");

            }
        });

        return view;
    }
}
