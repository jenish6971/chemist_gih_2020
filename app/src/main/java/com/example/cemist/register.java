package com.example.cemist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.Toast;

public class register extends AppCompatActivity {

    ImageButton signup_back_btn_java;

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Toast.makeText(register.this,"Please wait...", Toast.LENGTH_LONG).show();

        signup_back_btn_java = (ImageButton) findViewById(R.id.signup_back_btn);
        webView = (WebView) findViewById(R.id.web_view);

        String url =  "http://eupload.ml/smart_card/contact.php";
        webView.loadUrl(url);
        webView.getSettings().setJavaScriptEnabled(true);

        signup_back_btn_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this, login.class));
                finish();
            }
        });



    }
}
