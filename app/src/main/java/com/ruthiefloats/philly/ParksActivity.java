package com.ruthiefloats.philly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations_list);

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.park_1),getString(R.string.park_location_1), R.drawable.park1));
        locations.add(new Location(getString(R.string.park_2),getString(R.string.park_location_2), R.drawable.park2));
        locations.add(new Location(getString(R.string.park_3),getString(R.string.park_location_3), R.drawable.park3));
        locations.add(new Location(getString(R.string.park_4),getString(R.string.park_location_4), R.drawable.park4));
        locations.add(new Location(getString(R.string.park_5),getString(R.string.park_location_5), R.drawable.park5));
        locations.add(new Location(getString(R.string.park_6),getString(R.string.park_location_6), R.drawable.park6));
        locations.add(new Location(getString(R.string.park_7),getString(R.string.park_location_7), R.drawable.park7));
        locations.add(new Location(getString(R.string.park_8),getString(R.string.park_location_8), R.drawable.park8));
        locations.add(new Location(getString(R.string.park_9),getString(R.string.park_location_9), R.drawable.park9));

        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
