package com.company.classes;

//EXAMPLE OF ENCAPSULATION
public class Wombat extends Marsupial{//extension is an example of polymorphism
    //name is an example of identity
    public Wombat(String newName){super(newName);}
    //all functions are examples of abstraction
    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " the "+this.getType()+" woke up");
    }
    @Override
    public void makeNoise() { System.out.println(this.getName() + " the "+this.getType()+" makes a noise"); }
    @Override
    public void eat() { System.out.println(this.getName() + " the "+this.getType()+" "+this.eatBehavior.eatFood()); }
    @Override
    public void roam() {System.out.println(this.getName() + " the "+this.getType()+" decided to roam around");}
    @Override
    public void sleep() { System.out.println(this.getName() + " the "+this.getType()+" went to sleep");}
}
