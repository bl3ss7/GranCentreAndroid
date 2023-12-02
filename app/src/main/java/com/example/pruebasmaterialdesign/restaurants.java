package com.example.pruebasmaterialdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ImageButton;
import android.widget.ArrayAdapter;

import com.bumptech.glide.Glide;

public class restaurants extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    CardView clothingCard, b1,b2,b3;
    boolean firstSelection = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        ImageButton arrowback, ubi1, num1, ubi2, num2, ubi3, num3;

        arrowback = findViewById(R.id.arrowback);

        ImageView atarasii, macdo, elitaliano;

        arrowback = findViewById(R.id.arrowback);
        atarasii = findViewById(R.id.atarasii);
        macdo = findViewById(R.id.macdo);
        elitaliano = findViewById(R.id.ElItaliano);

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
                intent.putExtra(SearchManager.QUERY,"https://mcdonalds.es/");
                startActivity(intent);
            }

        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"https://media-cdn.tripadvisor.com/media/photo-s/0c/f3/fb/15/el-italiano-de-granollers.jpg");
                startActivity(intent);
            }

        });

        Glide.with(this)
                .load("https://media-cdn.tripadvisor.com/media/photo-s/0c/f3/fb/15/el-italiano-de-granollers.jpg")
                .placeholder(R.drawable.loading)
                .into(elitaliano);
        Glide.with(this)
                .load("https://www.mcdonaldsferrol.com/wp-content/uploads/2019/11/Logo-Restaurantes-McDonalds-Coruna-512px.png")
                .placeholder(R.drawable.loading)
                .into(macdo);
        Glide.with(this)
                .load("https://lh3.googleusercontent.com/p/AF1QipPwEIFU98wTokWXHZOlhallUlYQFPtyaN4RwESk=s1360-w1360-h1020")
                .placeholder(R.drawable.loading)
                .into(atarasii);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.restaurants, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



        arrowback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(restaurants.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {

        if (firstSelection) {
            firstSelection = false; // Cambia la bandera a falso después de la primera selección
            return; // Evita realizar acciones en la primera selección
        }
        String opcionSeleccionada = parent.getItemAtPosition(position).toString();

        if (opcionSeleccionada.equals("Sushi")) {
            Intent intent = new Intent(restaurants.this, sushi.class);
            startActivity(intent);
        } else if (opcionSeleccionada.equals("Italià")) {
            Intent intent = new Intent(restaurants.this, italia.class);
            startActivity(intent);
        } else if (opcionSeleccionada.equals("FastFood")) {
            Log.d("DEBUG", "Seleccionado FastFood - Iniciando menjaRapid Activity");
            Intent intent3 = new Intent(restaurants.this, menjaRapid.class);
            startActivity(intent3);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {
        ImageButton b = (ImageButton) view;

        if(b.getId() == R.id.num1){
            Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:+34  689 87 56 85"));
            startActivity(intent2);
        }
        else if(b.getId() == R.id.ubi1){
            Intent intent3 = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:41.61022540070837, 2.289846253456014"));
            startActivity(intent3);
        } else if (b.getId() == R.id.num2) {
            Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:931 29 63 46"));
            startActivity(intent2);
        } else if (b.getId() == R.id.ubi2) {
            Intent intent3 = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:41.609479815045155, 2.288342080400613"));
            startActivity(intent3);
        } else if (b.getId() == R.id.num3) {
            Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:936 45 84 76"));
            startActivity(intent2);
        } else if (b.getId() == R.id.ubi3) {
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.604911469190604, 2.2906696613824056"));
            startActivity(intent3);
        }
    }
}