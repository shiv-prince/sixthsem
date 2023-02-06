package com.example.sixthsem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sixfivethree extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixfivethree);
        ImageView img;
        Button m1,m2,m3,m4,m5;
        img = findViewById(R.id.social);
        m1 = findViewById(R.id.button53m1);
        m2 = findViewById(R.id.button53m2);
        m3 = findViewById(R.id.button53m3);
        m4 = findViewById(R.id.button53m4);
        m5 = findViewById(R.id.button53m5);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/_shivu_prince_/");
            }
        });

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1AFxoI88GkaB5d-BF8hys9cfY4-hv9Hgf/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/12x9CY6rc5mJAKLqWVPcoPCAFy6An9p8Q/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1ceQibA8otym-68wnvrmgMfEXBg9o3FWj/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1nrQ0LtmNTugJkfDEdIQS3_4XsmJpOHva/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1DAUf5Bk-FQUWEATGVzk03SADfMvMkJAJ/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}