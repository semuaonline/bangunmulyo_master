package com.semuaonline.desabangunmulyo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class profil_desa extends AppCompatActivity {
    WebView webView;
    ProgressBar progressBar;
    String loadUrl ="https://bangunmulyo.desa.id/profil-desa/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_profil_desa);

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

    /**
     * Called when the activity has detected the user's press of the back
     * key. The {@link #getOnBackPressedDispatcher() OnBackPressedDispatcher} will be given a
     * chance to handle the back button before the default behavior of
     * {@link Activity#onBackPressed()} is invoked.
     *
     * @see #getOnBackPressedDispatcher()
     */
    @Override
    public void onBackPressed() {
        if (webView.canGoBack ()){
            webView.goBack ();
        } else {
            super.onBackPressed ();
        }
    }
}