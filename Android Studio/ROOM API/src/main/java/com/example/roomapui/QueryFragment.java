package com.example.roomapui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class QueryFragment extends Fragment {

    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    TextView querytextView, querytextresult;
    Button queryRun;
    int test;

    public QueryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_query, container, false);

        final String[] queryArray = getResources().getStringArray(R.array.queries_description_array);
        querytextView = view.findViewById(R.id.txtquery);
        spinner = view.findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(getContext(), R.array.queries_array, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                querytextView.setText(queryArray[position]);
                test = position+1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        querytextresult = view.findViewById(R.id.txtqueryresult);
        queryRun = view.findViewById(R.id.run_query);
        queryRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                querytextresult.setText("test"+test);
                String result="";
                switch (test){
                    case 1:
                        List<Sailors> sailors = MainActivity.myAppDatabase.myDao().getSailors();
                        for (Sailors i: sailors){
                            int code = i.getId();
                            String name = i.getName();
                            int age = i.getAge();
                            int rating = i.getRating();
                            result=result + "\n ----- \n Id: "+code+"\n Name: "+name+"\n Age: "+age+"\n Rating: "+rating;
                        }
                        querytextresult.setText(result);
                        break;
                    case 2:
                        List<Boats> boats = MainActivity.myAppDatabase.myDao().getBoats();
                        for (Boats i: boats){
                            int code = i.getId();
                            String name = i.getName();
                            String color = i.getColor();
                            result=result + "\n ----- \n Id: "+code+"\n Name: "+name+"\n Color: "+color;
                        }
                        querytextresult.setText(result);
                        break;
                    case 3:
                        List<Reserves> reservations = MainActivity.myAppDatabase.myDao().getReserves();
                        for (Reserves i: reservations){
                            int code = i.getBid();
                            int code2= i.getSid();
                            String date = i.getRes_day();
                            result = result + "\n ----- \n Sailor id: "+code+"\n Boat id: "+code2+"\n Date: "+date;
                        }
                        querytextresult.setText(result);
                        break;
                    case 4:
                        List<ResultStringInt> resultStringInts = MainActivity.myAppDatabase.myDao().getQuery4();
                        for (ResultStringInt i: resultStringInts){
                            String sailorName = i.getField1();
                            int sailorAge = i.getField2();
                            result = result + "\n ----- \n Sailor name: "+sailorName+"\n Sailor age: "+sailorAge;
                        }
                        querytextresult.setText(result);
                        break;
                    case 5:
                        List<Sailors> sailors1 = MainActivity.myAppDatabase.myDao().getQuery5();
                        for (Sailors i: sailors1){
                            int code = i.getId();
                            String name = i.getName();
                            int age = i.getAge();
                            int rating = i.getRating();
                            result=result + "\n ----- \n Id: "+code+"\n Name: "+name+"\n Age: "+age+"\n Rating: "+rating;

                        }
                        querytextresult.setText(result);
                        break;
                    case 6:
                        List<String> strings = MainActivity.myAppDatabase.myDao().getQuery6();
                        for (String s: strings){
                            result=result+"\n ----- \n Sailor's name: "+s;
                        }
                        querytextresult.setText(result);
                        break;
                    case 7:
                        List<Integer>integers = MainActivity.myAppDatabase.myDao().getQuery7();
                        for (Integer i: integers){
                            result = result + "\n ----- \n Reserves sid: "+i;
                        }
                        querytextresult.setText(result);
                        break;
                    case 8:
                        List<String> strings1 = MainActivity.myAppDatabase.myDao().getQuery8();
                        for (String s: strings1){
                            result=result+"\n ----- \n Sailor's name: "+s;
                        }
                        querytextresult.setText(result);
                        break;
                    case 9:
                        List<Integer>integers2 = MainActivity.myAppDatabase.myDao().getQuery9();
                        for (Integer i: integers2){
                            result = result + "\n ----- \n Sailor's age: "+i;
                        }
                        querytextresult.setText(result);
                        break;
                    case 10:
                        List<String> strings2 = MainActivity.myAppDatabase.myDao().getQuery10();
                        for (String s: strings2){
                            result=result+"\n ----- \n Sailor's name: "+s;
                        }
                        querytextresult.setText(result);
                        break;
                    case 11:
                        List<Integer>integers3 = MainActivity.myAppDatabase.myDao().getQuery11();
                        for (Integer i: integers3){
                            result = result + "\n ----- \n Sailor's id: "+i;
                        }
                        querytextresult.setText(result);
                        break;
                    case 12:
                        List<String> strings3 = MainActivity.myAppDatabase.myDao().getQuery12();
                        for (String s: strings3){
                            result=result+"\n ----- \n Sailor's name: "+s;
                        }
                        querytextresult.setText(result);
                        break;
                    case 13:
                        List<String> strings4 = MainActivity.myAppDatabase.myDao().getQuery13();
                        for (String s: strings4){
                            result=result+"\n ----- \n Sailor's name: "+s;
                        }
                        querytextresult.setText(result);
                        break;
                    case 14:
                        List<ResultStringInt> resultStringInts1 = MainActivity.myAppDatabase.myDao().getQuery14();
                        for (ResultStringInt i: resultStringInts1){
                            String sailorsName = i.getField1();
                            int maxAge = i.getField2();
                            result = result+"\n ----- \n Sailor's name: "+sailorsName+"\n Maximum age: "+maxAge;
                        }
                        querytextresult.setText(result);
                        break;
                    case 15:
                        List<String> strings5 = MainActivity.myAppDatabase.myDao().getQuery15("red");
                        for (String s: strings5){
                            result=result+"\n ----- \n Sailor's name: "+s;
                        }
                        querytextresult.setText(result);
                        break;
                }

            }
        });

        return view;
    }
}
