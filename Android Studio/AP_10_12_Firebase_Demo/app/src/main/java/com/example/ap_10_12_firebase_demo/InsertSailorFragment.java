package com.example.ap_10_12_firebase_demo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;


/**
 * A simple {@link Fragment} subclass.
 */
public class InsertSailorFragment extends Fragment {

    EditText editText1,editText2,editText3,editText4;
    Button button;

    public InsertSailorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_insert_sailor, container, false);

        editText1 = view.findViewById(R.id.editText_insert_sailor_sid);
        editText2 = view.findViewById(R.id.editText_insert_sailor_name);
        editText3 = view.findViewById(R.id.editText_insert_sailor_rating);
        editText4 = view.findViewById(R.id.editText_insert_sailor_age);

        button = view.findViewById(R.id.button_submit_sailor);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sid = 0;
                try{
                    sid = Integer.parseInt(editText1.getText().toString());
                }catch(NumberFormatException ex){
                    System.out.println("Could not parse");
                }
                String sname = editText2.getText().toString();
                int rating = Integer.parseInt(editText3.getText().toString());
                int age = Integer.parseInt(editText4.getText().toString());

                try {
                    Sailors sailors = new Sailors();
                    sailors.setSid(sid);
                    sailors.setAge(age);
                    sailors.setRating(rating);
                    sailors.setSname(sname);
                    MainActivity.db.
                            collection("Sailors").
                            document(""+sid).
                            set(sailors).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            Toast.makeText(getActivity(),"Sailors added.",Toast.LENGTH_LONG).show();
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(getActivity(),"Add operation failed.",Toast.LENGTH_LONG).show();
                        }
                    });
                }catch (Exception e){
                    Toast.makeText(getActivity(),e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });
        editText1.setText("");editText2.setText("");editText3.setText("");editText4.setText("");


        return view;
    }
}
