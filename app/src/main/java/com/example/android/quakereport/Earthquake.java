package com.example.android.quakereport;

/**
 * Created by eddie on 2016/11/4.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude(){return mMagnitude;}
    public String getLocation(){return mLocation;}
    public long getTimeInMilliseconds(){return mTimeInMilliseconds;}
    public String getUrl() { return mUrl;}
}
