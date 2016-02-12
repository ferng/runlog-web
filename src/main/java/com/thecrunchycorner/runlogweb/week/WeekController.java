package com.thecrunchycorner.runlogweb.week;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes({"laps"})
public class WeekController {

    @Autowired
    private TotalsDao totalsDao;


    @RequestMapping(value="/totals")
    public String myTotals(Model model) {
        List<Totals> listTotals = totalsDao.getTotals();
        model.addAttribute("myTotals", listTotals);
        return "totals";
    }

    @RequestMapping(value="/edit")
    public String editTotals(Model model) {
        Totals total = new Totals();
        total.setDistance(23);
        
        model.addAttribute("total", total);
        return "enterTotals";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("total") Totals total) {

        totalsDao.saveOrUpdate(total);
        return "totals";
    }



    private Activity activity = new Activity();

    @RequestMapping("/hello")
    public String setupForm(Model model)
    {
        ArrayList<Lap> laps = new ArrayList<>();







        Lap lap = new Lap();

        Totals totals = new Totals();

        totals.setDistance(10);

//        FormattedDuration totTime = new FormattedDuration(0, 0, 24);
        Duration totTime = Duration.ofSeconds(23);
        totals.setTime(totTime);

        totals.setMph((float) 2.4);

        Duration minPerMile = Duration.ofSeconds(40);
        totals.setMinPerMile(minPerMile);

        totals.setDistUnit("mile");

        lap.setTotals(totals);



        Lap lap2 = new Lap();

        Totals totals2 = new Totals();

        totals2.setDistance(3);

        Duration totTime2 = Duration.ofSeconds(52);
        totals2.setTime(totTime2);

        totals2.setMph((float) 2.4);

        Duration minPerMile2 = Duration.ofSeconds(34);
        totals2.setMinPerMile(minPerMile2);

        totals2.setDistUnit("inch");

        lap2.setTotals(totals2);



        Lap lap3 = new Lap();

        Totals totals3 = new Totals();

        totals3.setDistance(21);

        Duration totTime3 = Duration.ofSeconds(23);
        totals3.setTime(totTime3);

        totals3.setMph((float) 6.2);

        Duration minPerMile3 = Duration.ofSeconds(56);
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


