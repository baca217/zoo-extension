package com.company.classes;

import java.util.Random;

//EXAMPLE OF ENCAPSULATION
public class Dog extends Canine{//extension is an example of polymorphism
    //all functions are examples of abstraction
    //name is an example of identity
    public Dog(String name) {
        super(name);
    }

    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the Wolf Wakes up");
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + " the Wolf makes a noise");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " the Wolf "+this.eatBehavior);
    }

    @Override
    public void roam() {
        Random rand = new Random();
        int probability = rand.nextInt(100);
        if(probability > 25) {
            System.out.println(this.getName() + " the Wolf dig around the cage");
        } else {
            System.out.println(this.getName() + " the Wolf roams around the cage");
        }

    }

    @Override
    protected  void sleep() {
        System.out.println(this.getName() + " the Wolf sleeps in the cage");
    }
}
