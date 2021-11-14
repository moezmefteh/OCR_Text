package com.example.textscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    CharSequence message;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result=findViewById(R.id.detected_text);
        Intent intent = getIntent();
        message = intent.getStringExtra("nom");
        result.setText(message);

    }
}