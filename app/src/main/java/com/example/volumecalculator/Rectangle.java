package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangle extends AppCompatActivity {

    EditText recSite1, recSite2, recSite3;

    TextView title, result;
    Button calculateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        recSite1 = findViewById(R.id.textRec1);
        recSite2 = findViewById(R.id.textRec2);
        recSite3 = findViewById(R.id.textRec3);
        title = findViewById(R.id.recTitle);
        result = findViewById(R.id.recResult);
        calculateBtn = findViewById(R.id.btnRecCalculate);

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String site1 = recSite1.getText().toString();
                String site2 = recSite2.getText().toString();
                String site3 = recSite3.getText().toString();

                double r;

                r = Double.parseDouble(site1) * Double.parseDouble(site2) * Double.parseDouble(site3);

                StringBuilder volume = new StringBuilder();
                volume.append(r);

                result.setText(volume);
            }
        });
    }
}