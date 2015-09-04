package com.thecrunchycorner.runlogweb.week;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeekController {

    @RequestMapping("/hello")
    public String setupForm(Model model)
    {
        return "hello";
//        return new ModelAndView("hello", "message", "BLAH BLAH");
    }

}


