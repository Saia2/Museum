package com.masaia.andriod.museum;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PlantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant);

        ArrayList<CategoryItem> plant = new ArrayList<>();
        plant.add (new CategoryItem("Araucaria Araucana (Monkey Puzzle Tree)", R.drawable.araucariaaraucana));
        plant.add (new CategoryItem("Blechnum Spicant (Deer Fern)", R.drawable.blechnumspicant));
        plant.add (new CategoryItem("Davallia Solida Var. Pyxidata (Hare's Foot Fern)", R.drawable.davalliasolidavarpyxidata));
        plant.add (new CategoryItem("Aristolochia (Dutchman's Pipe)", R.drawable.dutchmanspipe));
        plant.add (new CategoryItem("Equisetum (Puzzlegrass)", R.drawable.equisetum));
        plant.add (new CategoryItem("Ginkgobiloba (Maidenhair Tree)", R.drawable.ginkgobiloba));


        CategoryAdapter adapter = new CategoryAdapter(this, plant);

        ListView listView = findViewById(R.id.plant_list);
        listView.setAdapter(adapter);
    }
}
