package com.example.myroom;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class QueryFragment extends Fragment {


    TextView textView;
    public QueryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_query, container, false);

        textView=view.findViewById(R.id.textView);
        List<User> users = MainActivity.myAppDatabase.myDao().getUsers();
        String result = "";

        for (User usr: users){
            int code = usr.getId();
            String name = usr.getName();
            String surname = usr.getSurname();
            result = result + "\n Id: "+ code+"\n Name: "+name+"\n Surname: "+surname;

        }
        textView.setText(result);
        return view;
    }
}
