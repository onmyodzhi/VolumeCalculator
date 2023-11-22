package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {

    EditText sphereRadius;
    TextView title, result;
    Button calculateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        sphereRadius = findViewById(R.id.textSphere);
        title = findViewById(R.id.sphereTitle);
        result = findViewById(R.id.sphereResult);
        calculateBtn = findViewById(R.id.btnSphereCalculate);

        calculateBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String radius = sphereRadius.getText().toString();

                double r = Double.parseDouble(radius);

                StringBuilder volume= new StringBuilder();
                volume.append("V = ")
                        .append((4.0/3.0) * Math.PI * Math.pow(r,3))
                        .append("m^3");

                result.setText(volume);
            }
        });
    }
}