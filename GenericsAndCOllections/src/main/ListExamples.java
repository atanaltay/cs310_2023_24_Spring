package main;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ListExamples {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		//add, remove(index), get(index)
		
		
		names.add("mehmet");
		names.add("ahmet");
		names.add("hasan");
		names.add("jack");
		
		
		System.out.println(names.get(2));
		
		System.out.println("---------");
		
		
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("-------------");
		
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product(1, "tv", 1000));
		prodList.add(new Product(2, "laptop", 2000));
		prodList.add(new Product(3, "mouse", 100));
		
		for (Product product : prodList) {
			System.out.println(product);
		}
		
		
		
	}
	
	

}
