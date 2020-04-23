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
public class InsertFragment extends Fragment {


    EditText et1,et2,et3;
    Button button;

    public InsertFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_insert, container, false);
        // Inflate the layout for this fragment

        et1 = view.findViewById(R.id.editText);
        et2 = view.findViewById(R.id.editText2);
        et3 = view.findViewById(R.id.editText3);
        button = view.findViewById(R.id.submituser);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_userid=0;
                try{
                    Var_userid = Integer.parseInt(et1.getText().toString());
                } catch (NumberFormatException ex){
                    System.out.println("Could not parse "+ex);
                }
                String Var_username = et2.getText().toString();
                String Var_usersurname = et3.getText().toString();

                User user = new User();
                user.setId(Var_userid);
                user.setName(Var_username);
                user.setSurname(Var_usersurname);
                MainActivity.myAppDatabase.myDao().addUser(user);
                Toast.makeText(getActivity(), "Ola kala", Toast.LENGTH_LONG).show();
                et1.setText("");
                et2.setText("");
                et3.setText("");


            }
        });


        return view;
    }
}
