package model;

import java.util.Iterator;

public class Chef {


	public void cookAnAnimal(Animal animal) {
		if(animal instanceof Eatable) {
			((Eatable)animal).howToCook();
		}else {
			System.out.println("NOT EATABLE!!");
		}
		
		
	}
	
	public void cookAnimals(Eatable[] eatables) {
		for(Eatable eatable: eatables) {
			eatable.howToCook();
		}
	}
	
	
}
