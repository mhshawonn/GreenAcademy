package com.example.greenacademy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class physics1stpaper extends AppCompatActivity {
    Toolbar toolbar;
    Button chapter1;
    Button chapter2; // Initialize chapter2 button here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physics1stpaper);

        toolbar = findViewById(R.id.tooBar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setTitle("Physics 1st Paper");
        chapter1 = findViewById(R.id.chapter1);
        chapter2 = findViewById(R.id.chapter2); // Initialize chapter2 button

        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvideo();
            }
        });

        chapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openvideo();
            }
        });
    }

    public void openvideo() {
        Intent intent = new Intent(this, web.class);
        startActivity(intent);
    }
}
