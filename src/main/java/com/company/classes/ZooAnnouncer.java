package com.company.classes;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ZooAnnouncer extends ZooEmployee {
    public ZooAnnouncer(String newName){super(newName);}
    public void uniform(){System.out.println(getName()+" puts on their Zoo Announcer uniform.");}

    @Override
    public void propertyChange(PropertyChangeEvent evt)
    {
        switch (evt.getPropertyName())
        {
            //OBSERVER PATTERN HERE for any task for employees that Zoo Announcer is watching
            case "task":
                System.out.println("Hi, this is "+this.getType()+" "+this.name+". "+evt.getNewValue());
                break;
            case "day":
                curDay = (int)evt.getNewValue();
            case "hour":
                switch ((int)evt.getNewValue())
                {
                    case 8:
                        System.out.println(this.getType()+" "+this.name+" has arrived for day "+curDay);
                        break;
                    case 20:
                        System.out.println(this.getType()+" "+this.name+" has left for day "+curDay);
                        break;
                }
        }
    }
}
