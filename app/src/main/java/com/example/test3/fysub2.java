package com.example.test3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class fysub2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fysub2);

        Toolbar toolbar = findViewById(R.id.tool1);

        setSupportActionBar(toolbar);

       if( getSupportActionBar() != null){
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         getSupportActionBar().setTitle("Select Batch");
        }


        TextView math1,math2,math3,math4,math5,math6,math7,math8;
        math1 = findViewById(R.id.math1);
        math2 = findViewById(R.id.math2);
        math3 = findViewById(R.id.math3);
        math4 = findViewById(R.id.math4);
        math5 = findViewById(R.id.math5);
//        math6 = findViewById(R.id.math6);
//        math7 = findViewById(R.id.math7);
//        math8 = findViewById(R.id.math8);



        math1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent math1 = new Intent( Intent.ACTION_VIEW, Uri.parse(
                        "https://drive.google.com/file/d/1jFQbzW9xlJrIZN-seKDG-zrIdRPIj7tM/view?usp=drive_link"));
                startActivity(math1);
            }
        });

        math2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent math2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/18PVeee3kB7JLMPlpdr-nsESkCCN2mlgy/view?usp=drive_link"));
                startActivity(math2);

            }
        });

        math3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent math3 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1ZDigzKBsBzmBBU88Ta3dneA3Xy_y6tZo/view?usp=drive_link"));
                startActivity(math3);
            }
        });

        math4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent math4 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/14pzIhpKKVN47JP0cl8jh_sUA9vRSq87H/view?usp=sharing"));
                startActivity(math4);
            }
        });

        math5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent math5 = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1ZH6Kew3Y9A7QpQvXHWrN2-2kRDJA3ebf/view?usp=sharing"));
                startActivity(math5);
            }
        });


        TextView phy1,phy2, phy3,phy4,phy5,phy6;
        phy1 = findViewById(R.id.phy1);
        phy2 = findViewById(R.id.phy2);
        phy3 = findViewById(R.id.phy3);
        phy4 = findViewById(R.id.phy4);
        phy5 = findViewById(R.id.phy5);
        phy6 = findViewById(R.id.phy6);



        phy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phy1 = new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "https://drive.google.com/file/d/1vmXySKAuFB9W7Mhfec466MZo8ivnPyj3/view?usp=sharing"));
                startActivity(phy1);
            }
        });

        phy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phy = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1HsQe3TEVEdNeunS1kJiz9wY0xZ2tQMyQ/view?usp=drive_link"));
                startActivity(phy);
            }
        });

        phy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phy = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/12XaJ1bNihYi1R-PAwlBUqTur0GDuBfPY/view?usp=drive_link"));
                startActivity(phy);
            }
        });


        phy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phy = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1GXr9JcvTZrwBJsOCmYC0rwAKe80OAbT4/view?usp=drive_link"));
                startActivity(phy);
            }
        });
        phy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phy = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1PgiwQdedVcJvZMGLw_hzrohO4f8DDIpQ/view?usp=drive_link"));
                startActivity(phy);
            }
        });
        phy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phy = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1ipJfITXJMwtR6SXxaI6WFPGo8i3nqGkf/view?usp=drive_link"));
                startActivity(phy);
            }
        });


        TextView cm1 ,cm2,cm3,cm4;
        cm1 = findViewById(R.id.cm1);
        cm2  = findViewById(R.id.cm2);
        cm3 = findViewById(R.id.cm3);
        cm4 = findViewById(R.id.cm4);

        cm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cm1 = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1npt1YrMm6nPRmbhHg-kUemp2aeFyFBpk/view?usp=sharing"));
                startActivity(cm1);
            }
        });


        cm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cm2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1hW39-7mj9nb9mE4wO4SuHZOnNKiKNE5K/view?usp=sharing"));
                startActivity(cm2);
            }
        });

        cm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cm3 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1MqK_47DrQ4SSI56ZtqVXrRnzwrVKMQem/view?usp=sharing"));
                startActivity(cm3);
            }
        });

        cm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cm4 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1AgP6JUWbwjqe_yO1uYyVLIliQIMn8rvC/view?usp=sharing"));
                startActivity(cm4);
            }
        });

        TextView EEE1,EEE2,EEE3,EEE4,EEE5,EEE6;
        EEE2= findViewById(R.id.EEE2);
        EEE3 = findViewById(R.id.EEE3);
        EEE4 = findViewById(R.id.EEE4);
        EEE5 = findViewById(R.id.EEE5);




        EEE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent EEE = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1oKakOc5IuQIsdWz_HYzRIWVDD2TFtIsx/view?usp=sharing"));
                startActivity(EEE);
            }
        });

        EEE3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent EEE = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1P1XLdJpf69HTHQcNiCWeGVxP68tvPFLF/view?usp=sharing"));
                startActivity(EEE);
            }
        });

        EEE4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent EEE = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1USq0jYd575I-bq7XF45Yp-hQao_9AetQ/view?usp=sharing"));
                startActivity(EEE);
            }
        });

        EEE5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent EEE = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1GcRVIW1NQiSVzyNy1mbIeVbPHxBRU2AE/view?usp=sharing"));
                startActivity(EEE);
            }
        });


        TextView Eg1, Eg2,Eg3,Eg4,Eg5;
        Eg1 = findViewById(R.id.Eg1);
        Eg2 = findViewById(R.id.Eg2);
        Eg3 = findViewById(R.id.Eg3);
        Eg4 = findViewById(R.id.Eg4);
        Eg5 = findViewById(R.id.Eg5);

        Eg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Eg = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1E_N7DeOOd8oZJOcJeDFN_O2eGa8-y74l/view?usp=sharing"));
                startActivity(Eg);
            }
        });


        Eg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Eg = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1GiHcUrtSCvSrhDF0s6Sm2cpyBRuGnsc_/view?usp=sharing"));
                startActivity(Eg);
            }
        });


        Eg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Eg = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1BvlPSrNFxkxdxmWfYoCmb15omIV0GVT-/view?usp=sharing"));
                startActivity(Eg);
            }
        });

        Eg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Eg = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1lObHaYNilqn7RXH-X_X1LcqVE9mWPo8I/view?usp=sharing"));
                startActivity(Eg);
            }
        });

        Eg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Eg = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1OnHFzIlih6UohvVL3i12CybCtFt2iude/view?usp=sharing"));
                startActivity(Eg);
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        super.onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}