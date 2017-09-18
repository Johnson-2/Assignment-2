package com.example.johnsonmphofe.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;


public class WelcomeScreen extends AppCompatActivity {

    //declaring variables
    //private Button btnSend;
    //public TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        //linking text file and button to variable
        Button btnSend = (Button) findViewById(R.id.btnSend);
        TextView text = (TextView) findViewById(R.id.text_view);
        //text.setText("Welcome to this App! The App is LOCKED!");
        text.setText(R.string.welcome_screen);

        btnSend.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View View){
                startActivity(new Intent(WelcomeScreen.this, AccessControl.class));
            }
        });
    }
}
