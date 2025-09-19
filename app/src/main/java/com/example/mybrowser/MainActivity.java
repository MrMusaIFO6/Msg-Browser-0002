package com.example.mybrowser;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    EditText searchBar;
    ImageButton btnHome, btnCopy, btnMenu;
    PopupWindow popupWindow;
    LinearLayout noInternetLayout;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        searchBar = findViewById(R.id.search_bar);
        btnHome = findViewById(R.id.btn_home);
        btnCopy = findViewById(R.id.btn_copy);
        btnMenu = findViewById(R.id.btn_menu);
        noInternetLayout = findViewById(R.id.no_internet_layout);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());

        webView.loadUrl("https://www.google.com");
    }
}
