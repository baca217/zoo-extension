package com.company.classes;

import java.util.ArrayList;
import java.util.List;

//EXAMPLE OF ENCAPSULATION
abstract class ZooEmployee {
    //new variable, people who will watch this employee
    private List<ZooAnnouncer> announcers = new ArrayList<>();
    //name is an example of identity
    private String name;

    //function is an example of abstraction
    public ZooEmployee(String newName){this.name = newName;}

    abstract void uniform();

    abstract void doDailyWork(int day, List<Animal> animals);

    //function is an example of abstraction
    public String getName(){ return this.name;}
    //function is an example of abstraction
    public void setName(String newName){this.name = newName;}
    public String getType(){return this.getClass().getSimpleName();}

    //new method
    public void addAnnouncer(ZooAnnouncer employee)
    {
        this.announcers.add(employee);
    }
    //new method
    public void removeAnnouncer(ZooAnnouncer employee)
    {
        this.announcers.remove(employee);
    }
    //new method
    public void updateAnnouncer(String Action)
    {
        int i;
        for(i = 0; i < announcers.size(); i++)
        {
            announcers.get(i).announce(this, Action);
        }
    }
}
