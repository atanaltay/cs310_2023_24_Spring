package main;

import model.Product;

public class MainClass2 {

	public static void main(String[] args) {
		Product p1 = new Product(1, "tv",2000);
		Product p2 = new Product(2, "mouse",100);
		Product p3 = new Product(3, "laptop",2000);
		Product p4 = new Product(3, "laptop",2000);
		Product p5 = p1;
		
		//equals operator
		if(p3==p4) {
			System.out.println("p3 equal to p4");
		}else System.out.println("Not equal");
		
		if(p1==p5) {
			System.out.println("p3 equal to p4");
		}else System.out.println("Not equal");
		
		
		System.out.println("------------");
		//overridden equals
		
		if(p3.equals(p4)) {
			System.out.println("p3 equal to p4");
		}else System.out.println("Not equal");
		
		if(p1.equals(p5)) {
			System.out.println("p1 equal to p5");
		}else System.out.println("Not equal");
		
		
		
	}
	
	
}
