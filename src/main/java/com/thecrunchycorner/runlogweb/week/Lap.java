package com.thecrunchycorner.runlogweb.week;

import java.io.Serializable;

public class Lap implements Serializable {
    Totals totals;

    public Totals getTotals() {
        return totals;
    }

    public void setTotals(Totals totals) {
        this.totals = totals;
    }
}