package com.company.classes;

abstract public class Canine extends Animal{
    //STRATEGY PATTERN OCCURING HERE
    public Canine(String name){super(name, new swallowFood());}
}
