package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pyqm3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyqm3);
        TextView math2022 = findViewById(R.id.math2023);
        TextView math2019 = findViewById(R.id.math2022);
        String url = "https://drive.google.com/file/d/1Kg_8bnLvSqp62BRjx91qsl-iKFEsw1p3/view?usp=drive_link";

        math2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m3 = new Intent(pyqm3.this, webview1.class);

                startActivity(m3);
            }
        });


        math2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m322  = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1vv0nPQ8nPFQw5jqSTff-rmIDQ5VfitgQ/view?usp=sharing"));
                startActivity(m322);
            }
        });



    }
}