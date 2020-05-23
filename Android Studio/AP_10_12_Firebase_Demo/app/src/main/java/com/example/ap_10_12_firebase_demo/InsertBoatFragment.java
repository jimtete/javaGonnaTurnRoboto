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
public class InsertBoatFragment extends Fragment {

    public InsertBoatFragment() {
        // Required empty public constructor
    }

    EditText editText1,editText2,editText3;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_insert_boat, container, false);
        editText1 = view.findViewById(R.id.editText_insert_boat_bid);
        editText2 = view.findViewById(R.id.editText_insert_boat_bname);
        editText3 = view.findViewById(R.id.editText_insert_boat_color);
        button = view.findViewById(R.id.button_submit_boat);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bid = Integer.parseInt(editText1.getText().toString());
                String bname = editText2.getText().toString();
                String color = editText3.getText().toString();

                try{
                    Boats boats = new Boats();
                    boats.setBid(bid);
                    boats.setColor(color);
                    boats.setBname(bname);
                    MainActivity.db.collection("Boats").
                            document(""+bid).set(boats).
                            addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    Toast.makeText(getActivity(),"Boat added.",Toast.LENGTH_LONG).show();
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(getActivity(),"add operation failed",Toast.LENGTH_LONG).show();
                        }
                    });
                }catch (Exception e){
                    Toast.makeText(getActivity(),e.getMessage(),Toast.LENGTH_LONG).show();
                }
                editText1.setText("");editText2.setText("");editText3.setText("");
            }
        });

        return view;
    }
}
