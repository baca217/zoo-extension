package com.company.classes;

import java.util.Random;

public class Pachyderm  extends Animal {
    //STRATEGY PATTERN OCCURING HERE
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
