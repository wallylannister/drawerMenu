package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView =(WebView)findViewById(R.id.webView);
        //String myPdfUrl = "https://drive.google.com/open?id=1pNRRSaArBqMU2fSK640gFGmjIg14fPal";
        String url = "file:///android_asset/instruction.html";// + myPdfUrl;

        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl(url);
        // Tùy biến WebViewClient để điều khiển các sự kiện trên WebView
    }
}
