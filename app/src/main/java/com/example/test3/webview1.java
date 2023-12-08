package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview1);

        WebView webView1 = findViewById(R.id.webView);
        webView1.loadUrl("https://drive.google.com/file/d/1Kg_8bnLvSqp62BRjx91qsl-iKFEsw1p3/view?usp=drive_link");




    }
}