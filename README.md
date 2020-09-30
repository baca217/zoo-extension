Object-Oriented Project 1 Zoo  
By: Elmer Baca Holguin and Timothy Euken
=======================
This project is meant to show understanding of object oriented concepts.
The main point of this project is to show an understanding of the observer pattern, strategy pattern, and UML diagrams. The obersever pattern is shown by the ZooAnnouncer, ZooKeeper, and ZooFoodEmployee classes who all watch the ZooClock class. ZooAnnouncer also watches the ZooKeeper and ZooFoodEmployee classes. UML diagrams can be found under folder UML Diagrams.
How to use?
------------------
Main function class can be found under  
zookeeper-homework1\src\main\java\com\ZookeeperHomework1Application  
By running the main function the program will ask for a number of days for which the ZooEmployees  
will do their tasks for. That's the only input the program needs. 
All object files can be found under zookeeper-homework1\src\main\java\com\company\classes

Assumptions
------------------
We only created two animal objects, since the output screen becomes really jumbled with more animals that we add. The two animals are a kangaroo and elephant who eat there food differently than one another. Kangaroo munches on their food while elephants eat their food whole. We also assumed that the ZooAnnouncer is told about tasks as they occur, so he announces them as they are done.

Finding Homework Requirements
------------------
-The animal strategy pattern can be found in the "Animal" superclass. It's how the animals eat and it's handled by the constructor. Actual usage can be found in the Marsupial, Pachyderm, Canine, and Feline classes.
-The new ZooAnnouncer class can be found under the folder zoo-extension\src\main\java\com\company\classes. Their observe patterns can be seen with the property change method. They announce all tasks related by animals, done by the ZooKeeper, and also when dinner or lunch is served by the ZooFoodEmployee
-ZooClock can also be found under folder zoo-extension\src\main\java\com\company\classes which is observed by all ZooEmployees. ZooClock is used to keep track of the hours and the days.
-ZooFoodEmployee can be found under folder zoo-extension\src\main\java\com\company\classes which is observed by the ZooAnnouncer. They have there own schedule they follow.
-All UML diagrams can be found under zoo-extension\UML Diagrams\
