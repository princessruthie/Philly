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
        locations.add(new Location("The Doubletree", "237 S. Broad Street"));
        locations.add(new Location("Sheraton Philadelphia", "201 N. 17th Street"));
        locations.add(new Location("Sonesta Philadelphia", "1800 Market Street"));
        locations.add(new Location("Embassy Suites", "9000 Bartram Ave."));
        locations.add(new Location("Microtel Inn", "8840 Tinicum Blvd."));
        locations.add(new Location("The TripleTree", "4509 Island Ave."));
        locations.add(new Location("Sheraton East", "1 Dock Street"));
        locations.add(new Location("Penn's View Hotel", "14 N. Front Street"));
        locations.add(new Location("Hyatt", "200 South Broad Street"));
        locations.add(new Location("Radisson Blu Warwick", "1 Warwick Place"));
        locations.add(new Location("Sofitel Philadelphia", "1023 Cherry Street"));
        locations.add(new Location("Loews Philadelphia Hotel", "2200 Market Street"));
        locations.add(new Location("Hampton Inn", "922 Vine Street"));

        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
