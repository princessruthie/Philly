package com.ruthiefloats.philly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations_list);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location("Le Bec Fin", "555 Chestnut Street"));
        locations.add(new Location("Pats Steakds", "322 Passayunk Avenue"));
        locations.add(new Location("Geno's Steaks", "324 Passayunk Avenue"));
        locations.add(new Location("Qdoba", "Every third street corner"));
        locations.add(new Location("Le Bec Fin", "555 Chestnut Street"));
        locations.add(new Location("Pats Steakds", "322 Passayunk Avenue"));
        locations.add(new Location("Geno's Steaks", "324 Passayunk Avenue"));
        locations.add(new Location("Qdoba", "Every third street corner"));
        locations.add(new Location("Le Bec Fin", "555 Chestnut Street"));
        locations.add(new Location("Pats Steakds", "322 Passayunk Avenue"));
        locations.add(new Location("Geno's Steaks", "324 Passayunk Avenue"));
        locations.add(new Location("Qdoba", "Every third street corner"));
        locations.add(new Location("Le Bec Fin", "555 Chestnut Street"));
        locations.add(new Location("Pats Steakds", "322 Passayunk Avenue"));
        locations.add(new Location("Geno's Steaks", "324 Passayunk Avenue"));
        locations.add(new Location("Qdoba", "Every third street corner"));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.colorAccent);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
