package com.example.greenacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splashactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);
        Intent home=new Intent(Splashactivity.this,scrolling.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(home);

            }
        }, 3000);

    }
}