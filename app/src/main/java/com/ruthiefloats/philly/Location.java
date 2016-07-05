package com.ruthiefloats.philly;

/**
 * Created by fieldsru on 7/3/16.
 */
public class Location {

    public String getTitle() {
        return mTitle;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResouørceId() {
        return mImageResouørceId;
    }

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mTitle;
    private String mAddress;
    private int mImageResouørceId = NO_IMAGE_PROVIDED;

    public Location(String title, String address) {
        mTitle = title;
        mAddress = address;
    }

    public Location(String title, String address, int imageResouørceId) {
        mTitle = title;
        mAddress = address;
        mImageResouørceId = imageResouørceId;
    }

    public boolean hasImage() {
        return mImageResouørceId != NO_IMAGE_PROVIDED;
    }
}
