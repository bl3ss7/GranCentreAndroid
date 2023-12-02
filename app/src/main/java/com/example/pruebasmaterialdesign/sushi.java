package com.example.pruebasmaterialdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;



public class sushi extends AppCompatActivity implements View.OnClickListener{

    CardView clothingCard, b1,b2,b3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sushi);

        ImageButton arrowback, ubi1, num1, ubi2, num2, ubi3, num3;
        ImageView atarasii, jiro, wagaya;

        arrowback = findViewById(R.id.arrowback);
        atarasii = findViewById(R.id.atarasii);
        jiro = findViewById(R.id.jiro);
        wagaya = findViewById(R.id.wagaya);

        ubi1 = findViewById(R.id.ubi1);
        ubi1.setOnClickListener(this);
        num1 = findViewById(R.id.num1);
        num1.setOnClickListener(this);

        ubi2 = findViewById(R.id.ubi2);
        ubi2.setOnClickListener(this);
        num2 = findViewById(R.id.num2);
        num2.setOnClickListener(this);

        ubi3 = findViewById(R.id.ubi3);
        ubi3.setOnClickListener(this);
        num3 = findViewById(R.id.num3);
        num3.setOnClickListener(this);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"http://www.atarasiisushi.es/");
                startActivity(intent);
            }

        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"https://jirosushi.net/");
                startActivity(intent);
            }

        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"https://www.wagaya.es/");
                startActivity(intent);
            }

        });


        Glide.with(this)
                .load("https://lh3.googleusercontent.com/p/AF1QipPwEIFU98wTokWXHZOlhallUlYQFPtyaN4RwESk=s1360-w1360-h1020")
                .placeholder(R.drawable.loading)
                .into(atarasii);

        Glide.with(this)
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzQZw4rx0Xu_9VI7-Pv5xtiAPzSBfiixxJ5CokXRTw1xirmzqebUuBAqkTJRfa7x4gKuE")
                .placeholder(R.drawable.loading)
                .into(jiro);

        Glide.with(this)
                .load("https://media-cdn.tripadvisor.com/media/photo-s/0c/a2/c9/b3/sala-mar.jpg")
                .placeholder(R.drawable.loading)
                .into(wagaya);

        arrowback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sushi.this, restaurants.class);
                startActivity(intent);
            }

        });
    }

    public void onClick(View view) {
        ImageButton b = (ImageButton) view;

        if(b.getId() == R.id.num1){
            Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34  689 87 56 85"));
            startActivity(intent2);
        }
        else if(b.getId() == R.id.ubi1){
            Intent intent3 = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:41.61022540070837, 2.289846253456014"));
            startActivity(intent3);
        }else if(b.getId() == R.id.num2){
            Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:932 31 90 77"));
            startActivity(intent2);
        }
        else if(b.getId() == R.id.ubi2){
            Intent intent3 = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:41.60614143770729, 2.287746907926392"));
            startActivity(intent3);
        }else if(b.getId() == R.id.num3){
            Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:931 58 34 81"));
            startActivity(intent2);
        }
        else if(b.getId() == R.id.ubi3) {
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.6111734442946, 2.2911408613824054"));
            startActivity(intent3);
        }
    }
}