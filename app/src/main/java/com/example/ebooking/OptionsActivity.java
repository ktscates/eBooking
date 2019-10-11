package com.example.ebooking;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OptionsActivity extends AppCompatActivity {

    private TextView options;
    private ListView optionList;
    private String[] listOfOption = new String[] {"Bus Ticket Reservation", "Hotel Reservation", "Restaurant Reservation", "Event Reservation"};
    private String[] description = new String[] {"Book a Bus Ticket", "Book a Hotel Room", "Book a Table at your favorite Restaurant", "Book a Seat at your favorite Event"};

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_activity);

        options = (TextView) findViewById(R.id.option_text_view);
        optionList = (ListView) findViewById(R.id.option_list_view);
        OptionsArrayAdapter allOption = new OptionsArrayAdapter(this, android.R.layout.simple_list_item_1, listOfOption, description);
        optionList.setAdapter(allOption);

        optionList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String optionSelected = ((TextView)view).getText().toString();
                Toast.makeText(OptionsActivity.this, optionSelected, Toast.LENGTH_LONG).show();
            }

        });
    }
}
