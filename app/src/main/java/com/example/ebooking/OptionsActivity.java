package com.example.ebooking;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OptionsActivity extends AppCompatActivity {

    private TextView options;
    private ListView optionList;
    private String[] listOfOption = {"Bus Ticket Reservation", "Hotel Reservation", "Restaurant Reservation", "Event Reservation"};

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_activity);

        options = (TextView) findViewById(R.id.option_text_view);
        optionList = (ListView) findViewById(R.id.option_list_view);
    }
}
