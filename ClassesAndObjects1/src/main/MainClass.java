package main;

public class MainClass {

	public static void main(String[] args) {
		
		// The car is not instantiated
		//Nullpointerexception
		//Car car1 = null;
		
		//car1.printSummary();
		
		
		//initialize a Car object
		//Callng the default contructor
		Car car1 = new Car();
		car1.printSummary();
		car1.startEngine();
		car1.increaseSpeed(100);
		car1.decreaseSpeed(40);
		
		car1.decreaseSpeed(60);
		car1.stopEngine();
		
		System.out.println("----------------------");
		
		Car car2 = new Car("Honda V2", "Red", "Manual", 1499);
		car2.printSummary();
		car2.startEngine();
		car2.increaseSpeed(100);
		car2.decreaseSpeed(40);
		car2.printSummary();
		car2.decreaseSpeed(60);
		car2.stopEngine();
		car2.printSummary();
		
	}
	
	
	
}
