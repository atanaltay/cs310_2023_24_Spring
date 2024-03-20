package com.sabanciuniv.model;

import java.util.List;

public class ShopService {
	
	private TimeDAO timeDAO;
	private ProductDAO productDAO;
	
	public ShopService(TimeDAO timeDAO, ProductDAO productDAO) {
		super();
		this.timeDAO = timeDAO;
		this.productDAO = productDAO;
	}
	
	public List<Product> getAllProducts(){
		return productDAO.findAll();
	}
	
	public String getTimeInfo() {
		return timeDAO.getTimeInfo();
	}
	
	public void saveProduct(Product p) {
		productDAO.save(p);
	}
	
	public Product getProductById(int id) {
		return productDAO.findById(id);
	}

}
