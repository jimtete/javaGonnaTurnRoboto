package com.example.ap1_7;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class HeadLine extends Fragment implements View.OnClickListener {
    @Nullable

    private TextView txtJava, txtKotlin, txtPython;

    OnHeadLineSelectListener headLineSelectListener;

    interface OnHeadLineSelectListener{
        public void onHeadLineSelected(int positions);
    }

    public HeadLine() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_head_line,
                container, false);
        txtJava = view.findViewById(R.id.txtJava);
        txtJava.setOnClickListener(this);
        txtKotlin = view.findViewById(R.id.txtKotlin);
        txtKotlin.setOnClickListener(this);
        txtPython = view.findViewById(R.id.txtPython);
        txtPython.setOnClickListener(this);
        return view;



    }

    @Override
    public void onClick(View v) {
        txtJava = v.findViewById(R.id.txtJava);
        txtKotlin = v.findViewById(R.id.txtKotlin);
        txtPython = v.findViewById(R.id.txtPython);
        switch (v.getId()){
            case R.id.txtJava:
                headLineSelectListener.onHeadLineSelected(0);
                break;
            case R.id.txtKotlin:
                headLineSelectListener.onHeadLineSelected(1);
                break;
            case R.id.txtPython:
                headLineSelectListener.onHeadLineSelected(2);
                break;
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;
        try {
            headLineSelectListener = (OnHeadLineSelectListener) activity;
        } catch (ClassCastException e){
            throw new ClassCastException(activity.toString()+" must implement the method onHeadLineSelected");
        }
    }

}
