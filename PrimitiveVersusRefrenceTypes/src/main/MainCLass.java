package main;

import model.Car;
import model.CarPainter;
import model.User;
import model.ValueChanger;

public class MainCLass {

	public static void main(String[] args) {
		
		//Primitive Type assignments
		int x = 100;
		int y =x;
		
		x+=100;
		//y? 
		System.out.println("y is " + y);
		
		
		//Reference type assigments.
		
		User user1 = new User("altug");
		
		
		User user2 = user1;
		
		
		user1.setUsername("mehmet");
		
		
		System.out.println("User 1:"+ user1.getUsername() );
		System.out.println("User 2:"+ user2.getUsername() );
		
		////////////////////////////////
		//Pass-by-vaue - > Value is copies - primitive types
		int num1 = 200;
		
		ValueChanger valChanger = new ValueChanger();
		valChanger.changeValue(num1);

		
		System.out.println("Num1: " + num1);
		
		System.out.println("----------------");
		
		
		num1 =  valChanger.changeValue2(num1);
		System.out.println("Num1: " + num1);
		
		System.out.println("--------------------");
		
		
		//Pass-by-reference
		Car car1 = new Car("Blue");
		
		CarPainter painter = new CarPainter();
		painter.changeColor(car1, "Green");
		
		System.out.println("Car 1 color:" + car1.getColor());
		
		
	}
	
	
}
