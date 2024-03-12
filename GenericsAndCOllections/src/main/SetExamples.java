package main;

import java.util.HashSet;
import java.util.Set;

import model.Product;

public class SetExamples {

	public static void main(String[] args) {
		
		//add, no get(index)
		Set<String> names = new HashSet<>();
		
		names.add("mehmet");
		names.add("mehmet");
		names.add("mehmet");
		names.add("altug");
		names.add("altug");
		names.add("jack");
		
		
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("-------------------");

		Product p1 = new Product(1, "tv",2000);
		Product p2 = new Product(2, "mouse",100);
		Product p3 = new Product(3, "laptop",2000);
		Product p4 = new Product(3, "laptop",2000);
		Product p5 = new Product(1, "tv",2000);
		
		Set<Product> prodsSet = new HashSet<>();
		
		prodsSet.add(p1);
		prodsSet.add(p2);
		prodsSet.add(p3);
		prodsSet.add(p4);
		prodsSet.add(p5);
		prodsSet.add(p2);
		prodsSet.add(p2);
		
		
		
		for (Product product : prodsSet) {
			System.out.println(product);
		}
		
		
	}
	
	
	
}
