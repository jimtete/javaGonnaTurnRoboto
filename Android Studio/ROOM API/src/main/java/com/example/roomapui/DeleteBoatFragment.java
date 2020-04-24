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
public class DeleteBoatFragment extends Fragment {

    EditText editText;
    Button button;

    public DeleteBoatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_boat, container, false);

        editText = view.findViewById(R.id.editText1);
        button = view.findViewById(R.id.delete_boat_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id =0;
                try{
                    id = Integer.parseInt(editText.getText().toString());
                }catch (NumberFormatException ex){
                    System.out.println("Could not parse: "+ex);
                }
                Boats temp = new Boats();
                temp.setId(id);
                try{
                    MainActivity.myAppDatabase.myDao().deleteBoat(temp);
                    Toast.makeText(getActivity(),"User deleted",Toast.LENGTH_LONG).show();
                    editText.setText("");
                }catch (Exception e){
                    String message = e.getMessage();
                    Toast.makeText(getActivity(),message,Toast.LENGTH_LONG).show();
                }
            }
        });

        return view;
    }
}
