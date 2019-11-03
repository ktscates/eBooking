package com.example.ebooking;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ebooking.ui.main.SectionsPagerAdapter;

public class OptionActivity extends AppCompatActivity {

    //Declare variables as global variables
    int numberOfTickets = 0;
    int price = 0;
    //Declare variables as global variables
    int numberOfPerson = 0;
    int tablePrice = 0;
    //Declare variables as global variables
    int numberOfNights = 0;
    int numberOfRooms = 0;
    int nightPrice = 0;
    int roomPrice = 0;
    int total = 0;
    //Declare variables as global variables
    int numberOfSeats = 0;
    int eventPrice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }


    //Display a number each time the plus or the minus button are clicked
    private void display(int number) {
        TextView numberOfTicketsTextView = (TextView) findViewById(R.id.numberOfTickets_text_view);
        numberOfTicketsTextView.setText("" + number);
    }

    //Display the price each time the number of tickets are changed
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
        price = calculateBusPrice();
        displayPrice(price);
    }

    //Calculate the price
    private int calculateBusPrice() {
        price = numberOfTickets * 5;
        return price;
    }

    //Display a toast to notify the user that the reservation has been saved
    public void bookBus(View view) {
        String message = "Your Reservation have been saved\nThe total price is: " + price + " for " + numberOfTickets + " tickets\n";
        Toast.makeText(OptionActivity.this, message, Toast.LENGTH_LONG).show();
    }

    //Display a number each time the plus or the minus button are clicked
    private void displayNumberOfPerson(int numberPerson) {
        TextView numberOfPersonTextView = (TextView) findViewById(R.id.numberOfPerson_text_view);
        numberOfPersonTextView.setText("" + numberPerson);
    }

    //Display the price each time the number of person is changed
    private void displayPriceTable(int tablePrice) {
        TextView priceTableTextView = (TextView) findViewById(R.id.priceTable_text_view);
        priceTableTextView.setText("$" + tablePrice);
    }

    //Decrement each a minus button is clicked
    public void decrementTable(View view) {
        numberOfPerson = numberOfPerson - 1;
        displayNumberOfPerson(numberOfPerson);
        tablePrice= calculatePriceTable();
        displayPriceTable(tablePrice);
    }

    //Increment each time the plus button is clicked
    public void incrementTable(View view) {
        numberOfPerson = numberOfPerson + 1;
        displayNumberOfPerson(numberOfPerson);
        tablePrice = calculatePriceTable();
        displayPriceTable(tablePrice);
    }

    //Calculate the price
    private int calculatePriceTable() {
        tablePrice = numberOfPerson * 3;
        return tablePrice;
    }

    //Display a toast to notify the user that the reservation has been saved
    public void bookResto(View view) {
        String RestoMessage = "Your Reservation have been saved\nThe total price is: " + tablePrice + " for a table of " + numberOfPerson + " people\n";
        Toast.makeText(OptionActivity.this, RestoMessage, Toast.LENGTH_LONG).show();
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
        Toast.makeText(OptionActivity.this, hotelMessage, Toast.LENGTH_LONG).show();
    }

    //Display a number each time the plus or the minus button are clicked
    private void displaySeat(int seatNumber) {
        TextView numberOfSeatsTextView = (TextView) findViewById(R.id.numberOfSeats_text_view);
        numberOfSeatsTextView.setText("" + seatNumber);
    }

    //Display the price each time the number of seats are changed
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
        Toast.makeText(OptionActivity.this, eventMessage, Toast.LENGTH_LONG).show();
    }
}