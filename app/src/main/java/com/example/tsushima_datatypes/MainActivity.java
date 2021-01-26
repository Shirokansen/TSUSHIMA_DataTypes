package com.example.tsushima_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displayText);

        String firstname = "Kouji";
        char middleInitital = 'A';
        String lastname = "Tsushima";
        float myDreamTVLGrade = 99.0f;
        int myAge = 29;

        double myMoney = 99999.99;



        //String.valueOf(myMoney);
        display.setText("my firstname is "+firstname+ " "
                +String.valueOf(myAge)+" and my money is "+String.valueOf(middleInitital)+" "
                +lastname+ " \nand my age is "
                +myAge+ ". \nI want my grade in TVL3 to be "
                +String.valueOf(myDreamTVLGrade));


        boolean amIMarried = false;



    }
}