package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class homepage extends AppCompatActivity {
    Toolbar tool1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        tool1 = findViewById(R.id.tool1);
        setSupportActionBar(tool1);


        tool1.setSubtitle("all pyq in one app");



        CardView but1;
        but1 = findViewById(R.id.but1);
        Intent branch = new Intent(homepage.this,MainActivity.class );

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(homepage.this, "coming soon", Toast.LENGTH_SHORT).show();
            }
        });


        CardView cardView = findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event here
                // For example, you can start a new activity or show a dialog
                startActivity(branch);

            }
        });


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.fmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}


