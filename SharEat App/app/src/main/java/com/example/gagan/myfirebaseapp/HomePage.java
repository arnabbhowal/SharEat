package com.example.gagan.myfirebaseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity {
    public ImageView donatedt, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        donateaction();
        profileaction();
    }

    private void profileaction() {
        profile = (ImageView) findViewById(R.id.profile);

        profile.setOnClickListener(v -> {
            Intent profileintent = new Intent(HomePage.this,MainActivity.class);
            startActivity(profileintent);
        });
    }

    private void donateaction() {
        donatedt = (ImageView) findViewById(R.id.donatedt);

        donatedt.setOnClickListener(v -> {
            Intent donateintent = new Intent(HomePage.this,DonatePage.class);
            startActivity(donateintent);
        });
    }

}
