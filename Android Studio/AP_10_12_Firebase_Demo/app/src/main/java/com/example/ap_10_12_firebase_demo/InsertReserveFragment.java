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

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;


/**
 * A simple {@link Fragment} subclass.
 */
public class InsertReserveFragment extends Fragment {

    EditText editText1,editText2,editText3;
    Button button;

    public InsertReserveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_insert_reserve, container, false);

        editText1 = view.findViewById(R.id.editText_insert_reserve_sid);
        editText2 = view.findViewById(R.id.editText_insert_reserve_bid);
        editText3 = view.findViewById(R.id.editText_insert_reserve_date);
        button = view.findViewById(R.id.submit_reserve);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sid = editText1.getText().toString();
                DocumentReference vSid = MainActivity.db.document("/Sailors/"+sid);
                String bid = editText2.getText().toString();
                DocumentReference vBid = MainActivity.db.document("/Boats/"+bid);
                String date = editText3.getText().toString();
                try{
                    Reserves reserves = new Reserves();
                    reserves.setBid(vBid);
                    reserves.setSid(vSid);
                    reserves.setResDay(date);
                    MainActivity.db.collection("Reserves").
                            add(reserves).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                        @Override
                        public void onSuccess(DocumentReference documentReference) {
                            Toast.makeText(getActivity(),"Reservation added...",Toast.LENGTH_LONG).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(getActivity(),"add operation failed...",Toast.LENGTH_LONG).show();
                        }
                    });
                }catch (Exception e){
                    Toast.makeText(getActivity(),e.getMessage(),Toast.LENGTH_LONG);
                }
                editText1.setText("");editText2.setText("");editText3.setText("");
            }

        });

        return view;
    }


}
