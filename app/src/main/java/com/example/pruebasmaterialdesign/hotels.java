package com.example.pruebasmaterialdesign;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class hotels extends AppCompatActivity {

    private ImageButton arrowBack;
    private ImageButton[] numButtons = new ImageButton[15];
    private ImageButton[] actionButtons = new ImageButton[15];

    private final String[] phoneNumbers = {
            "+34 958 27 87 50",
            "+34 934 36 98 00",
            "+34 935 55 23 13",
            "+34 900 533 147",
            "+34 618 24 31 05",
            "+34 935 68 90 60",
            "+34 938 70 03 12",
            "+34 937 017 000",
            "+34 938 79 29 29",
            "+34 938 79 48 20",
            "+34 938 45 60 50",
            "+34 938 79 62 20",
            "+34 932 59 30 00",
            "+34 935 65 60 60",
            "+34 652 73 46 91"
    };

    private final String[] webUrls = {
            "https://hostalathenas.com/",
            "https://www.hoteleverest.es/",
            "https://www.hoteltorinoelmasnou.com/ca/",
            "https://www.hotel-bb.com/es",
            "http://www.hotelverti.com/",
            "https://all.accor.com/hotel/5258/index.es.shtml",
            "https://hotelfondaeuropa.com/",
            "https://www.ihg.com/holidayinnexpress/hotels/us/es/reservation",
            "https://www.hoteliris.com/",
            "https://www.aparthotelateneavalles.com/es/",
            "https://www.hotelaugustavalles.com/es/",
            "https://www.hotelciutatgranollers.com/en/?partner=8979",
            "https://www.hotelfloridabarcelona.com/",
            "https://www.massalagros.com/",
            "https://villavictoriabarcelona.com/"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        initializeButtons();
        arrowBack = findViewById(R.id.arrowback);
        setButtonClickListeners();
        arrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hotels.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initializeButtons() {
        for (int i = 0; i < 15; i++) {
            numButtons[i] = findViewById(getResources().getIdentifier("num" + (i + 1), "id", getPackageName()));
            actionButtons[i] = findViewById(getResources().getIdentifier("ubi" + (i + 1), "id", getPackageName()));
        }
    }

    private void setButtonClickListeners() {
        for (int i = 0; i < 15; i++) {
            final int index = i;
            numButtons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String phoneNumber = getPhoneNumber(index);
                    dialPhoneNumber(phoneNumber);
                }
            });
            actionButtons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String webUrl = getWebUrl(index);
                    openWebPage(webUrl);
                }
            });
        }
    }

    private String getPhoneNumber(int index) {
        if (index >= 0 && index < phoneNumbers.length) {
            return phoneNumbers[index];
        }
        return "";
    }

    private String getWebUrl(int index) {
        if (index >= 0 && index < webUrls.length) {
            return webUrls[index];
        }
        return "";
    }

    private void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:" + phoneNumber));
        startActivity(intent);
    }

    private void openWebPage(String webUrl) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl));
        startActivity(intent);
    }
}
