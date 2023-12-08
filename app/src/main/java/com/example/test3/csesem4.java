package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class csesem4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem4);


        TextView os1,os2,os3,os4;
        os1 = findViewById(R.id.os1);
        os2 = findViewById(R.id.os2);
        os3 = findViewById(R.id.os3);
        os4 = findViewById(R.id.os4);

        os1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent os = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1xJmA5kIjl9k_6eBZ-7wI8Gn_tgHrlFdD/view?usp=sharing"));
                startActivity(os);
            }
        });


        os2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent os = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1kp--irxIUs9oQDlEgHhPzp-ejGWvEEnG/view?usp=sharing"));
                startActivity(os);
            }
        });

        os3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent os = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1xgp77BGpz4iL7e2hBGNxOYOLUQtg6FoH/view?usp=sharing"));
                startActivity(os);
            }
        });
        os4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent os = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/17BZbrUqa8yC3qxTJUX18rNnIjyBN9uAZ/view?usp=sharing"));
                startActivity(os);
            }
        });


    }
}