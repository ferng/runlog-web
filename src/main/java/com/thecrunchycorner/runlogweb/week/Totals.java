package com.thecrunchycorner.runlogweb.week;

public class Totals {
    private int distance;
    private FormattedDuration time;
    private float mph;
    private FormattedDuration minPerMile;
    private String distUnit;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public FormattedDuration getTime() {
        return time;
    }

    public void setTime(FormattedDuration time) {
        this.time = time;
    }

    public float getMph() {
        return mph;
    }

    public void setMph(float mph) {
        this.mph = mph;
    }

    public FormattedDuration getMinPerMile() {
        return minPerMile;
    }

    public void setMinPerMile(FormattedDuration minPerMile) {
        this.minPerMile = minPerMile;
    }

    public String getDistUnit() {
        return distUnit;
    }

    public void setDistUnit(String distUnit) {
        this.distUnit = distUnit;
    }
}
