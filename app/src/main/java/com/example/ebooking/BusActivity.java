package com.example.ebooking;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BusActivity extends AppCompatActivity {

    int numberOfTickets = 0;
    int price = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus_activity);
    }

    private void display(int number) {
        TextView numberOfTicketsTextView = (TextView) findViewById(R.id.numberOfTickets_text_view);
        numberOfTicketsTextView.setText("" + number);
    }

    private void displayPrice(int price) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("$" + price);
    }

    public void decrement(View view) {
        numberOfTickets = numberOfTickets - 1;
        display(numberOfTickets);
        price = calculatePrice();
        displayPrice(price);
    }

    public void increment(View view) {
        numberOfTickets = numberOfTickets + 1;
        display(numberOfTickets);
        price = calculatePrice();
        displayPrice(price);
    }

    private int calculatePrice() {
        price = numberOfTickets * 5;
        return price;
    }

    public void bookBus(View view) {
        String message = "Your Reservation have been saved\nThe total price is: " + price + " for " + numberOfTickets + " tickets\n";
        Toast.makeText(BusActivity.this, message, Toast.LENGTH_LONG).show();
    }
}



