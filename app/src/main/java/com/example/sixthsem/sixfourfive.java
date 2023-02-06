package com.example.sixthsem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sixfourfive extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixfourfive);
        ImageView img;
        Button m1,m2,m22,m3,m4,m5;
        img = findViewById(R.id.social);
        m1 = findViewById(R.id.button45m1);
        m2 = findViewById(R.id.button45m2);
        m22 = findViewById(R.id.button45mp2);
        m3 = findViewById(R.id.button45m3);
        m4 = findViewById(R.id.button45m4);
        m5 = findViewById(R.id.button45m5);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/_shivu_prince_/");
            }
        });


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/103qSi7pcNM-jCIkMUgLiHyc3QYijhkBM/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1rSN00J7xPflQQH-XYxk41oj_hObPcG9J/view");
            }
        });

        m22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1kOjH5_Q8BaamRsWQekkINwisOCbautT7/view");
            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1auCEUcZLKRnYAe2eGHseODKWNqr4iDcP/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1SOJWtoJwoFFzS_ZmjJ5952WSIe9Adip4/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1EzZab5FNItBvctI1J_nVjYcz_5kpgA6F/view\n");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}