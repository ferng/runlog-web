package com.thecrunchycorner.runlogweb.week;

import java.time.Duration;

public class Totals {
    private int distance;
    private Duration time;
    private float mph;
    private Duration minPerMile;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Duration getTime() {
        return time;
    }

    public void setTime(Duration time) {
        this.time = time;
    }

    public float getMph() {
        return mph;
    }

    public void setMph(float mph) {
        this.mph = mph;
    }

    public Duration getMinPerMile() {
        return minPerMile;
    }

    public void setMinPerMile(Duration minPerMile) {
        this.minPerMile = minPerMile;
    }
}
