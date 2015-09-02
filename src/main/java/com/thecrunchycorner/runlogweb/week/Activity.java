package com.thecrunchycorner.runlogweb.week;

import java.time.LocalTime;
import java.util.ArrayList;

public class Activity {
    String activity;
    LocalTime hourr;
    String kit;
    String weather;
    String temp;
    String effort;
    Totals totals;
    ArrayList<Lap> laps;

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public LocalTime getHourr() {
        return hourr;
    }

    public void setHourr(LocalTime hourr) {
        this.hourr = hourr;
    }

    public String getKit() {
        return kit;
    }

    public void setKit(String kit) {
        this.kit = kit;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getEffort() {
        return effort;
    }

    public void setEffort(String effort) {
        this.effort = effort;
    }

    public Totals getTotals() {
        return totals;
    }

    public void setTotals(Totals totals) {
        this.totals = totals;
    }

    public ArrayList<Lap> getLaps() {
        return laps;
    }

    public void setLaps(ArrayList<Lap> laps) {
        this.laps = laps;
    }
}
