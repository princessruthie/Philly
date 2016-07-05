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

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("The Liberty Bell", "123 Broad Street"));
        locations.add(new Location("Rocky Statue","4422 Chestnut Ave"));
        locations.add(new Location("The Love Sculpture","8000 Walnut Street"));
        locations.add(new Location("City Hall","1 Freedom Terrace"));
        locations.add(new Location("The Art Museum","625 Independence Mall"));
        locations.add(new Location("The Mutter Museum","1401 Hillbrand Ave"));
        locations.add(new Location("South Street","225 S. Street"));

        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
