package com.company.classes;

//EXAMPLE OF ENCAPSULATION
public class Marsupial extends Animal{//extension is an example of polymorphism
    //all functions are examples of abstraction
    //name is an example of identity
    public Marsupial(String newName)
    {
        super(newName);
    }
    @Override
    protected void roam(){}
    @Override
    protected void sleep(){}
}
