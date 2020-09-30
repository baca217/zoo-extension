package com.company.classes;

//EXAMPLE OF ENCAPSULATION
public class Wolf extends Canine{//extension is an example of polymorphism
    //name is an example of identity
    public Wolf(String name) {
        super(name);
    }
    //all functions are examples of abstraction
    @Override
    protected void wakeUp() {
        System.out.println(this.getName() + " the Wolf Wakes up");
    }

    @Override
    protected void makeNoise() {
        System.out.println(this.getName() + " the Wolf makes a noise");
    }

    @Override
    protected void eat() {
        System.out.println(this.getName() + " the Wolf "+this.eatBehavior.eatFood());
    }

    @Override
    protected void roam() {
        System.out.println(this.getName() + " the Wolf roams around the cage");
    }

    @Override
    protected void sleep() {
        System.out.println(this.getName() + " the Wolf sleeps in the cage");
    }
}
