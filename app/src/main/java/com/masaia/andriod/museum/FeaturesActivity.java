package com.masaia.andriod.museum;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class FeaturesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_features);
        }

        public void openPlant(View view){
            Intent i = new Intent(this, PlantActivity.class);
            startActivity(i);

    }
        public void openAnimal(View view){
            Intent i = new Intent(this, AnimalActivity.class);
            startActivity(i);
    }
}

