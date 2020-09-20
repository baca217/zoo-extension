package com.company.classes;

import java.util.ArrayList;
import java.util.List;

public class ZooClock {
    //new variable, people who will watch this employee
    private List<ZooEmployee> employees = new ArrayList<>();
    private int hour;
    private boolean am;

    public void startDay()
    {
        am = true;
        hour = 8;
        while(am && hour != 8)
        {

        }
    }
}
