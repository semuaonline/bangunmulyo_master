package com.semuaonline.desabangunmulyo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class contact extends AppCompatActivity {
    WebView webView;
    ProgressBar progressBar;
    String loadUrl ="https://bangunmulyo.desa.id/contact-layanan/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_contact);

        webView = findViewById(R.id.wv);
        progressBar = findViewById(R.id.pbar);
        progressBar.setMax(100);
        webView.setWebViewClient(new WebViewClient ());
        webView.getSettings().setJavaScriptEnabled(true);
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading Wait .....");

        webView.loadUrl(loadUrl);
        progressBar.setProgress(0);

        webView.setWebChromeClient(new WebChromeClient () {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                progressBar.setVisibility(View.VISIBLE);
                progressBar.setProgress(newProgress);
                setTitle("Loading....");
                progressDialog.show();
                if (newProgress == 100)
                    progressBar.setVisibility(View.GONE);
                setTitle(view.getTitle());
                progressDialog.dismiss();

            }
        });
    }
}