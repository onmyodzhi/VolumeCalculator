package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    EditText cubeSIte;

    TextView title, result;
    Button calculateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        cubeSIte = findViewById(R.id.textCube);
        title = findViewById(R.id.cubeTitle);
        result = findViewById(R.id.cubeResult);
        calculateBtn = findViewById(R.id.btnCubeCalculate);

        calculateBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String site = cubeSIte.getText().toString();

                double r = Double.parseDouble(site);

                StringBuilder volume= new StringBuilder();
                volume.append(Math.pow(r,3));

                result.setText(volume);
            }
        });
    }
}