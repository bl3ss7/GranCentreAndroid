package com.example.pruebasmaterialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pelicules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelicules);

        ImageButton arrowback;

        arrowback = findViewById(R.id.arrowback);

        arrowback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pelicules.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }
}