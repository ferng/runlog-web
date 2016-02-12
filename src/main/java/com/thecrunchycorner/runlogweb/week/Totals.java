package com.thecrunchycorner.runlogweb.week;

import java.io.Serializable;
import java.time.Duration;

import javax.persistence.*;

@Entity
@Table(name="Totals")
public class Totals implements Serializable {
    private int id;
    private int distance;
    private Duration time;
    private float mph;
    private Duration minPerMile;
    private String distUnit;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getDistUnit() {
        return distUnit;
    }

    public void setDistUnit(String distUnit) {
        this.distUnit = distUnit;
    }
}
