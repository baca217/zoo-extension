package com.company.classes;

import java.util.Random;

public class Feline extends Animal {
    //STRATEGY PATTERN OCCURING HERE
    public Feline(String name){super(name, new munchFood());}
    @Override
    protected void sleep() {
        Random rand = new Random();
        int probability = rand.nextInt(9);

        if(probability < 3) {
            this.makeNoise();
        }

        if(probability >= 3 && probability < 6 ) {
            this.roam();
        }

        if(probability >= 6) {
            System.out.println(getName()+" the "+getType()+" went to sleep.");
        }
    }

    @Override
    protected void roam(){}
}
