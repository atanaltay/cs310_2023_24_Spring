package main;

import model.Animal;
import model.Cat;
import model.Chef;
import model.Chicken;
import model.Dog;
import model.Eatable;
import model.HouseCat;
import model.Lion;
import model.Turkey;
import model.ZooKeeper;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		/*
		Animal animal = new Animal("", "", "");
		
		
		Dog dog1 = new Dog("Bobo","house","brown","Kangal","ball");
		
		
		//System.out.println(dog1.getName());
		//System.out.println(dog1.getFavToy());
		
		
		Lion lion1 = new Lion("henry", "Africa", "Yellow", "Lamp", "Africa");
		
		
		animal.makeSound();
		dog1.makeSound();
		lion1.makeSound();
		
		*/
		
		//Dog is an Animal
		Animal dog2 = new Dog("Bobo","house","brown","Kangal","ball");
		Animal houseCat1 = new HouseCat("felix", "", "", "", "");
		Animal lion2 = new Lion("felix", "", "", "", "");
		Cat lion3 = new Lion("felix", "", "", "", "");
		
		dog2.makeSound();
		
		
		houseCat1.makeSound();
		lion2.makeSound();
		
		ZooKeeper zooKeeper = new ZooKeeper();
		zooKeeper.feedAnAnimal(dog2);
		zooKeeper.feedAnAnimal(lion3);
		zooKeeper.feedAnAnimal(houseCat1);
		
		Dog dog5 = new Dog("", "", "", "", "");
		
		zooKeeper.feedAnAnimal(dog5);
		
		//Cannot instabtiate abstract classes
		//Animal anim1 = new Animal();
		//Cat cat = new Cat();
		
		Chicken chicken = new Chicken("", "","");
		
		zooKeeper.feedAnAnimal(chicken);
		
		
		// Turkey is an eatable and animal
		//Chicken is an eatable and animal
		
		
		Chicken chikcen1 = new Chicken("", "", "");
		Turkey turkey1 = new Turkey("", "","");
		
		
		System.out.println("----------------------------");
		Chef chef = new Chef();
		
		chef.cookAnAnimal(chikcen1);
		chef.cookAnAnimal(turkey1);
		
		chef.cookAnAnimal(dog5);
		
		System.out.println("-----------------------");
		
		Eatable[] eatables = new Eatable[] {chikcen1,turkey1};
		
		chef.cookAnimals(eatables);
		
		
	}
	

}
