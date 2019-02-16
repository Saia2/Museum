package com.masaia.andriod.museum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        ArrayList<CategoryItem> animal = new ArrayList<>();
        animal.add (new CategoryItem("Genyornis", R.drawable.genyornis));
        animal.add (new CategoryItem("Komodo", R.drawable.komodo));
        animal.add (new CategoryItem("Sabertooth", R.drawable.sabertooth));
        animal.add (new CategoryItem("Spinosaurus", R.drawable.spinosaurus));
        animal.add (new CategoryItem("Tyrannosaurus rex", R.drawable.trex));
        animal.add (new CategoryItem("Velociraptor", R.drawable.velociraptor));


        CategoryAdapter adapter = new CategoryAdapter(this, animal);

        ListView listView = findViewById(R.id.animal_list);
        listView.setAdapter(adapter);
    }

}
