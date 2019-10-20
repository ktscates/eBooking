package com.example.ebooking;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HotelActivity extends AppCompatActivity {

    //Declare variables as global variables
    int numberOfNights = 0;
    int numberOfRooms = 0;
    int nightPrice = 0;
    int roomPrice = 0;
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_activity);
    }

    //Display a number each time the plus or the minus button are clicked
    private void displayNumberOfNights(int nightNumber) {
        TextView numberOfNightsTextView = (TextView) findViewById(R.id.numberOfNights_text_view);
        numberOfNightsTextView.setText("" + nightNumber);
    }

    //Display a number each time the plus or the minus button are clicked
    private void displayNumberOfRooms(int roomNumber) {
        TextView numberOfRoomsTextView = (TextView) findViewById(R.id.numberOfRooms_text_view);
        numberOfRoomsTextView.setText("" + roomNumber);
    }

    //Display the price each time the number of nights are changed
    private void displayNightPrice(int nightPrice) {
        TextView nightPriceTextView = (TextView) findViewById(R.id.nightPrice_text_view);
        nightPriceTextView.setText("$" + nightPrice);
    }

    //Display the price each time the number of rooms are changed
    private void displayRoomPrice(int roomPrice) {
        TextView roomPriceTextView = (TextView) findViewById(R.id.roomPrice_text_view);
        roomPriceTextView.setText("$" + roomPrice);
    }

    //Display the total price
    private void displayTotalPrice(int total) {
        TextView totalTextView = (TextView) findViewById(R.id.totalPrice_text_view);
        totalTextView.setText("$" + total);
    }

    //Decrement the number of nights
    public void decrementNight(View view) {
        numberOfNights = numberOfNights - 1;
        displayNumberOfNights(numberOfNights);
        nightPrice = calculateNightPrice();
        displayNightPrice(nightPrice);
        total = totalPrice();
        displayTotalPrice(total);
    }

    //Increment the number of nights
    public void incrementNight(View view) {
        numberOfNights = numberOfNights + 1;
        displayNumberOfNights(numberOfNights);
        nightPrice = calculateNightPrice();
        displayNightPrice(nightPrice);
        total = totalPrice();
        displayTotalPrice(total);
    }

    //Decrement the number of rooms
    public void decrementRoom(View view) {
        numberOfRooms = numberOfRooms - 1;
        displayNumberOfNights(numberOfRooms);
        nightPrice = calculateNightPrice();
        displayNightPrice(nightPrice);
        total = totalPrice();
        displayTotalPrice(total);
    }

    //Increment the number of rooms
    public void incrementRoom(View view) {
        numberOfRooms = numberOfRooms + 1;
        displayNumberOfRooms(numberOfRooms);
        roomPrice = calculateRoomPrice();
        displayRoomPrice(roomPrice);
        total = totalPrice();
        displayTotalPrice(total);
    }

    //Calculate the price of nights
    private int calculateNightPrice() {
        nightPrice = numberOfNights * 10;
        return nightPrice;
    }

    //Calculate the price of rooms
    private int calculateRoomPrice() {
        roomPrice = numberOfRooms * 15;
        return roomPrice;
    }

    //Calculate the total price
    private int totalPrice(){
        total = nightPrice + roomPrice;
        return total;
    }

    //Display a toast to notify the user that the reservation has been saved
    public void bookHotel(View view) {
        String hotelMessage = "Your Reservation have been saved\nThe total price is: " + total + " for " + numberOfNights + " nights " + " and " + numberOfRooms + " rooms";
        Toast.makeText(HotelActivity.this, hotelMessage, Toast.LENGTH_LONG).show();
    }
}
