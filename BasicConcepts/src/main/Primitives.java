package main;

import java.util.Scanner;


public class Primitives {
	
	public static void main(String[] args) {
		
		//primitive types
		//byte -> short -> int -> long 
		//float, double
		//boolean,
		//char
		int num1 = 100;
		int num2 = 150;
		
		int sum = num1+num2;
		
		System.out.println(++sum);
		
		//Reference Types
		
		String name ="altug tanaltay";
		
		System.out.println("Your name is " + name);
		
		//Getting user input
		
		//Scanner input = new Scanner(System.in);
		
		//System.out.println("What's your name?");
		
		//String userName = input.nextLine();
		//System.out.println("User's name is " + userName);
		
		//Primitive type assignments
		
		int x = 100;
		int y = x;
		
		x+=100;
		
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		
		//Be careful: Strings are reference types BUT they act like primitive types
		
		String name1 = "jack";
		String name2 = "henry";
		
		//do not create strings like below:
		//String name3 = new String("gokay");
		
		name2 = name1;
		
		
		name1= "william";
		
		System.out.println("Name1:" + name1);
		System.out.println("Name2:" + name2);
		
		
		//Fomatting the output
		int age = 30;
		String lastName= "tanaltay";
		double tax = 0.18;
		//%s->Strings
		//%d-> integers
		//%f-> floating and double
		
		System.out.printf("The \"age\" \\ is %d, lastName is %s, tax is %.2f\n",
				30,lastName,tax);
		
		System.out.printf("The age is %d, lastName is %s, tax is %.2f\n",
				30,lastName,tax);
		
		
		
		
	}
	

}
