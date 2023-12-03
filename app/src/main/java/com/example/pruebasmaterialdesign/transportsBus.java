package com.example.pruebasmaterialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class transportsBus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transports_bus);

        ImageButton arrowback;

        androidx.cardview.widget.CardView b1, b2, b3, b4, b5;
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        arrowback = findViewById(R.id.arrowback);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sagales.com/uploads/imagenes/185d938e1658a96877f88c31a2a1e8d2225c2145.pdf"));
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sagales.com/uploads/imagenes/185d938e1658a96877f88c31a2a1e8d2225c2145.pdf"));
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sagales.com/uploads/imagenes/a8ec94d02e99c1033f80caf840fea3ecd6f522c2.pdf"));
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sagales.com/uploads/imagenes/124887ba414b59b64e1f7eb6452e5d9ddc2a2fa8.pdf"));
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sagales.com/uploads/imagenes/20180125150420_734f9f7844db134cc9239c93aa035b478b8be7e0.pdf"));
                startActivity(intent);
            }
        });
        arrowback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(transportsBus.this, transports.class);
                startActivity(intent);
            }
        });
    }
}