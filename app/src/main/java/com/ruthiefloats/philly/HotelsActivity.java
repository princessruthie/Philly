package com.ruthiefloats.philly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations_list);

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.hotel_1), getString(R.string.hotel_location_1)));
        locations.add(new Location(getString(R.string.hotel_2), getString(R.string.hotel_location_2)));
        locations.add(new Location(getString(R.string.hotel_3), getString(R.string.hotel_location_3)));
        locations.add(new Location(getString(R.string.hotel_4), getString(R.string.hotel_location_4)));
        locations.add(new Location(getString(R.string.hotel_5), getString(R.string.hotel_location_5)));
        locations.add(new Location(getString(R.string.hotel_6), getString(R.string.hotel_location_6)));
        locations.add(new Location(getString(R.string.hotel_7), getString(R.string.hotel_location_7)));
        locations.add(new Location(getString(R.string.hotel_8), getString(R.string.hotel_location_8)));
        locations.add(new Location(getString(R.string.hotel_9), getString(R.string.hotel_location_9)));
        locations.add(new Location(getString(R.string.hotel_10), getString(R.string.hotel_location_10)));
        locations.add(new Location(getString(R.string.hotel_11), getString(R.string.hotel_location_11)));
        locations.add(new Location(getString(R.string.hotel_12), getString(R.string.hotel_location_12)));
        locations.add(new Location(getString(R.string.hotel_13), getString(R.string.hotel_location_13)));

        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}