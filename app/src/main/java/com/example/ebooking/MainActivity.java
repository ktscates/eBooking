package com.example.ebooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Declare variables
    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign variables
        username = (EditText) findViewById(R.id.user_edit_text);
        password = (EditText) findViewById(R.id.pass_edit_text);
        login = (Button) findViewById(R.id.login_button);

        //When the login button is clicked, it takes you to another page
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                Intent optionPage= new Intent(MainActivity.this, OptionsActivity.class);
                optionPage.putExtra("user", user);
                startActivity(optionPage);
            }
        });
    }
}
