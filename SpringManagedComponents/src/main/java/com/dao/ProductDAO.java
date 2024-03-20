package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Product;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Repository
public class ProductDAO {

	Logger logger = LoggerFactory.getLogger(ProductDAO.class);
	List<Product> products = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		logger.info("Product DAO initialized..");
		
		
		products.add(new Product(1, "TV", 1000, 10));
		products.add(new Product(2, "Laptop", 1000, 10));
		products.add(new Product(3, "Mouse", 500, 5));
		products.add(new Product(4, "Keyboard", 100, 100));
		products.add(new Product(5, "Trousers", 750, 10));
		products.add(new Product(6, "Shoes", 10, 10));
	}
	
	public List<Product> findAll(){
		return products;
	}
	
	public void save(Product p) {
		products.add(p);
		
	}
	
	public Product findById(int id) {
		
		for(Product p : products) {
			if(p.getId()==id) return p;
		}
		
		return null;
		
		
	}
	
	@PreDestroy
	public void destroy() {
		logger.info("ProductDAO is being destroyed..");
	}
	
	
}
