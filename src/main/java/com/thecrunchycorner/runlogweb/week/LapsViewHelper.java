package com.thecrunchycorner.runlogweb.week;

import java.util.*;

public class LapsViewHelper {

    public static ArrayList listToListOfLists(int maxListWidth, ArrayList<Lap> sourceList) {
        ArrayList<ArrayList> list = new ArrayList<>();
        ArrayList<Lap> subList = new ArrayList<>();
        int currWidth = 0;

        for(Lap lap : sourceList) {

            if (currWidth == maxListWidth) {
                list.add(subList);
                subList = new ArrayList<>();
                currWidth = 0;
            } else {
                currWidth++;
            }
            subList.add(lap);
        }
        return list;
    }
}
