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



public class menjaRapid extends AppCompatActivity implements View.OnClickListener{

    CardView clothingCard, b7,b8,b9;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menja_rapid);

        ImageButton arrowback, ubi7, num7, ubi8, num8, ubi9, num9;

        ImageView macdo, burger, dominos;

        arrowback = findViewById(R.id.arrowback);
        macdo = findViewById(R.id.macdo);
        burger = findViewById(R.id.burger);
        dominos = findViewById(R.id.dominos);

        ubi7 = findViewById(R.id.ubi7);
        ubi7.setOnClickListener(this);
        num7 = findViewById(R.id.num7);
        num7.setOnClickListener(this);

        ubi8 = findViewById(R.id.ubi8);
        ubi8.setOnClickListener(this);
        num8 = findViewById(R.id.num8);
        num8.setOnClickListener(this);

        ubi9 = findViewById(R.id.ubi9);
        ubi9.setOnClickListener(this);
        num9 = findViewById(R.id.num9);
        num9.setOnClickListener(this);

        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);


        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"https://mcdonalds.es/");
                startActivity(intent);
            }

        });
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"https://www.burgerking.es/home");
                startActivity(intent);
            }

        });
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"https://www.dominospizza.es/");
                startActivity(intent);
            }

        });


        Glide.with(this)
                .load("https://www.mcdonaldsferrol.com/wp-content/uploads/2019/11/Logo-Restaurantes-McDonalds-Coruna-512px.png")
                .placeholder(R.drawable.loading)
                .into(macdo);

        Glide.with(this)
                .load("https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Burger_King_logo_%281999%29.svg/2024px-Burger_King_logo_%281999%29.svg.png")
                .placeholder(R.drawable.loading)
                .into(burger);

        Glide.with(this)
                .load("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Domino%27s_pizza_logo.svg/800px-Domino%27s_pizza_logo.svg.png")
                .placeholder(R.drawable.loading)
                .into(dominos);

        arrowback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menjaRapid.this, restaurants.class);
                startActivity(intent);
            }

        });
    }

    public void onClick(View view) {
        ImageButton b = (ImageButton) view;

        if(b.getId() == R.id.num7){
            Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:936 45 84 76"));
            startActivity(intent2);
        } else if(b.getId() == R.id.ubi7){
            Intent intent3 = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:41.60086461311954, 2.282120688880758"));
            startActivity(intent3);
        } else if(b.getId() == R.id.num8){
            Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34 648 24 34 50"));
            startActivity(intent2);
        } else if(b.getId() == R.id.ubi8){
            Intent intent3 = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:41.61443631749156, 2.30179094893263"));
            startActivity(intent3);
        } else if(b.getId() == R.id.num9){
            Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:935 21 27 54"));
            startActivity(intent2);
        } else if(b.getId() == R.id.ubi9) {
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.604911469190604, 2.2906696613824056"));
            startActivity(intent3);
        }

    }
}