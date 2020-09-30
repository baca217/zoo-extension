package com.company.classes;

//EXAMPLE OF ENCAPSULATION
public class Rhino extends Pachyderm{//extension is an example of polymorphism
    //name is an example of identity
    public Rhino(String name){super(name);}
    //all functions are examples of abstraction
    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the rhino woke up");
    }
    @Override
    public void makeNoise() { System.out.println(this.getName() + " the rhino makes a noise"); }
    @Override
    public void eat() { System.out.println(this.getName() + " the rhino "+this.eatBehavior.eatFood()); }
    @Override
    public void sleep() {
        System.out.println(this.getName() + " the rhino went to sleep");
    }
}
