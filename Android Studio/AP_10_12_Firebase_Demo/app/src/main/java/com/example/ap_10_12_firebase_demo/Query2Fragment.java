package com.example.ap_10_12_firebase_demo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;


/**
 * A simple {@link Fragment} subclass.
 */
public class Query2Fragment extends Fragment {

    TextView queryResult;
    DocumentReference documentReference;

    public Query2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_query2, container, false);

        queryResult = view.findViewById(R.id.textView_query2_result);
        documentReference = MainActivity.db.collection("Sailors").document("22");

        documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                if (documentSnapshot.exists()){
                    Sailors sailors = documentSnapshot.toObject(Sailors.class);
                    Integer sid = sailors.getSid();
                    String sname = sailors.getSname();
                    Integer rating = sailors.getRating();
                    Integer age = sailors.getAge();
                    queryResult.setText("sid: "+sid+" | name: "+sname+" | rating: "+rating+" | age: "+age);
                }else{
                    Toast.makeText(getActivity(),"document does not exist.",Toast.LENGTH_LONG).show();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getActivity(),"document does not exist.",Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
