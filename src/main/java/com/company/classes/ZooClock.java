package com.company.classes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class ZooClock {
    private int hour;
    private int days;
    private PropertyChangeSupport support;

    public ZooClock()
    {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl)
    {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl)
    {
        support.removePropertyChangeListener(pcl);
    }

    public void doWorkDays()
    {
        hour = 0;
        int curDay = 0;
        while(curDay <= days)
        {
            if(this.hour == 0)
            {
                support.firePropertyChange("day", curDay, curDay+1);
                curDay++;
                if(curDay > days)
                {
                    break;
                }
                System.out.println("\nZooClock: we are on day "+curDay);
                System.out.println("ZooClock: we are on hour "+hour);
                support.firePropertyChange("hour", 23, this.hour);
            }
            else {
                System.out.println("ZooClock: we are on hour "+hour);
                if(hour == 8)
                {
                    System.out.println("The zoo is now open!");
                }
                if(hour == 20)
                {
                    System.out.println("The zoo is now closed!");
                }
                support.firePropertyChange("hour", this.hour-1, this.hour);
            }
            this.hour++;
            this.hour %= 24;
        }
    }

    public void setWorkDays(int numDays)
    {
        days = numDays;
    }
}
