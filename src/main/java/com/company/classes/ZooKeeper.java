package com.company.classes;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//EXAMPLE OF ENCAPSULATION
public class ZooKeeper extends ZooEmployee implements PropertyChangeListener {//extension is an example of polymorphism
    //time task pairs
    private static AbstractMap<Integer, List<String>> timeToTasks;
    //HW2 keep track of animals
    List<Animal> zooAnimals;
    //name is an example of identity
    public ZooKeeper(String Name)
    {
        super(Name);
        timeToTasks = new HashMap<>();
        timeToTasks.put(8, Arrays.asList("arrived at work", "none"));
        timeToTasks.put(9, Arrays.asList("will now wake the animals", "wake up"));
        timeToTasks.put(10, Arrays.asList("will now roll call the animals", "roll call"));
        timeToTasks.put(12, Arrays.asList("will now feed the animals", "feed"));
        timeToTasks.put(15, Arrays.asList("will now exercise the animals", "exercise"));
        timeToTasks.put(17, Arrays.asList("will now tell the animals to sleep", "sleep"));
        timeToTasks.put(20, Arrays.asList("arrived at work", "none"));
    }

    public void propertyChange(PropertyChangeEvent evt)
    {
        switch(evt.getPropertyName())
        {
            case "hour":
                doTask((int) evt.getNewValue());
                break;
            case "day":
                curDay = (int) evt.getNewValue();
                break;
            default:
                System.out.println(evt.getPropertyName());
        }
    }

    private void doTask(int time)
    {
        //getting task the zookeeper is doing
        if(timeToTasks.containsKey(time)) {
            List<String> task = timeToTasks.get(time);
            String printTask = task.get(0);
            String sendTask = task.get(1);
            int i;
            if (sendTask.equals("none")) {
                System.out.println("Zookeeper " + name+" "+ printTask + " for day " + curDay);
            }
            else {
                String temp = "Zookeeper " + name+" "+ printTask;
                support.firePropertyChange("task", "none", temp);
                System.out.println(temp);
                for (i = zooAnimals.size(); i > 0; i--) {
                    System.out.println("Zookeeper "+name+" tried to "+sendTask+" "+zooAnimals.get(i-1).getTitle());
                    zooAnimals.get(i - 1).doCommand(sendTask);
                }
            }
        }
    }

    //function is an example of abstraction
    public void setZooList(List<Animal> animals){ //argument List<Animal> shows polymorphism
        zooAnimals = animals;
    }
    @Override
    public void uniform(){
        System.out.println("Zookeeper "+this.getName()+" put on their uniform");
    }

    public void update(String property, Object oldVal, Object newVal){}
}
