package com.company.classes;

import java.beans.PropertyChangeEvent;

public class ZooFoodServer extends ZooEmployee{
    public ZooFoodServer(String newName) {
        super(newName);
    }

    public void propertyChange(PropertyChangeEvent evt)
    {
        switch(evt.getPropertyName())
        {
            case "hour":
                int hour = (int) evt.getNewValue();
                switch (hour) {
                    case 8:
                        System.out.println(name +" the " +getType() + " has arrived for day "+curDay);
                        break;
                    case 10:
                        System.out.println(name +" the " +getType() + " started to prepare lunch");
                        break;
                    case 12:
                        support.firePropertyChange("task", "",
                                name + " the " + getType() + " will now serve lunch");
                        System.out.println(name + " the " + getType() + " has served lunch");
                        break;
                    case 18:
                    case 15:
                        System.out.println(name +" the " +getType() + " is now cleaning");
                        break;
                    case 16:
                        System.out.println(name +" the " +getType() + " started to prepare dinner");
                        break;
                    case 17:
                        support.firePropertyChange("task", "",
                                name + " the " + getType() + " will now serve dinner");
                        System.out.println(name + " the " + getType() + " has served dinner");
                        break;
                    case 20:
                        System.out.println(name +" the " +getType() + " has left for day "+curDay);
                        break;
                }
                break;
            case "day":
                curDay = (int) evt.getNewValue();
                break;
            default:
                System.out.println(evt.getPropertyName());
        }

    }
}
