package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class csesem3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem3);


        TextView m31,m32,m33,m34,m35;
        m31 = findViewById(R.id.m31);
        m32 = findViewById(R.id.m32);
        m33 = findViewById(R.id.m33);
        m34 = findViewById(R.id.m34);
        m35 = findViewById(R.id.m35);

        m31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m3 = new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "https://drive.google.com/file/d/19IYFKWV-Ufj0DAqU8JdMvm-ExIIjCxuA/view?usp=sharing"));
                startActivity(m3);
            }
        });

        m32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m3 = new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "https://drive.google.com/file/d/1vv0nPQ8nPFQw5jqSTff-rmIDQ5VfitgQ/view?usp=sharing"));
                startActivity(m3);
            }
        });

        m33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1BRCtTAPqpRFVTRuGocNdy7gQlGAukL0Y/view?usp=sharing"));
                startActivity(m3);
            }
        });

        m34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1IA0i7tp-rgEHyEIll0pyJ23iTiulAhjT/view?usp=sharing"));
                startActivity(m3);
            }
        });

        m35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1GzdWl7dsMii9exNjtqzV893xYHCbhdiw/view?usp=sharing"));
                startActivity(m3);
            }
        });


        TextView dm1,dm2,dm3,dm4;

        dm1 = findViewById(R.id.dm1);
        dm2 = findViewById(R.id.dm2);
        dm3 = findViewById(R.id.dm3);
        dm4 = findViewById(R.id.dm4);


        dm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dm = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1Vd76O0ZZtyoxZ0Ujiq_ILhOtlOypPDKy/view?usp=sharing"));
                startActivity(dm);
            }
        });

        dm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dm = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/11IS_nM08OOiLPs5ijWYg_c06JOtuBbRQ/view?usp=sharing"));
                startActivity(dm);
            }
        });


        dm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dm = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1QYi2NgHHEw0VrnqlliZRQRxtN-liWDgr/view?usp=sharing"));
                startActivity(dm);
            }
        });

        dm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dm = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "https://drive.google.com/file/d/1ErT0o5pwPrlxR8JlmhWRsQw1lZFaAnm0/view?usp=sharing"));
                startActivity(dm);
            }
        });


        TextView co1,co2,co3,co4;
        co1 = findViewById(R.id.co1);
        co2 = findViewById(R.id.co2);
        co3 = findViewById(R.id.co3);
        co4 = findViewById(R.id.co4);

        co1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent co= new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1ckyKtKRlalPZd4hn4pY5tkS0LvF2jNjn/view?usp=sharing"));
                startActivity(co);
            }
        });

        co2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent co= new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1ICqYu21FTBS-Ibt2znxm5o9TEhaqOjmW/view?usp=sharing"));
                startActivity(co);
            }
        });


        co3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent co= new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1tYgKRQM3gDHz4qu4ys4ASEUI1j6GhsR3/view?usp=sharing"));
                startActivity(co);
            }
        });

        co4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent co= new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1VLRAhfTUWEdXj9b43XHI34K-kVJrGAfl/view?usp=sharing"));
                startActivity(co);
            }
        });


        TextView ds1,ds2,ds3,ds4;
        ds1 = findViewById(R.id.ds1);
        ds2 = findViewById(R.id.ds2);
        ds3 = findViewById(R.id.ds3);
        ds4 = findViewById(R.id.ds4);


        ds1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ds  = new Intent(Intent.ACTION_VIEW,Uri.parse(""));
                startActivity(ds);
            }
        });

        ds2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ds  = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1ugn5NZNab-tEZJxNz3Xvy0-JLqo5Bzv8/view?usp=sharing"));
                startActivity(ds);
            }
        });
        ds3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ds  = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1k9_Ex89zgUOrHOpApu1HRXnQK94wPLQf/view?usp=sharing"));
                startActivity(ds);
            }
        });
        ds4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ds  = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1719HvpQ40VEFvm-ZiVECee_Bds7MdXu1/view?usp=sharing"));
                startActivity(ds);
            }
        });

    }
}