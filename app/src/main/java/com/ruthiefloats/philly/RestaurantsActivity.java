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
        locations.add(new Location(getString(R.string.restaurant_1), getString(R.string.restaurant_location_1)));
        locations.add(new Location(getString(R.string.restaurant_2), getString(R.string.restaurant_location_2)));
        locations.add(new Location(getString(R.string.restaurant_3), getString(R.string.restaurant_location_3)));
        locations.add(new Location(getString(R.string.restaurant_4), getString(R.string.restaurant_location_4)));
        locations.add(new Location(getString(R.string.restaurant_5), getString(R.string.restaurant_location_5)));
        locations.add(new Location(getString(R.string.restaurant_6), getString(R.string.restaurant_location_6)));
        locations.add(new Location(getString(R.string.restaurant_7), getString(R.string.restaurant_location_7)));
        locations.add(new Location(getString(R.string.restaurant_8), getString(R.string.restaurant_location_8)));
        locations.add(new Location(getString(R.string.restaurant_9), getString(R.string.restaurant_location_9)));
        locations.add(new Location(getString(R.string.restaurant_10), getString(R.string.restaurant_location_10)));

        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.colorAccent);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
