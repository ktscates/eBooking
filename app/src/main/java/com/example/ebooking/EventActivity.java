package com.example.ebooking;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EventActivity extends AppCompatActivity {

    //Declare variables as global variables
    int numberOfSeats = 0;
    int eventPrice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_activity);
    }

    //Display a number each time the plus or the minus button are clicked
    private void displaySeat(int seatNumber) {
        TextView numberOfSeatsTextView = (TextView) findViewById(R.id.numberOfSeats_text_view);
        numberOfSeatsTextView.setText("" + seatNumber);
    }

    //Display the price each time the number of seats is changed
    private void displayPriceEvent(int eventPrice) {
        TextView priceTextView = (TextView) findViewById(R.id.priceEvent_text_view);
        priceTextView.setText("$" + eventPrice);
    }

    //Decrement each a minus button is clicked
    public void decrementSeat(View view) {
        numberOfSeats = numberOfSeats - 1;
        displaySeat(numberOfSeats);
        eventPrice = calculatePrice();
        displayPriceEvent(eventPrice);
    }

    //Increment each time the plus button is clicked
    public void incrementSeat(View view) {
        numberOfSeats = numberOfSeats + 1;
        displaySeat(numberOfSeats);
        eventPrice = calculatePrice();
        displayPriceEvent(eventPrice);
    }

    //Calculate the price
    private int calculatePrice() {
        eventPrice = numberOfSeats * 15;
        return eventPrice;
    }

    //Display a toast to notify the user that the reservation has been saved
    public void bookEvent(View view) {
        String eventMessage = "Your Reservation have been saved\nThe total price is: " + eventPrice + " for " + numberOfSeats + " seats\n";
        Toast.makeText(EventActivity.this, eventMessage, Toast.LENGTH_LONG).show();
    }
}
