package com.example.myroom;

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
public class DeleteFragment extends Fragment {

    EditText delEditText;
    Button delButton;


    public DeleteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete, container, false);

        delEditText = view.findViewById(R.id.editTextDel);
        delButton = view.findViewById(R.id.delButton);
        delButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_userId = 0;
                try{
                    Var_userId = Integer.parseInt(delEditText.getText().toString());
                }catch (NumberFormatException ex){
                    System.out.println("Could not parse! "+ex);
                }
                User user = new User();
                user.setId(Var_userId);
                MainActivity.myAppDatabase.myDao().deleteUser(user);
                Toast.makeText(getActivity(),"User deleted",Toast.LENGTH_LONG).show();
                delEditText.setText("");
            }
        });


        return view;
    }
}
