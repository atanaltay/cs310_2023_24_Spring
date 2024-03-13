package main;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import model.Product;

public class TreeSetExample {

	public static void main(String[] args) {
		
		Set<String> names = new TreeSet<>();
		
		names.add("mehmet");
		names.add("altug");
		names.add("yasar");
		names.add("behram");
		
		
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("-----------------");
		
		

		Product p1 = new Product(1, "tv",2000);
		Product p2 = new Product(2, "mouse",100);
		Product p3 = new Product(3, "laptop",2000);
		Product p5 = new Product(4, "laptop 2",2000);
		Product p6 = new Product(5, "laptop 3",2000);
		
		Set<Product> prodsSortedSet = new TreeSet<>(new ProductNameComparator());
		
		prodsSortedSet.add(p3);
		prodsSortedSet.add(p2);
		prodsSortedSet.add(p5);
		prodsSortedSet.add(p3);
		prodsSortedSet.add(p6);
		
		for (Product product : prodsSortedSet) {
			System.out.println(product);
		}


		
		
	}
	
	
	
}
