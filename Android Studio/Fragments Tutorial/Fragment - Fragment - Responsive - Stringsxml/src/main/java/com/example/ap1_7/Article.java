package com.example.ap1_7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Article extends Fragment {

    private TextView textView;
    private TextView header;
    List<String> headline_list = new ArrayList<>();
    List<String> description_list = new ArrayList<>();

    public Article() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_article,
                container, false);
        textView = view.findViewById(R.id.txt_description);
        header = view.findViewById(R.id.header);
        headline_list =
                Arrays.asList(getResources().getStringArray(R.array.programmingLanguages));
        description_list =
                Arrays.asList(getResources().getStringArray(R.array.description));
        Bundle bundle = getArguments();
        int thesi = 0;
        if(bundle!=null) {
            thesi = bundle.getInt("position");
        }
        String head = headline_list.get(thesi);
        String desc = description_list.get(thesi);

        header.setText(head);
        textView.setText(desc);
        return view;

    }
}
