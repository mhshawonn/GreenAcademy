package com.example.greenacademy;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class scrolling extends AppCompatActivity {
            DrawerLayout drawerLayout;
            NavigationView navigationView;
            Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);


        drawerLayout =findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.navigationview);
        toolbar=findViewById(R.id.toobar);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();









        setSupportActionBar(toolbar);
    }
}