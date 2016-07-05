package com.ruthiefloats.philly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations_list);

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.historical_1), getString(R.string.historical_1_address)));
        locations.add(new Location(getString(R.string.historical_2),getString(R.string.historical_2_address)));
        locations.add(new Location(getString(R.string.historical_3),getString(R.string.historical_3_address)));
        locations.add(new Location(getString(R.string.historical_4),getString(R.string.historical_4_address)));
        locations.add(new Location(getString(R.string.historical_5),getString(R.string.historical_5_address)));
        locations.add(new Location(getString(R.string.historical_6),getString(R.string.historical_6_address)));
        locations.add(new Location(getString(R.string.historical_7),getString(R.string.historical_7_address)));

        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
