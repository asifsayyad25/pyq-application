package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class allsem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allsem);
        Button but1,but2,but3,but4,but5;
        but1 = findViewById(R.id.but1);
        but2 = findViewById(R.id.but2);
        but3 = findViewById(R.id.but3);
        but4 = findViewById(R.id.but4);
        but5 = findViewById(R.id.but5);


        Intent getI= getIntent();
        int sem = getI.getIntExtra("year",0);

        if (sem == 2){
            but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ai = new Intent(allsem.this,aisem3.class);
                startActivity(ai);
            }
        });
            but2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ai4 = new Intent(allsem.this,aisem4.class);
                    startActivity(ai4);
                }
            });
            but3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ai5 = new Intent(allsem.this,aisem5.class);
                    startActivity(ai5);
                }
            });

            but4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ai6 = new Intent(allsem.this,aisem6.class);
                    startActivity(ai6);
                }
            });

            but5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ai7 = new Intent(allsem.this,aisem7.class);
                    startActivity(ai7);
                }
            });
        }

        else if (sem ==3) {
            but1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent cs = new Intent(allsem.this,csesem3.class);
                    startActivity(cs);
                }
            });
            but2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent cs4 = new Intent(allsem.this,csesem4.class);
//                    startActivity(cs4);
                    Toast.makeText(getApplicationContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();

                }
            });
            but3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent cs5 = new Intent(allsem.this,csesem5.class);
//                    startActivity(cs5)

                                   Toast.makeText(getApplicationContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();;
                }
            });

            but4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent cs6 = new Intent(allsem.this,csesem6.class);
//                    startActivity(cs6);
                    Toast.makeText(getApplicationContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();

                }
            });

            but5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent cs7 = new Intent(allsem.this,csesem7.class);
//                    startActivity(cs7);

                    Toast.makeText(getApplicationContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();

                }
            });

        }


    }
}