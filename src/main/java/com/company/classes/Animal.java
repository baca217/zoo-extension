package com.company.classes;

import java.util.Scanner;

public abstract class Animal {
    protected IEatType eatBehavior;
    protected String name;

    public Animal(String newName, IEatType newEatBehavior)
    {
        this.eatBehavior = newEatBehavior;
        String type = this.getClass().getSimpleName().toLowerCase();
        char firstChar = type.charAt(0);
        Scanner scan = new Scanner(System.in);
        while(firstChar != newName.toLowerCase().charAt(0))
        {
            System.out.println("Please enter a name that begins with "+firstChar+" for animal "+type+".");
            newName = scan.nextLine();
        }
        this.name = newName;
    }

    public void doCommand(String command)
    {
        switch(command)
        {
            case "wake up":
                this.wakeUp();
                break;
            case"roll call":
                this.makeNoise();
                break;
            case "feed":
                this.eat();
                break;
            case "exercise":
                this.roam();
                break;
            case "sleep":
                this.sleep();
                break;
        }
    }

    protected void wakeUp() {
        System.out.println("Default Wake up");
    }
    protected void makeNoise() { System.out.println("Default Make Noise"); }
    protected void eat() { System.out.println("Default Eat"); }
    protected abstract void roam();
    protected abstract void sleep();
    public String getName(){return this.name;}
    public void setName(String newName){name = newName; }
    public String getType(){return this.getClass().getSimpleName();}
    public String getTitle(){return name+" the "+this.getClass().getSimpleName();}
}