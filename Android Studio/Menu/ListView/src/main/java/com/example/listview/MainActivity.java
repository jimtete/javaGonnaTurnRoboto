package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListAdapter listAdapter;
    List<String> Animals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getAnimals();
        listView = findViewById(R.id.myListView);
        listAdapter = new ListAdapter(this,Animals);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = listView.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG).show();
            }
        });
    }

    void getAnimals(){
        String[] items = getResources().getStringArray(R.array.animals);
        for (String item:items){
            Animals.add(item);
        }
    }
}
