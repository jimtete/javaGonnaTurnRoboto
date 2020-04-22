package com.example.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends ArrayAdapter<String> {

    List<String> Animals = new ArrayList<>();
    Context context;

    public ListAdapter(@NonNull Context context, List<String> Animals) {
        super(context, R.layout.element_layout, Animals);
        this.context = context;
        this.Animals = Animals;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        View row = inflater.inflate(R.layout.element_layout, parent, false);
        TextView animalName = row.findViewById(R.id.animal);
        animalName.setText(Animals.get(position));
        return row;
    }
}
