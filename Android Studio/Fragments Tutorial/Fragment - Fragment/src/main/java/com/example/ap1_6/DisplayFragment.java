package com.example.ap1_6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment {
    private TextView textView;
    public DisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display, container, false);

        textView=view.findViewById(R.id.msgDisplay);
        Bundle bundle = getArguments();
        String message = bundle.getString("message");
        textView.setText(message);
        // Inflate the layout for this fragment
        return view;
    }
}
