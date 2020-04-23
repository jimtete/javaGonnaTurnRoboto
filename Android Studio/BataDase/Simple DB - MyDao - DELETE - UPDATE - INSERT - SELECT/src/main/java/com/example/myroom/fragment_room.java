package com.example.myroom;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;


public class fragment_room extends Fragment implements View.OnClickListener {

    Button button,qButton,deleteButton,updateButton;

    public fragment_room() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_room, container, false);
        // Inflate the layout for this fragment

        button = view.findViewById(R.id.add_user);
        qButton = view.findViewById(R.id.write_query);
        deleteButton = view.findViewById(R.id.del_user);
        updateButton = view.findViewById(R.id.updateUser);
        button.setOnClickListener(this);
        qButton.setOnClickListener(this);
        deleteButton.setOnClickListener(this);
        updateButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.add_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new InsertFragment()).addToBackStack(null).commit();
                break;
            case R.id.write_query:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new QueryFragment()).addToBackStack(null).commit();
                break;
            case R.id.del_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new DeleteFragment()).addToBackStack(null).commit();
                break;
            case R.id.updateUser:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new UpdateFragment()).addToBackStack(null).commit();
                break;
        }
    }


}
