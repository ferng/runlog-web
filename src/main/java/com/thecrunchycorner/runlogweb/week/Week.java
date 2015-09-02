package com.thecrunchycorner.runlogweb.week;

import java.time.LocalDate;
import java.util.ArrayList;

public class Week {
    int weekNo;
    LocalDate weekStart;
    ArrayList<Day> days;
    Totals runTotals;
    Totals cycleTotals;

    public int getWeekNo() {
        return weekNo;
    }

    public void setWeekNo(int weekNo) {
        this.weekNo = weekNo;
    }

    public LocalDate getWeekStart() {
        return weekStart;
    }

    public void setWeekStart(LocalDate weekStart) {
        this.weekStart = weekStart;
    }

    public ArrayList<Day> getDays() {
        return days;
    }

    public void setDays(ArrayList<Day> days) {
        this.days = days;
    }

    public Totals getRunTotals() {
        return runTotals;
    }

    public void setRunTotals(Totals runTotals) {
        this.runTotals = runTotals;
    }

    public Totals getCycleTotals() {
        return cycleTotals;
    }

    public void setCycleTotals(Totals cycleTotals) {
        this.cycleTotals = cycleTotals;
    }
}
