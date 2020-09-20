package com.company.classes;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

public class ZooAnnouncer extends ZooEmployee implements PropertyChangeListener {
    public ZooAnnouncer(String newName){super(newName);}
    public void uniform(){System.out.println(getName()+" puts on their Zoo Announcer uniform.");}
    public void doDailyWork(int day, List<Animal> animals)
    {
        System.out.println("Zoo Announcer "+this.getName()+" arrived for the day");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt)
    {
           if(evt.getPropertyName().equals("task"))
           {
               System.out.println("Hi, this is "+this.getType()+" "+this.name+". "+evt.getNewValue());
           }
    }
}
