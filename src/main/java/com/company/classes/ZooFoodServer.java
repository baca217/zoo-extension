package com.company.classes;

import java.beans.PropertyChangeEvent;

public class ZooFoodServer extends ZooEmployee{
    public ZooFoodServer(String newName) {
        super(newName);
    }

    @Override
    void uniform() {

    }

    public void propertyChange(PropertyChangeEvent evt)
    {
        switch(evt.getPropertyName())
        {
            case "hour":
                int hour = (int) evt.getNewValue();
                switch (hour) {
                    case 8:
                        support.firePropertyChange("arrived", "",
                                name +" the " +getType() + " has arrived");
                        break;

                    case 15:
                        support.firePropertyChange("cleaning", "",
                                name +" the " +getType() + " is now cleaning");
                        break;
                    case 13:
                    case 17:
                        support.firePropertyChange("foodServed", "",
                                name + " the " + getType() + " has served food");
                        break;

                    case 20:
                        support.firePropertyChange("atZoo", "",
                                name + " the " + getType() + " has left");
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
