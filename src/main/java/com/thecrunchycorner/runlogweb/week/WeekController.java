package com.thecrunchycorner.runlogweb.week;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@SessionAttributes({"laps"})
public class WeekController {

    private Activity activity = new Activity();

    @RequestMapping("/hello")
    public String setupForm(Model model)
    {
        ArrayList<Lap> laps = new ArrayList<>();

        Lap lap = new Lap();

        Totals totals = new Totals();

        totals.setDistance(10);

        FormattedDuration totTime = new FormattedDuration(0, 0, 24);
        totals.setTime(totTime);

        totals.setMph((float) 2.4);

        FormattedDuration minPerMile = new FormattedDuration(0, 0, 40);
        totals.setMinPerMile(minPerMile);

        totals.setDistUnit("mile");

        lap.setTotals(totals);



        Lap lap2 = new Lap();

        Totals totals2 = new Totals();

        totals2.setDistance(3);

        FormattedDuration totTime2 = new FormattedDuration(0, 0, 52);
        totals2.setTime(totTime2);

        totals2.setMph((float) 2.4);

        FormattedDuration minPerMile2 = new FormattedDuration(0, 0, 40);
        totals2.setMinPerMile(minPerMile2);

        totals2.setDistUnit("inch");

        lap2.setTotals(totals2);



        Lap lap3 = new Lap();

        Totals totals3 = new Totals();

        totals3.setDistance(21);

        FormattedDuration totTime3 = new FormattedDuration(0, 1, 37);
        totals3.setTime(totTime3);

        totals3.setMph((float) 6.2);

        FormattedDuration minPerMile3 = new FormattedDuration(0, 0, 23);
        totals3.setMinPerMile(minPerMile3);

        totals3.setDistUnit("yard");

        lap3.setTotals(totals3);

        laps.add(lap);
        laps.add(lap2);
        laps.add(lap3);
        activity.setLaps(laps);

        model.addAttribute("laps", laps);
        ArrayList<ArrayList<Lap>> groupedLaps = new ArrayList<>();
        groupedLaps= LapsViewHelper.listToListOfLists(2, laps);

        model.addAttribute("groupedLaps", groupedLaps);
        return "hello";


    }

}


