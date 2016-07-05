package com.ruthiefloats.philly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fieldsru on 7/3/16.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
    }

    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_layout, parent, false);
        }
        Location currentLocation = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        titleTextView.setText(currentLocation.getTitle());
        addressTextView.setText(currentLocation.getAddress());

        if (currentLocation.hasImage()){
            imageView.setImageResource(currentLocation.getImageResouørceId());
            imageView.setVisibility((View.VISIBLE));
        } else{
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
