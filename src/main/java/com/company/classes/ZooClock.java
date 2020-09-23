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
        while(days > 0)
        {
            if(this.hour == 0)
            {
                support.firePropertyChange("day", this.days, this.days-1);
                this.days--;
                support.firePropertyChange("hour", 23, this.hour);
            }
            else {
                support.firePropertyChange("hour", this.hour-1, this.hour);
            }
            this.hour++;
            this.hour %= 24;
        }
    }

    public void setWorkDays(int numDays)
    {
        days = numDays + 1;
    }
}
