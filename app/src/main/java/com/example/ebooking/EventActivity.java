package com.example.ebooking;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EventActivity extends AppCompatActivity {

    int numberOfSeats = 0;
    int eventPrice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_activity);
    }

    private void displaySeat(int seatNumber) {
        TextView numberOfSeatsTextView = (TextView) findViewById(R.id.numberOfSeats_text_view);
        numberOfSeatsTextView.setText("" + seatNumber);
    }

    private void displayPriceEvent(int eventPrice) {
        TextView priceTextView = (TextView) findViewById(R.id.priceEvent_text_view);
        priceTextView.setText("$" + eventPrice);
    }

    public void decrementSeat(View view) {
        numberOfSeats = numberOfSeats - 1;
        displaySeat(numberOfSeats);
        eventPrice = calculatePrice();
        displayPriceEvent(eventPrice);
    }

    public void incrementSeat(View view) {
        numberOfSeats = numberOfSeats + 1;
        displaySeat(numberOfSeats);
        eventPrice = calculatePrice();
        displayPriceEvent(eventPrice);
    }

    private int calculatePrice() {
        eventPrice = numberOfSeats * 15;
        return eventPrice;
    }

    public void bookEvent(View view) {
        String eventMessage = "Your Reservation have been saved\nThe total price is: " + eventPrice + " for " + numberOfSeats + " seats\n";
        Toast.makeText(EventActivity.this, eventMessage, Toast.LENGTH_LONG).show();
    }
}
