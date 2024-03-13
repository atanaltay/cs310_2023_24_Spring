package main;

import java.util.Comparator;

import model.Product;


//functional interface
public class ProductNameComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
