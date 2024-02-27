package main;

public class Car {

	//state -> instance variables/ global variables
	
	String carName;
	String color;
	String transmissionType;
	int engineVolume;
	
	//if you dont assign any value to global variables, they get their default values
	
	//int, double, float ->0, boolean->false, String -> null
	boolean engineStarted;
	
	int currentSpeed;
	
	//Constructor
	//a constructor without any parameters is called the DEFAULT CONSTRUCTOR
	Car(){
		carName = "Honda";
		color ="blue";
		transmissionType ="Auto";
		engineVolume = 1599;
		
		engineStarted = false;
		
		currentSpeed = 0;
	}
	
	//Constructor overloading
	
	Car(String carName,String color, String transmissionType, int engineVolume){
		
		//variable shadowing, value of a variable is assigned to itself,
		//it has no effect!
		this.carName = carName;
		this.color = color;
		this.transmissionType = transmissionType;
		this.engineVolume = engineVolume;
		
		
	}
	
	//behaviour -> methods = functions
	
	//return types: int, String, any other object
	// return nothing : void 
	
	void startEngine() {
		
		if(engineStarted==false) {
			
			engineStarted = true;
			System.out.println("Engine is started!");
		}else System.out.println("Engine is already started!");
		
		
	}
	
	void stopEngine() {
		if(engineStarted==true) {
			engineStarted = false;
			System.out.println("Engine is stopped!");
		}else System.out.println("Engine is already stopped!");
	}
	
	//method signature: nameOfTheMethod + Parameter Type List
	//increaseSpeed(int)
	void increaseSpeed(int speed) {
		
		if(engineStarted) {
			currentSpeed +=speed;
			System.out.println("Speed increased to " + currentSpeed);
			
		}else System.out.println("Start the engine first.");
		
	}
	//increaseSpeed(int,String)
	//Method overloading
	void increaseSpeed(int speed2,String caller) {
		currentSpeed = speed2;
	}
	
	void decreaseSpeed(int speed) {
		
		if(engineStarted) {
			currentSpeed -= speed;
			System.out.println("Speed decreased to " + currentSpeed);
			
		}else System.out.println("Start the engine first.");
		
	}
	
	
	void printSummary() {
		
		System.out.println("Color:" + color);
		System.out.println("Transmission:" + transmissionType);
		
		System.out.println("Engine volume:" + engineVolume);
		
		System.out.println("Is engine started?" + engineStarted);
		System.out.println("Current speed:" + currentSpeed);
	}
	
	
	
	
}
