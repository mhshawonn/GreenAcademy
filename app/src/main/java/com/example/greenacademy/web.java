package com.example.greenacademy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter1);
        WebView youtube = findViewById(R.id.class1);

        // Modify the video URL to disable related video suggestions
        String video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/rfIdPZoZHtU?si=bcIDfMXIA9hfW1-b&rel=0\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; clipboard-write; " +
                "encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";

        youtube.loadData(video, "text/html", "utf-8");
        youtube.getSettings().setJavaScriptEnabled(true);
        youtube.setWebChromeClient(new WebChromeClient());
    }
}
