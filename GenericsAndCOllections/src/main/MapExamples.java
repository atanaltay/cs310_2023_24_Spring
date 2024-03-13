package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Product;

public class MapExamples {
	
	public static void main(String[] args) {
		
		
		Map<String, String> mMap = new HashMap<>();
		
		mMap.put("relative", "henry");
		mMap.put("foe", "jack");
		mMap.put("friend", "william");
		
		System.out.println(mMap.get("relative"));
		
		mMap.put("relative", "gokay");
		
		System.out.println(mMap.get("relative"));
		
		System.out.println("------------");
		
		for(String key: mMap.keySet()) {
			System.out.println(mMap.get(key));
		}
		
		System.out.println("------------");
		
		Product p1 = new Product(1, "tv",2000);
		Product p2 = new Product(2, "mouse",100);
		Product p3 = new Product(3, "shoes",2000);
		Product p4 = new Product(4, "trousers",2000);
		Product p5 = new Product(5, "kitchen robot",2000);
		
		List<Product> prodElectronics = new ArrayList<>();
		
		prodElectronics.add(p1);
		prodElectronics.add(p2);

		
		List<Product> prodClothing = new ArrayList<>();
		
		prodClothing.add(p3);
		prodClothing.add(p4);
		
		
		Map<String, List<Product>> productMap = new HashMap<>();
		
		productMap.put("electronics", prodElectronics);
		productMap.put("clothing", prodClothing);
		
		for(Product product: productMap.get("electronics")) {
			System.out.println(product);
		}
		
		
	}

}
