package com.company.classes;

import java.util.List;

public class ZooKeeper extends ZooEmployee{
    public ZooKeeper(String Name){super(Name);}

    public void doDailyWork(int days, List<Animal> animals){ //argument List<Animal> shows polymorphism
        int i;
        for(i = 1; i < days+1; i++) {
            System.out.println("Zookeeper " + this.getName() + " arrived for day " + i + ".");
            uniform();//all functions below are abstraction
            wakeAnimals(animals);
            roleCallAnimals(animals);
            feedAnimals(animals);
            exerciseAnimals(animals);
            sleepAnimals(animals);
            System.out.println("Zookeeper " + this.getName() + " has left for day " + i + ".\n");
        }
    }
    @Override
    public void uniform(){
        System.out.println("Zookeeper "+this.getName()+" put on their uniform");
    }

    private void wakeAnimals(List<Animal> animals){ //arguments are polymorphism
        int i;
        for(i = 0; i < animals.size(); i++){
            System.out.println("Zookeeper "+this.getName()+" tried to wake up "+animals.get(i).getName()+" the "+animals.get(i).getType());
            animals.get(i).wakeUp();
        }
    }

    private void roleCallAnimals(List<Animal> animals){ //arguments are polymorphism
        int i;
        for(i = 0; i < animals.size(); i++){
            System.out.println("Zookeeper "+this.getName()+" tried to role call "+animals.get(i).getName()+" the "+animals.get(i).getType());
            animals.get(i).makeNoise();
        }
    }

    private void feedAnimals(List<Animal> animals){ //arguments are polymorphism
        int i;
        for(i = 0; i < animals.size(); i++){
            System.out.println("Zookeeper "+this.getName()+" tried to feed "+animals.get(i).getName()+" the "+animals.get(i).getType());
            animals.get(i).eat();
        }
    }

    private void exerciseAnimals(List<Animal> animals){ //arguments are polymorphism
        int i;
        for(i = 0; i < animals.size(); i++){
            System.out.println("Zookeeper "+this.getName()+" tried to exercise "+animals.get(i).getName()+" the "+animals.get(i).getType());
            animals.get(i).roam();
        }
    }

    private void sleepAnimals(List<Animal> animals){ //arguments are polymorphism
        int i;
        for(i = 0; i < animals.size(); i++){
            System.out.println("Zookeeper "+this.getName()+" tells "+animals.get(i).getName()+" the "+animals.get(i).getType() + " to sleep.");
            animals.get(i).sleep();
        }
    }
}
