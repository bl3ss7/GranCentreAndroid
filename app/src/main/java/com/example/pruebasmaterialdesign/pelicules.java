package com.example.pruebasmaterialdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class pelicules extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelicules);

        ImageButton arrowback;
        CardView clothingCard, b1,b2,b3,b4,b5;
        ImageView p1,p2,p3,p4,p5;

        arrowback = findViewById(R.id.arrowback);

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        p4 = findViewById(R.id.p4);
        p5 = findViewById(R.id.p5);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);


        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"https://www.ocinegranollers.es/?option=com_cines&task=peli&iid=5903");
                startActivity(intent);
            }

        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"https://www.ocinegranollers.es/?option=com_cines&task=peli&iid=5879");
                startActivity(intent);
            }

        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"https://www.ocinegranollers.es/?option=com_cines&task=peli&iid=5909");
                startActivity(intent);
            }

        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"https://www.ocinegranollers.es/?option=com_cines&task=peli&iid=6057");
                startActivity(intent);
            }

        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"https://www.ocinegranollers.es/?option=com_cines&task=peli&iid=5933");
                startActivity(intent);
            }

        });



        Glide.with(this)
                .load("https://www.ocinegranollers.es/images/pelicules/5903.jpg")
                .placeholder(R.drawable.loading)
                .into(p1);

        Glide.with(this)
                .load("https://www.ocinegranollers.es/images/pelicules/5879.jpg")
                .placeholder(R.drawable.loading)
                .into(p2);

        Glide.with(this)
                .load("https://www.ocinegranollers.es/images/pelicules/5909.jpg")
                .placeholder(R.drawable.loading)
                .into(p3);

        Glide.with(this)
                .load("https://www.ocinegranollers.es/images/pelicules/6057.jpg")
                .placeholder(R.drawable.loading)
                .into(p4);

        Glide.with(this)
                .load("https://www.ocinegranollers.es/images/pelicules/5933.jpg")
                .placeholder(R.drawable.loading)
                .into(p5);

        arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pelicules.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }
}