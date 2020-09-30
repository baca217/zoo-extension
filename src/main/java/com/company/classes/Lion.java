package com.company.classes;

//EXAMPLE OF ENCAPSULATION
public class Lion extends Feline {//extension is an example of polymorphism
    //name is an example of identity
    public Lion(String name) {
        super(name);
    }
    //all functions are examples of abstraction
    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the Lion Wakes up");
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + " the Lion makes a noise");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " the Lion "+this.eatBehavior);
    }

    @Override
    public void roam() {
        System.out.println(this.getName() + " the Lion roams around the cage");
    }
}
