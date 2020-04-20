package com.example.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.people:
                        menuItem.setChecked(true);
                        displayMessage("open contacts");
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.find:
                        menuItem.setChecked(true);
                        displayMessage("find something");
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.home:
                        menuItem.setChecked(true);
                        displayMessage("go home...");
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.about:
                        menuItem.setChecked(true);
                        displayMessage("Info... ");
                        drawerLayout.closeDrawers();
                        return true;
                }
                return false;
            }
        });
    }

    private void displayMessage(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
