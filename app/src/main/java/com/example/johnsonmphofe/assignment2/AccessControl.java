package com.example.johnsonmphofe.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import static com.example.johnsonmphofe.assignment2.R.id.text_view;

public class AccessControl extends AppCompatActivity {

    public String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_control);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                calcBtn_1();

            }

        });

        Button btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                calcBtn_2();

            }

        });

        Button btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                calcBtn_3();

            }

        });

        Button btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                calcBtn_4();

            }

        });

        Button btn_5 = (Button) findViewById(R.id.btn_5);
        btn_5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                calcBtn_5();

            }

        });

    }

    public void calcBtn_1() {

        password += "1";
    }

    public void calcBtn_2() {

        password += "2";
    }

    public void calcBtn_3() {

        password += "3";
    }

    public void calcBtn_4() {

        password += "4";
    }

    public void calcBtn_5() {


        if (password.equals("1234")) {

            startActivity(new Intent(AccessControl.this, WelcomeScreen.class));
            setContentView(R.layout.activity_welcome_screen);
            TextView text = (TextView) findViewById(R.id.text_view);
            //text.setText("Welcome to this App! The App is UNLOCKED!");
            text.setText(R.string.unlock_screen);

            //TextView text = (TextView) findViewById(R.id.text_view);
            //text.setText("Welcome to this App! The App is LOCKED!");
            //text.setText(R.string.welcome_screen);


        }

        else  {

            startActivity(new Intent(AccessControl.this, WelcomeScreen.class));
            setContentView(R.layout.activity_welcome_screen);
            TextView text = (TextView) findViewById(R.id.text_view);
            text.setText("Welcome to this App! The App is LOCKED!");
            text.setText(R.string.welcome_screen);

            //TextView text = (TextView) findViewById(R.id.text_view);
            //text.setText("Welcome to this App! The App is UNLOCKED!");
            //text.setText(R.string.unlock_screen);

        }

    }




    /*private void locked(){

        setContentView(R.layout.activity_welcome_screen);
        TextView text = (TextView) findViewById(R.id.text_view);
        text.setText("Welcome to this App! The App is LOCKED!");

    }

    private void unlocked(){

        setContentView(R.layout.activity_welcome_screen);
        TextView text = (TextView) findViewById(R.id.text_view);
        text.setText("Welcome to this App! The App is UNLOCKED!");

    }
*/
}
