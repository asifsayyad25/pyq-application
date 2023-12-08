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
import android.widget.TextView;

public class fysub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fysub);

        Toolbar toolbar = findViewById(R.id.tool1);
        setSupportActionBar(toolbar);

        if(getSupportActionBar() != null){

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Select Batch");}


        TextView math1, math2,math3,math4,math5,math6;
        math1 = findViewById(R.id.math1);
        math2 = findViewById(R.id.math2);
        math3 = findViewById(R.id.math3);
        math4 = findViewById(R.id.math4);
        math5 = findViewById(R.id.math5);
        math6 = findViewById(R.id.math6);

        math1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent math = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/12T_2wBMVYrpCSvwKSSrkUhGGPqqVqmLs/view?usp=sharing"));
                startActivity(math);
            }
        });

        math2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent math = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1z7uRqP5uzp3a4qiv9duMLA7IBTcUN1-m/view?usp=sharing"));
                startActivity(math);
            }
        });
        math3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent math = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1L9gVoO8euWMwxKtdcspncYd1cGvO18qf/view?usp=sharing"));
                startActivity(math);
            }
        });
        math4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent math = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1mtkapAzJIdUS4gRz8nQG7QciqN_9IO0u/view?usp=sharing"));
                startActivity(math);
            }
        });
        math5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent math = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1qHXu8nIZc7RSRM_YXp4ejQiXauvTkGPu/view?usp=sharing"));
                startActivity(math);
            }
        });
        math6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent math = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1MigO5O43JEyNgChwQblKD-FLJl3hqVpZ/view?usp=sharing"));
                startActivity(math);
            }
        });




        //mechnics

        TextView mac1,mac2,mac3,mac4,mac5;
        mac1 = findViewById(R.id.mac1);
        mac2= findViewById(R.id.mac2);
        mac3 = findViewById(R.id.mac3);
        mac4= findViewById(R.id.mac4);
        mac5 = findViewById(R.id.mac5);

        mac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mac = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1XKaRPDtDh1HRhloHQP5gw4RqXg-qvOcs/view?usp=drive_link"));
                startActivity(mac);
            }
        });

        mac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mac = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/18lbFbTVHFBa0LSBuvEjgAnwnc8UdMJgG/view?usp=drive_link"));
                startActivity(mac);
            }
        });


        mac3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mac = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1CUk3bzStEx4AfgcyMCNz7Ems8GFD0z9d/view?usp=drive_link"));
                startActivity(mac);
            }
        });
        mac4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mac = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1NxbmZbSSyxGKHibxOXKrDJ2uHj80NJIs/view?usp=drive_link"));
                startActivity(mac);
            }
        });

        mac5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mac = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1kLVV6gYcIcGsIlSXE1-3Pcw8OSMnw1t3/view?usp=drive_link"));
                startActivity(mac);
            }
        });


        // computer programing

        TextView cp1,cp2,cp3,cp4;
        cp1= findViewById(R.id.cp1);
        cp2 = findViewById(R.id.cp2);
        cp3 = findViewById(R.id.cp3);
        cp4 = findViewById(R.id.cp4);

        cp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cp = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/132K3M1R6GmIqxC5abno5WgHuv7-mTYke/view?usp=drive_link"));
                startActivity(cp);
            }
        });

        cp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cp = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1VnwGa4dL-yR7tnvxwAd8Fr7Ema-5KfyE/view?usp=drive_link"));
                startActivity(cp);
            }
        });


        cp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cp = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1s_tT_hLSDa4po3EOAuczzEP6pQmtDtvr/view?usp=drive_link"));
                startActivity(cp);
            }
        });

        cp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cp = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1K7PMaxXrf1k8U0W9JNCqhwshHcKHiZfE/view?usp=sharing"));
                startActivity(cp);
            }
        });


        TextView ch1, ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10;
        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        ch4 = findViewById(R.id.ch4);
        ch5 = findViewById(R.id.ch5);
        ch6 = findViewById(R.id.ch6);
        ch7 = findViewById(R.id.ch7);
        ch8= findViewById(R.id.ch8);
        ch9 = findViewById(R.id.ch10);
        ch10 = findViewById(R.id.ch10);

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch1 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1gvw-Kv_7W5DneOxWE2jbwxnnDF0nk8nY/view?usp=sharing"));
                startActivity(ch1);
            }
        });

        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/110utnW_5hwy-7yMDCHgZE5GNe30-LQaM/view?usp=sharing"));
                startActivity(ch2);
            }
        });


        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1Tcq1IFfUsZJhKryQ3_JpwZHfOKThlh2-/view?usp=sharing"));
                startActivity(ch2);
            }
        });


        ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1-h6_wD7LKEovSSso8DW_oHqUScH2-KBI/view?usp=sharing"));
                startActivity(ch2);

            }
        });
        ch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1k3WgAD7fFZVvWaXaqwgp3m1_fmN76syV/view?usp=sharing"));
                startActivity(ch2);
            }
        });
        ch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1DGsvN3dOzXEPZgtf8JMr0PKNXuWBzHUn/view?usp=sharing"));
                startActivity(ch2);
            }
        });
        ch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/17aFCNFCFQSvZnkFVIWf1Iy2HCPAdDBQy/view?usp=sharing"));
                startActivity(ch2);
            }
        });
        ch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1tUMQhDHhnTwagvGjsx-Ml-ouwypyfsh4/view?usp=sharing"));
                startActivity(ch2);
            }
        });
        ch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1XQD5Wfcho4Wb19tM8eUqOTjcsl4tu0Sw/view?usp=sharing"));
                startActivity(ch2);
            }
        });
        ch10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1HOLN7yAeQTA5SyyRYH9rQbIgMgxm6OX4/view?usp=sharing"));
                startActivity(ch2);
            }
        });




    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}