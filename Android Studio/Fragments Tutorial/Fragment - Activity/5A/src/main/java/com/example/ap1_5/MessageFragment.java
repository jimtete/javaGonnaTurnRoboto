package com.example.ap1_5;

import android.app.Activity;
import android.content.Context;
import android.location.OnNmeaMessageListener;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class MessageFragment extends Fragment {


    Button button;
    OnMessageReadListener onMessageReadListener;

    public MessageFragment(){}

    public interface OnMessageReadListener{
        public void onMessageRead(String message);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        final EditText editText=(EditText) view.findViewById(R.id.txt_message);
        Button button =(Button) view.findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                onMessageReadListener.onMessageRead(message);
            }
        });


        // Inflate the layout for this fragment
        return view;
    }

    public void onAttach(Context context){
        super.onAttach(context);
        Activity activity = (Activity) context;
        try {
            onMessageReadListener = (OnMessageReadListener) activity;
        }catch (ClassCastException e){
            throw new ClassCastException((activity.toString()+" must override on MEssageRead..."));
        }
    }
}
