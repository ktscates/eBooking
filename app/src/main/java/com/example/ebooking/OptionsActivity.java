//package com.example.ebooking;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//
//
//public class OptionsActivity extends AppCompatActivity {
//    @BindView(R.id.findEventsButton) Button mFindEventsButton;
//    @BindView(R.id.locationEditText) EditText mLocationEditText;
//    @BindView(R.id.appNameTextView) TextView mAppNameTextView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);
//
//        mFindEventsButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String location = mLocationEditText.getText().toString();
//                Intent intent = new Intent(OptionsActivity.this, EventActivity.class);
//                intent.putExtra("location", location);
//                startActivity(intent);
//            }
//        });
//    }
//}

//public class OptionsActivity extends AppCompatActivity {
//
//    @Override
//    public void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.options_activity);
//    }
//
//    //When clicked, it will take you to the bus page
//    public void busButton(View view){
//        Intent busPage= new Intent(OptionsActivity.this, BusActivity.class);
//        startActivity(busPage);
//    }
//
//    //When clicked, it will take you to the hotel page
//    public void hotelButton(View view){
//        Intent hotelPage= new Intent(OptionsActivity.this, HotelActivity.class);
//        startActivity(hotelPage);
//    }
//
//    //When clicked, it will take you to the resto page
//    public void restoButton(View view){
//        Intent restoPage= new Intent(OptionsActivity.this, RestoActivity.class);
//        startActivity(restoPage);
//    }
//
//    //When clicked, it will take you to the event page
//    public void eventButton(View view){
//        Intent eventPage= new Intent(OptionsActivity.this, EventActivity.class);
//        startActivity(eventPage);
//    }
//}
