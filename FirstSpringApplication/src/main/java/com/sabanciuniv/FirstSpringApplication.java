package com.sabanciuniv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.sabanciuniv.model.Product;
import com.sabanciuniv.model.ProductDAO;
import com.sabanciuniv.model.ShopService;
import com.sabanciuniv.model.TimeDAO;

@SpringBootApplication
public class FirstSpringApplication implements CommandLineRunner{

	Logger logger = LoggerFactory.getLogger(FirstSpringApplication.class);
	
	//Dependency injection
	//searches ApplicationContext and injects the object from memory
	@Autowired
	ApplicationContext ctx;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Welcome to Spring Framework..");
		
		ShopService shopService= ctx.getBean(ShopService.class);
		
		logger.info("All products in DB:");
		
		
		shopService.getAllProducts().forEach(p->{
			logger.info(p.toString());
		});
		
		
		
		ShopService srv2 = ctx.getBean(ShopService.class);
		logger.info("Saving new products...");
		
		srv2.saveProduct(new Product(100, "USB Cable", 100, 100));
		
		
		
		logger.info("All products in DB:");
		
		
		shopService.getAllProducts().forEach(p->{
			logger.info(p.toString());
		});
		
		logger.info("--------------------");
		
		TimeDAO timedao = ctx.getBean(TimeDAO.class);
		
		logger.info(timedao.getTimeInfo());
		
		logger.info("--------------------");
		
		timedao = ctx.getBean(TimeDAO.class);
		logger.info(timedao.getTimeInfo());
		
		
	}
	
	//Scopes : Singleton (Default), Prototype
	@Bean
	ProductDAO productDAO() {
		
		return new ProductDAO();
		
	}
	
	@Bean
	@Scope("prototype")
	TimeDAO  timeDAO() {
		return new TimeDAO();
	}
	
	@Bean
	ShopService shopService() {
		return new ShopService(timeDAO(), productDAO());
	}
	
	

}
