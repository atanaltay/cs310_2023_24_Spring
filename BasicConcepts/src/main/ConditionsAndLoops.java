package main;

import java.util.Iterator;

public class ConditionsAndLoops {

	public static void main(String[] args) {
		
		int num = 50;
		
		System.out.println(num>40);
		System.out.println(num==50);
		System.out.println(num!=40);
		
		if(num<40) {
			System.out.println("less than 40");
		}else if(num<45) {
			System.out.println("40 - 45");
		}else {
			System.out.println("greater than 45");
		}
		
		switch (num) {
		case 30: {
			
			System.out.println("The num is 30");
			break;
		}
		case 50:
			System.out.println("The num is 50");
			break;
		default:
			System.out.println("The num is not 30 or 50");
		}
		
		
		int i =0;
		
		while(i<50) {
			System.out.println(i);
			
			if (i==25) {
				break;
			}
			
			i++;
			
		}
		
		for (int j = 0; j < 50; j++) {
			System.out.printf("j is %d\n",j);
		}
		

		
		int[] numbers = {2,5,3,8,2,9,10};
		
		for (int j = 0; j < numbers.length; j++) {
			System.out.println(numbers[j]);
		}
		
		//foreach statement -> enhanced for
		
		for(int n:numbers) {
			System.out.println(n);
		}
		
		/////////////////////////////////////////
		
		//any literal int sized or smaller are always an int in Java
		byte num1 = 12;
		byte num2 = 34;
		
		//explicit casting
		byte sum = (byte)(num1+num2);
		System.out.println(sum);
		
		
		int d = 100;
		
		//implicit cast
		double dd = d;
		
		double tax2 = 0.188;
		
		//explicit cast
		int tax2Int = (int)tax2;
		
		System.out.println(tax2Int);
	}
	
	
}
