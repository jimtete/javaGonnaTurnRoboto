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
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;


/**
 * A simple {@link Fragment} subclass.
 */
public class Query4Fragment extends Fragment {

    TextView queryResult;

    public Query4Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_query4, container, false);


        queryResult = view.findViewById(R.id.textView_query4_result);
        CollectionReference collectionReference = MainActivity.db.collection("Sailors");
        Query query = collectionReference.orderBy("age", Query.Direction.DESCENDING).limit(3);

        query.get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                String result="";
                for (QueryDocumentSnapshot documentSnapshot: queryDocumentSnapshots){
                    Sailors sailors = documentSnapshot.toObject(Sailors.class);
                    Integer sid = sailors.getSid();
                    String sname = sailors.getSname();
                    Integer rating = sailors.getRating();
                    Integer age = sailors.getAge();

                    result += "sid: "+sid+" | name: "+sname+" | rating: "+rating+" | age: "+age+"\n ----- \n";
                }

                queryResult.setText(result);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getActivity(),"Query operation failed",Toast.LENGTH_LONG).show();
            }
        });

        return view;


    }
}
