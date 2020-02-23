package com.example.cemist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class register extends AppCompatActivity {

    ImageButton signup_back_btn_java;
    ImageButton signup_next_btn_java;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        signup_back_btn_java = (ImageButton) findViewById(R.id.signup_back_btn);
        signup_next_btn_java = (ImageButton) findViewById(R.id.signup_next_btn);

        signup_back_btn_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this, login.class));
                finish();
            }
        });


        signup_next_btn_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this, MainActivity.class));
                finish();
            }
        });

    }
}
