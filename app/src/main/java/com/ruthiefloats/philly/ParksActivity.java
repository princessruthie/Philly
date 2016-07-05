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

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("FDR Park","22 Hamstead Street", R.drawable.park1));
        locations.add(new Location("Washington Square Park","801 Chestnut", R.drawable.park2));
        locations.add(new Location("Clark Park","5606 Market Street", R.drawable.park3));
        locations.add(new Location("The Penn Greens","42 Penn Lane", R.drawable.park4));
        locations.add(new Location("The Penitentiary","1602 16th Street", R.drawable.park5));
        locations.add(new Location("Wissahickon Park","1 Wissahickon Parkway", R.drawable.park6));
        locations.add(new Location("Smith Memorial Playground","903 Catherine Street", R.drawable.park7));
        locations.add(new Location("Moore's Arboretum","82 Missanily Street", R.drawable.park8));
        locations.add(new Location("Rittenhouse Square","999 Vine Street", R.drawable.park9));

        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
