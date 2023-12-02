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



public class italia extends AppCompatActivity implements View.OnClickListener{

    CardView clothingCard, b4,b5,b6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italia);

        ImageButton arrowback, ubi4, num4, ubi5, num5, ubi6, num6;
        ImageView elitaliano, mezza, sapore;

        arrowback = findViewById(R.id.arrowback);
        elitaliano = findViewById(R.id.ElItaliano);
        mezza = findViewById(R.id.mezza);
        sapore = findViewById(R.id.sapore);

        ubi4 = findViewById(R.id.ubi4);
        ubi4.setOnClickListener(this);
        num4 = findViewById(R.id.num4);
        num4.setOnClickListener(this);

        ubi5 = findViewById(R.id.ubi5);
        ubi5.setOnClickListener(this);
        num5 = findViewById(R.id.num5);
        num5.setOnClickListener(this);

        ubi6 = findViewById(R.id.ubi6);
        ubi6.setOnClickListener(this);
        num6 = findViewById(R.id.num6);
        num6.setOnClickListener(this);

        b4 = findViewById(R.id.b4);
        b5= findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"https://www.ubereats.com/es/store/el-italiano/9Jy-zenzST2WE4p-qaSYlA");
                startActivity(intent);
            }

        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"https://lamezzaluna.es/");
                startActivity(intent);
            }

        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"https://ilsaporeitaliano.es/");
                startActivity(intent);
            }

        });


        Glide.with(this)
                .load("https://media-cdn.tripadvisor.com/media/photo-s/0c/f3/fb/15/el-italiano-de-granollers.jpg")
                .placeholder(R.drawable.loading)
                .into(elitaliano);

        Glide.with(this)
                .load("https://media-cdn.tripadvisor.com/media/photo-s/14/2d/70/20/buon-profitto.jpg")
                .placeholder(R.drawable.loading)
                .into(mezza);

        Glide.with(this)
                .load("https://images-platform.99static.com/JWyfKQEaPmvsCEPxlXxZWmIHQY0=/241x0:1741x1500/500x500/top/smart/99designs-contests-attachments/94/94396/attachment_94396495")
                .placeholder(R.drawable.loading)
                .into(sapore);

        arrowback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(italia.this, restaurants.class);
                startActivity(intent);
            }

        });
    }

    public void onClick(View view) {
        ImageButton b = (ImageButton) view;

        if(b.getId() == R.id.num4){
            Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:931 29 63 46"));
            startActivity(intent2);
        } else if(b.getId() == R.id.ubi4){
            Intent intent3 = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:41.609479815045155, 2.288342080400613"));
            startActivity(intent3);
        } else if(b.getId() == R.id.num5){
            Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:938 79 52 23"));
            startActivity(intent2);
        } else if(b.getId() == R.id.ubi5){
            Intent intent3 = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:41.60339247880756, 2.28810292643612"));
            startActivity(intent3);
        } else if(b.getId() == R.id.num6){
            Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:938 40 15 32"));
            startActivity(intent2);
        } else if(b.getId() == R.id.ubi6) {
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.61365465415235, 2.28675534581561 "));
            startActivity(intent3);
        }

    }
}