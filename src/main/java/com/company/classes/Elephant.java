package com.company.classes;

//EXAMPLE OF ENCAPSULATION
public class Elephant extends Pachyderm{//extension is an example of polymorphism
    //all functions are examples of abstraction
    //name is an example of identity
    public Elephant(String name){super(name);}
    @Override
    protected void wakeUp() {
        System.out.println(this.getName() + " the elephant woke up");
    }
    @Override
    protected void makeNoise() { System.out.println(this.getName() + " the elephant makes a noise"); }
    @Override
    protected void eat() { System.out.println(this.getName() + " the elephant ate"); }
    @Override
    protected void sleep() {
        System.out.println(this.getName() + " the elephant went to sleep");
    }
}
