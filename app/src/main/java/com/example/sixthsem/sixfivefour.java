package com.example.sixthsem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sixfivefour extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixfivefour);
        ImageView img;
        Button m1,m2,m3,m4,m5;
        img = findViewById(R.id.social);
        m1 = findViewById(R.id.button54m1);
        m2 = findViewById(R.id.button54m2);
        m3 = findViewById(R.id.button54m3);
        m4 = findViewById(R.id.button54m4);
        m5 = findViewById(R.id.button54m5);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/_shivu_prince_/");
            }
        });

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1sm_IdLk8Af23FbeYx02XFyOL7bRGztco/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1l8P-Xvd5lWeAEfEIDi-VUW-S7ME3eq0W/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1F2SDWqekGgR_3EpiXHmcZCchUzaJUz4h/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1pBOFmfVl52VuC20RrodNP8uOwiNoC7Vn/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/14n7O8lZsnT1GSbWoscEQnodVzlvDaPMV/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}