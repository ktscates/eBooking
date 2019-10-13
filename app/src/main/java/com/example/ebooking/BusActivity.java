package com.example.ebooking;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BusActivity extends AppCompatActivity {

    //Declare variables as global variables
    int numberOfTickets = 0;
    int price = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus_activity);
    }

    //Display a number each time the plus or the minus button are clicked
    private void display(int number) {
        TextView numberOfTicketsTextView = (TextView) findViewById(R.id.numberOfTickets_text_view);
        numberOfTicketsTextView.setText("" + number);
    }

    //Display the price each time the number of tickets is changed
    private void displayPrice(int price) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("$" + price);
    }

    //Decrement each a minus button is clicked
    public void decrement(View view) {
        numberOfTickets = numberOfTickets - 1;
        display(numberOfTickets);
        price = calculatePrice();
        displayPrice(price);
    }

    //Increment each time the plus button is clicked
    public void increment(View view) {
        numberOfTickets = numberOfTickets + 1;
        display(numberOfTickets);
        price = calculatePrice();
        displayPrice(price);
    }

    //Calculate the price
    private int calculatePrice() {
        price = numberOfTickets * 5;
        return price;
    }

    //Display a toast to notify the user that the reservation has been saved
    public void bookBus(View view) {
        String message = "Your Reservation have been saved\nThe total price is: " + price + " for " + numberOfTickets + " tickets\n";
        Toast.makeText(BusActivity.this, message, Toast.LENGTH_LONG).show();
    }
}



