package com.company.classes;

import java.util.List;

public class ZooAnnouncer extends ZooEmployee{
    public ZooAnnouncer(String newName){super(newName);}
    public void uniform(){System.out.println(getName()+" puts on their Zoo Announcer uniform.");}
    public void doDailyWork(int day, List<Animal> animals)
    {
        System.out.println("Zoo Announcer "+this.getName()+" arrived for the day");
    }

    public void announce(ZooEmployee fellowEmployee, String Action)
    {
        System.out.println("Hi, this is Zoo Announcer "
                +this.getName()+". "+fellowEmployee.getName()+" the "+fellowEmployee.getType()
                +" is about to "+Action+"!");
    }
}
