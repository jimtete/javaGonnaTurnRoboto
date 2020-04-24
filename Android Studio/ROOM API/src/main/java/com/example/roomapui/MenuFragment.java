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
public class MenuFragment extends Fragment implements View.OnClickListener {


    Button insertButton,queriesButton,deleteButton,updateButton;
    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        insertButton=view.findViewById(R.id.insert_button);
        insertButton.setOnClickListener(this);
        queriesButton=view.findViewById(R.id.queries_button);
        queriesButton.setOnClickListener(this);
        deleteButton=view.findViewById(R.id.delete_button);
        deleteButton.setOnClickListener(this);
        updateButton=view.findViewById(R.id.update_button);
        updateButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.insert_button:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new insertFragment()).addToBackStack(null).commit();
                break;
            case R.id.queries_button:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new QueryFragment()).addToBackStack(null).commit();
                break;
            case R.id.delete_button:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new deleteFragment()).addToBackStack(null).commit();
                break;
            case R.id.update_button:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new updateFragment()).addToBackStack(null).commit();
                break;
        }
    }
}
