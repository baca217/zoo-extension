package com.company.classes;

//EXAMPLE OF ENCAPSULATION
public class Hippo extends Pachyderm {//extension is an example of polymorphism
    //all functions are examples of abstraction
    //name is an example of identity
    public Hippo(String name){super(name);}
    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the hippo woke up");
    }
    @Override
    public void makeNoise() { System.out.println(this.getName() + " the hippo makes a noise"); }
    @Override
    public void eat() { System.out.println(this.getName() + " the hippo "+this.eatBehavior.eatFood()); }
    @Override
    public void sleep() {
        System.out.println(this.getName() + " the hippo went to sleep");
    }
}
