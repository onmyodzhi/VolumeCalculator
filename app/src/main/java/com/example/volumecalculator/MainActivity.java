package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.UserHandle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Shape> shapeArrayList;
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        shapeArrayList = new ArrayList<>();

        Shape sphere = new Shape(R.drawable.sphere,"Sphere");
        Shape cube = new Shape(R.drawable.cube,"Cube");
        Shape rectangle = new Shape(R.drawable.rectangle,"Rectangle");
        Shape cylinder = new Shape(R.drawable.celinder,"Cylinder");

        shapeArrayList.add(sphere);
        shapeArrayList.add(cube);
        shapeArrayList.add(rectangle);
        shapeArrayList.add(cylinder);

        adapter = new MyCustomAdapter(shapeArrayList, getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) startActivity(new Intent(getApplicationContext(), Sphere.class));
                if (position == 1) startActivity(new Intent(getApplicationContext(), Cube.class));
                if (position == 2) startActivity(new Intent(getApplicationContext(), Rectangle.class));
                if (position == 3) startActivity(new Intent(getApplicationContext(), Cylinder.class));

            }
        });

    }
}