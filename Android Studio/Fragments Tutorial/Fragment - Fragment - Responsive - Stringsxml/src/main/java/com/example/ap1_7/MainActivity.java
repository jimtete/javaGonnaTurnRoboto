package com.example.ap1_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements HeadLine.OnHeadLineSelectListener {

    View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHeadLineSelected(int position){
        Article article = new Article();
        Bundle bundle = new Bundle();
        bundle.putInt("position",position);
        FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction().replace(R.id.articleFragment,article,null);
        article.setArguments(bundle);
        fragmentTransaction.commit();
    }
}
