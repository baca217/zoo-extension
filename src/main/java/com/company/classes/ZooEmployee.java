package com.company.classes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

//EXAMPLE OF ENCAPSULATION
abstract class ZooEmployee  implements PropertyChangeListener{
    //new variable, people who will watch this employee
    protected PropertyChangeSupport support = new PropertyChangeSupport(this);
    //name is an example of identity
    protected String name;
    //HW2 keep track of current day
    protected int curDay;

    //function is an example of abstraction
    public ZooEmployee(String newName){this.name = newName;}

    //function is an example of abstraction
    public String getName(){ return this.name;}
    //function is an example of abstraction
    public void setName(String newName){this.name = newName;}
    public String getType(){return this.getClass().getSimpleName();}

    //new method
    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }
    //new method
    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
}
