package com.example.ebooking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class RestoActivity extends Fragment {

    //Declare variables as global variables
    int numberOfPerson = 0;
    int tablePrice = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        View restoView = inflater.inflate(R.layout.resto_activity, container, false);
        return restoView;
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.resto_activity);
//    }
//
//    //Display a number each time the plus or the minus button are clicked
//    private void displayNumberOfPerson(int numberPerson) {
//        TextView numberOfPersonTextView = (TextView) findViewById(R.id.numberOfPerson_text_view);
//        numberOfPersonTextView.setText("" + numberPerson);
//    }
//
//    //Display the price each time the number of person is changed
//    private void displayPriceTable(int tablePrice) {
//        TextView priceTableTextView = (TextView) findViewById(R.id.priceTable_text_view);
//        priceTableTextView.setText("$" + tablePrice);
//    }
//
//    //Decrement each a minus button is clicked
//    public void decrementTable(View view) {
//        numberOfPerson = numberOfPerson - 1;
//        displayNumberOfPerson(numberOfPerson);
//        tablePrice= calculatePriceTable();
//        displayPriceTable(tablePrice);
//    }
//
//    //Increment each time the plus button is clicked
//    public void incrementTable(View view) {
//        numberOfPerson = numberOfPerson + 1;
//        displayNumberOfPerson(numberOfPerson);
//        tablePrice = calculatePriceTable();
//        displayPriceTable(tablePrice);
//    }
//
//    //Calculate the price
//    private int calculatePriceTable() {
//        tablePrice = numberOfPerson * 3;
//        return tablePrice;
//    }
//
//    //Display a toast to notify the user that the reservation has been saved
//    public void bookResto(View view) {
//        String RestoMessage = "Your Reservation have been saved\nThe total price is: " + tablePrice + " for a table of " + numberOfPerson + " people\n";
//        Toast.makeText(RestoActivity.this, RestoMessage, Toast.LENGTH_LONG).show();
//    }
}
