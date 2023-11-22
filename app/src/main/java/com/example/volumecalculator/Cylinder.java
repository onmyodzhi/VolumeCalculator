package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {
    EditText cylRadius, cylHeight;
    TextView title, result;
    Button calculateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        cylRadius = findViewById(R.id.textCylRadius);
        cylHeight = findViewById(R.id.textCylHeight);
        title = findViewById(R.id.cylTitle);
        result = findViewById(R.id.cylResult);
        calculateBtn = findViewById(R.id.btnCylCalculate);

        calculateBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String radius = cylRadius.getText().toString();
                String height = cylRadius.getText().toString();

                double r = Double.parseDouble(radius);
                double h = Double.parseDouble(height);

                StringBuilder volume= new StringBuilder();
                volume.append((double) Math.PI * Math.pow(r,2) * h);

                result.setText(volume);
            }
        });
    }
}