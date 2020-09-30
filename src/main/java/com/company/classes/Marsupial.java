package com.company.classes;

public class Marsupial extends Animal{
    //STRATEGY PATTERN OCCURING HERE
    public Marsupial(String newName)
    {
        super(newName, new munchFood());
    }
    @Override
    protected void roam(){}
    @Override
    protected void sleep(){}
}
