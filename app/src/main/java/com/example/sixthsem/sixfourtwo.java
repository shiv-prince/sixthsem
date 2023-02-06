package com.example.sixthsem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sixfourtwo extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixfourtwo);
        ImageView img;
        Button m1,m2,m3,m4,m5;
        img = findViewById(R.id.social);
        m1 = findViewById(R.id.button42m1);
        m2 = findViewById(R.id.button42m2);
        m3 = findViewById(R.id.button42m3);
        m4 = findViewById(R.id.button42m4);
        m5 = findViewById(R.id.button42m5);


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/_shivu_prince_/");
            }
        });


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/0B-ITW-kTxwdfSzVpM3ltQ0J6akU/view?resourcekey=0-LUpIProW9NIJwrsOpm-XpQ");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/0B-ITW-kTxwdfWlBpV3YtUTA1UDQ/view?resourcekey=0-vUlnzMRbuwU76hnHHdSa-w");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/0B-ITW-kTxwdfdEtaVXJUaXU5d1U/view?resourcekey=0-KEX3Vg__vaWwRT8QdPQ4bQ");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1kCsDOjfoaASN7MOah9w0DsSkAvCUOpDI/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1PK54eC5grZBTPcylTLAZM2wUBUp7N_kv/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}