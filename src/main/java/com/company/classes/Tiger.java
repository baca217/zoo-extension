package com.company.classes;

//EXAMPLE OF ENCAPSULATION
public class Tiger extends Feline {//extension is an example of polymorphism
    //name is an example of identity
    public Tiger(String name) {
        super(name);
    }
    //all functions are examples of abstraction
    @Override
    protected void wakeUp() {
        System.out.println(this.getName() + " the Tiger Wakes up");
    }

    @Override
    protected void makeNoise() {
        System.out.println(this.getName() + " the Tiger makes a noise");
    }

    @Override
    protected void eat() {
        System.out.println(this.getName() + " the Tiger eats something tasty");
    }

    @Override
    protected void roam() {
        System.out.println(this.getName() + " the Tiger roams around the cage");
    }
}
