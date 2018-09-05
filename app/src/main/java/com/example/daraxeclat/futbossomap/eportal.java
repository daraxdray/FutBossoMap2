package com.example.daraxeclat.futbossomap;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class eportal extends AppCompatActivity {
    WebView wb;
    ProgressBar bar;
    ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eportal);
        wb = (WebView) findViewById(R.id.wb_eportal);
        bar = (ProgressBar) findViewById(R.id.progressB);
        wb.setWebViewClient(new WebViewClient() {              // This method will be triggered when the Page Started Loading
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                dialog = ProgressDialog.show(eportal.this, null,
                        "Please Wait...Page is Loading...");
                dialog.setCancelable(true);
                super.onPageStarted(view, url, favicon);             }
                // This method will be triggered when the Page loading is completed
                public void onPageFinished(WebView view, String url) {
                dialog.dismiss();
                super.onPageFinished(view, url);             }
                // This method will be triggered when error page appear
                public void onReceivedError(WebView view, int errorCode,
                                            String description, String failingUrl) {
                dialog.dismiss();                 // You can redirect to your own page instead getting the default
                    // error page
                    Toast.makeText(eportal.this, "The Requested Page Does Not Exist", Toast.LENGTH_LONG).show();
                    wb.loadUrl("http://futminna.edu.ng/index.php/students/9-uncategorised/109-e-portal");
                    super.onReceivedError(view, errorCode, description, failingUrl);
            }  });
                    wb.loadUrl("http://futminna.edu.ng/index.php/students/9-uncategorised/109-e-portal");
                    wb.getSettings().setLoadWithOverviewMode(true);
                    wb.getSettings().setUseWideViewPort(true);
    } }