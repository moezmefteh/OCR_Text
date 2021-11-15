package com.example.textscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {
    CharSequence message;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result=findViewById(R.id.detected_text);
        Intent intent = getIntent();
        message = intent.getStringExtra("detectedText");
        result.setText(message);

    }

    public void copyToClipBoard(View view) {
        ClipboardManager clipBoard =(ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clipData=ClipData.newPlainText("copied data",message);
        clipBoard.setPrimaryClip(clipData);
        Toast.makeText(ResultActivity.this,"Copied to ClipBoard",Toast.LENGTH_LONG).show();

    }

    public void returnToMainActivity(View view) {
    }
}