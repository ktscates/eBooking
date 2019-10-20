package com.example.ebooking;

import android.content.Intent;
import android.icu.util.ULocale;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EventActivity extends AppCompatActivity {

    private static final String TAG = EventActivity.class.getSimpleName();

    @BindView(R.id.locationTextView) TextView mLocationTextView;
    @BindView(R.id.listView) ListView mListView;
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_activity);
        ButterKnife.bind(this);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String events = ((TextView)view).getText().toString();
                Toast.makeText(EventActivity.this, events, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the Events near: " + location);

        YelpApi client = YelpClient.getClient();

        Call<YelpEventSearchResponse> call = client.getEvents(location, "events");

        call.enqueue(new Callback<YelpEventSearchResponse>() {
            @Override
            public void onResponse(Call<YelpEventSearchResponse> call, Response<YelpEventSearchResponse> response) {
                hideProgressBar();

                if (response.isSuccessful()) {
                    List<Event> eventsList = response.body().getEvents();
                    String[] events = new String[eventsList.size()];
//                    String[] categories = new String[eventsList.size()];


                    for (int i = 0; i < events.length; i++){
                        events[i] = eventsList.get(i).getName();
                    }

//                    for (int i = 0; i < categories.length; i++) {
//                        Category category = eventsList.get(i).getCategories().get(0);
//                        categories[i] = category.getTitle();
//                    }

                    ArrayAdapter adapter
                            = new MyEventArrayAdapter(EventActivity.this, android.R.layout.simple_list_item_1, events);
                    mListView.setAdapter(adapter);

                    showEvents();
                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<YelpEventSearchResponse> call, Throwable t) {
                hideProgressBar();
                showFailureMessage();
            }

        });
    }

    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showEvents() {
        mListView.setVisibility(View.VISIBLE);
        mLocationTextView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }
}

//public class EventActivity extends AppCompatActivity {
//
//    //Declare variables as global variables
//    int numberOfSeats = 0;
//    int eventPrice = 0;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.event_activity);
//    }
//
//    //Display a number each time the plus or the minus button are clicked
//    private void displaySeat(int seatNumber) {
//        TextView numberOfSeatsTextView = (TextView) findViewById(R.id.numberOfSeats_text_view);
//        numberOfSeatsTextView.setText("" + seatNumber);
//    }
//
//    //Display the price each time the number of seats are changed
//    private void displayPriceEvent(int eventPrice) {
//        TextView priceTextView = (TextView) findViewById(R.id.priceEvent_text_view);
//        priceTextView.setText("$" + eventPrice);
//    }
//
//    //Decrement each a minus button is clicked
//    public void decrementSeat(View view) {
//        numberOfSeats = numberOfSeats - 1;
//        displaySeat(numberOfSeats);
//        eventPrice = calculatePrice();
//        displayPriceEvent(eventPrice);
//    }
//
//    //Increment each time the plus button is clicked
//    public void incrementSeat(View view) {
//        numberOfSeats = numberOfSeats + 1;
//        displaySeat(numberOfSeats);
//        eventPrice = calculatePrice();
//        displayPriceEvent(eventPrice);
//    }
//
//    //Calculate the price
//    private int calculatePrice() {
//        eventPrice = numberOfSeats * 15;
//        return eventPrice;
//    }
//
//    //Display a toast to notify the user that the reservation has been saved
//    public void bookEvent(View view) {
//        String eventMessage = "Your Reservation have been saved\nThe total price is: " + eventPrice + " for " + numberOfSeats + " seats\n";
//        Toast.makeText(EventActivity.this, eventMessage, Toast.LENGTH_LONG).show();
//    }
//}
