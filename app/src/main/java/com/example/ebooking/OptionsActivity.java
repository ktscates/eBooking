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

    public void busButton(View view){
        Intent busPage= new Intent(OptionsActivity.this, BusActivity.class);
        startActivity(busPage);
    }

    public void hotelButton(View view){
        Intent hotelPage= new Intent(OptionsActivity.this, HotelActivity.class);
        startActivity(hotelPage);
    }

    public void restoButton(View view){
        Intent restoPage= new Intent(OptionsActivity.this, RestoActivity.class);
        startActivity(restoPage);
    }

    public void eventButton(View view){
        Intent eventPage= new Intent(OptionsActivity.this, EventActivity.class);
        startActivity(eventPage);
    }
}
