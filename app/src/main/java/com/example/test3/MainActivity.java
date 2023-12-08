package com.example.test3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar;
        Button fy, aids,cse,mech,civil,entc;

        toolbar = findViewById(R.id.toolbar1);

        //step one
        setSupportActionBar(toolbar);

        //back button
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Home page");
        }


        //title



        //creat a menu :




        fy = findViewById(R.id.but1);
        aids = findViewById(R.id.but2);
        cse = findViewById(R.id.but3);
        mech = findViewById(R.id.but4);
        civil = findViewById(R.id.but5);
        entc = findViewById(R.id.but6);




        Intent nextI = new Intent(MainActivity.this, allsem.class);

        fy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent fy = new Intent(MainActivity.this, fysem.class);


                startActivity(fy);
            }
        });


        aids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();

//                nextI.putExtra("year",2);
//                startActivity(nextI);
            }
        });


        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nextI.putExtra("year",3);
                startActivity(nextI);
            }
        });
        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
                         }
        });

        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
                }
//                nextI.putExtra("year",5);
//                startActivity(nextI);            }
        });
        entc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextI.putExtra("year",6);

                Toast.makeText(getApplicationContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();}
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.smenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

       if( itemId == R.id.con){
           Intent con = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.whatsapp.com/"));
           startActivity(con);

       } else if (itemId == R.id.help) {
           Toast.makeText(this, "bhi khud slove kar ", Toast.LENGTH_SHORT).show();

       } else if (itemId == android.R.id.home) {
           super.onBackPressed();

       } else {
           Toast.makeText(this, "coming soon", Toast.LENGTH_SHORT).show();
       }
        return super.onOptionsItemSelected(item);
    }
}