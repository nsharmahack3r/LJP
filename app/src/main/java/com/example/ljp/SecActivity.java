package com.example.ljp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecActivity extends AppCompatActivity {

    Button buttonVertical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonVertical = findViewById(R.id.buttonVertical);
//        buttonVertical.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SecActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });

    }
}