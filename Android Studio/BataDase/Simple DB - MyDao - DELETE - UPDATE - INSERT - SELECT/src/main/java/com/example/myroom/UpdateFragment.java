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
public class UpdateFragment extends Fragment {

    EditText editText1,editText2,editText3;
    Button button;

    public UpdateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_update, container, false);

        editText1 = view.findViewById(R.id.upEditText1);
        editText2 = view.findViewById(R.id.upEditText2);
        editText3 = view.findViewById(R.id.upEditText3);

        button = view.findViewById(R.id.update_User);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_userId = 0;
                try{
                    Var_userId = Integer.parseInt(editText1.getText().toString());
                }catch (NumberFormatException ex){
                    System.out.println("Could not parse! "+ex);
                }
                String Var_username = editText2.getText().toString();
                String Var_usersurname = editText3.getText().toString();

                User user = new User();
                user.setId(Var_userId);
                user.setName(Var_username);
                user.setSurname(Var_usersurname);

                MainActivity.myAppDatabase.myDao().updateUser(user);
                Toast.makeText(getActivity(),"One record updated!",Toast.LENGTH_LONG).show();
                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
            }
        });




        return view;
    }
}
