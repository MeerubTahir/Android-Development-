package com.example.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView Zakkat;
    private EditText Amount;
    private Button Calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Zakkat = (TextView) findViewById(R.id.zakkat);
        Amount = (EditText) findViewById(R.id.amount);
        Calculate = (Button) findViewById(R.id.calculate);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float total = Float.parseFloat(Amount.getText().toString());

                        float calculation = total/40;
                        Zakkat.setText(Float.toString(calculation));
            }
        });
    }
}