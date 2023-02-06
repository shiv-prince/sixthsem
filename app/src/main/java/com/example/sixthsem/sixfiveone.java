package com.example.sixthsem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sixfiveone extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixfiveone);
        ImageView img;
        Button m1,m2,m3,m4,m5;
        img = findViewById(R.id.social);
        m1 = findViewById(R.id.button51m1);
        m2 = findViewById(R.id.button51m2);
        m3 = findViewById(R.id.button51m3);
        m4 = findViewById(R.id.button51m4);
        m5 = findViewById(R.id.button51m5);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/_shivu_prince_/");
            }
        });

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1yjE1QLk7bI2cColMrNPo9eCtiTp2WV6j/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/17oU2jamyfC1wSZxX6vCSpuiWP64bULwD/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1sPpGYBSNwNLnIMG5DLSpGbpe5ZmaJ_ut/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1Y3fmq5uQNCV5hAa9QPojy7MpjtLalbbu/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1-m4NL0KeCcndBjreakHSc9vsQhW_XaCg/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}