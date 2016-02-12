package com.thecrunchycorner.runlogweb.week;

import java.util.List;

public interface TotalsDao {
    enum UpdateStatus {SAVED, UPDATED, ERROR};

    List<Totals> getTotals();

    void saveOrUpdate(Totals totals);
}
