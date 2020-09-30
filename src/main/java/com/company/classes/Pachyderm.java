package com.company.classes;

import java.util.Random;

//EXAMPLE OF ENCAPSULATION
public class Pachyderm  extends Animal { //extension is an example of polymorphism
    //all functions are examples of abstraction
    //name is an example of identity
    public Pachyderm(String name){super(name, new swallowFood());}
    @Override
    protected void roam(){
        Random rand = new Random();
        int probability = rand.nextInt(100);

        if(probability < 25){
            System.out.println(this.getName()+" the "+this.getType()+" decided to charge rather than roam");
        }
        else{
            System.out.println(this.getName()+" the "+this.getType()+" decided to roam around");
        }
    }
    @Override
    protected void sleep(){}
}
