package com.example.quranapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tv = findViewById(R.id.textView2);

        Intent intent = getIntent();

        String data = intent.getStringExtra("Ayat");

        tv.setText(data);



    }
}
