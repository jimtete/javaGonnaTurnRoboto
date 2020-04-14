package com.example.ap1_6;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class MessageFragment extends Fragment {

    private Button button;
    private EditText editText;
    OnMessageSendListener listener;

    public interface OnMessageSendListener{
        public void onMessageSend(String message);
    }

    public MessageFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        button = view.findViewById(R.id.btn1);
        editText = view.findViewById(R.id.txt_message);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                listener.onMessageSend(message);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    public void onAttach(Context context){
        super.onAttach(context);
        Activity activity = (Activity) context;
        try {
            listener = (OnMessageSendListener) activity;
        }catch (ClassCastException e){
            throw new ClassCastException((activity.toString()+" must override on MessageRead..."));
        }
    }
}
