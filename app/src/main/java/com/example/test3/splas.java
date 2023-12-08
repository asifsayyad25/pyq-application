package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas);

        Intent home = new Intent(splas.this, homepage.class);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(home);

                finish();
            }
        },5000);
    }
}