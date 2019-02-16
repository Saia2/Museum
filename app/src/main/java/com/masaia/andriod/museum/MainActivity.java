package com.masaia.andriod.museum;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openFeatures(View view){
        Intent i = new Intent(this, FeaturesActivity.class);
        startActivity(i);
        }

    public void openInfo(View view){
        Intent i = new Intent(this, InfoActivity.class);
        startActivity(i);
    }

    public void openTickets(View view){
        Intent i = new Intent(this, TicketActivity.class);
        startActivity(i);
    }
}
