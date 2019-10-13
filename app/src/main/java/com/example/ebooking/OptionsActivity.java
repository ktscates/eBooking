package com.example.ebooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class OptionsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_activity);
    }

    //When clicked, it will take you to the bus page
    public void busButton(View view){
        Intent busPage= new Intent(OptionsActivity.this, BusActivity.class);
        startActivity(busPage);
    }

    //When clicked, it will take you to the hotel page
    public void hotelButton(View view){
        Intent hotelPage= new Intent(OptionsActivity.this, HotelActivity.class);
        startActivity(hotelPage);
    }

    //When clicked, it will take you to the resto page
    public void restoButton(View view){
        Intent restoPage= new Intent(OptionsActivity.this, RestoActivity.class);
        startActivity(restoPage);
    }

    //When clicked, it will take you to the event page
    public void eventButton(View view){
        Intent eventPage= new Intent(OptionsActivity.this, EventActivity.class);
        startActivity(eventPage);
    }
}
