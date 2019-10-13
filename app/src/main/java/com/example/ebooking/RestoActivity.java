package com.example.ebooking;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RestoActivity extends AppCompatActivity {

    int numberOfPerson = 0;
    int tablePrice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resto_activity);
    }

    private void displayNumberOfPerson(int numberPerson) {
        TextView numberOfPersonTextView = (TextView) findViewById(R.id.numberOfPerson_text_view);
        numberOfPersonTextView.setText("" + numberPerson);
    }

    private void displayPriceTable(int tablePrice) {
        TextView priceTableTextView = (TextView) findViewById(R.id.priceTable_text_view);
        priceTableTextView.setText("$" + tablePrice);
    }

    public void decrementTable(View view) {
        numberOfPerson = numberOfPerson - 1;
        displayNumberOfPerson(numberOfPerson);
        tablePrice= calculatePriceTable();
        displayPriceTable(tablePrice);
    }

    public void incrementTable(View view) {
        numberOfPerson = numberOfPerson + 1;
        displayNumberOfPerson(numberOfPerson);
        tablePrice = calculatePriceTable();
        displayPriceTable(tablePrice);
    }

    private int calculatePriceTable() {
        tablePrice = numberOfPerson * 3;
        return tablePrice;
    }

    public void bookResto(View view) {
        String RestoMessage = "Your Reservation have been saved\nThe total price is: " + tablePrice + " for a table of " + numberOfPerson + " people\n";
        Toast.makeText(RestoActivity.this, RestoMessage, Toast.LENGTH_LONG).show();
    }
}
