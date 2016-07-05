package com.ruthiefloats.philly;

/**
 * Created by fieldsru on 7/3/16.
 */
public class Location {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mTitle;
    private String mAddress;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public String getTitle() {
        return mTitle;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public Location(String title, String address) {
        mTitle = title;
        mAddress = address;
    }

    public Location(String title, String address, int imageResourceId) {
        mTitle = title;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}