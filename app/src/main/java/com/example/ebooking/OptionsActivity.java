package com.example.ebooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OptionsActivity extends AppCompatActivity {

    private Button busTicket;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_activity);

        busTicket = (Button) findViewById(R.id.bus_button);
    }

    public void busButton(View view){
        Intent busPage= new Intent(OptionsActivity.this, BusActivity.class);
        startActivity(busPage);
    }
}
