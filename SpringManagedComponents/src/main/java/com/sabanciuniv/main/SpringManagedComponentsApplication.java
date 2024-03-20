package com.sabanciuniv.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.model.Product;
import com.service.ShopService;



@SpringBootApplication(scanBasePackages = {"com.dao","com.service"})
public class SpringManagedComponentsApplication implements CommandLineRunner{

	

	Logger logger = LoggerFactory.getLogger(SpringManagedComponentsApplication.class);

	@Autowired
	ApplicationContext ctx;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringManagedComponentsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Welcome to Spring Framework..");
		
		com.service.ShopService shopService= ctx.getBean(ShopService.class);
		
		logger.info("All products in DB:");
		
		
		shopService.getAllProducts().forEach(p->{
			logger.info(p.toString());
		});
		
		
		
		ShopService srv2 = ctx.getBean(ShopService.class);
		logger.info("Saving new products...");
		
		srv2.saveProduct(new Product(100, "USB Cable", 100, 100));
		
	}

}
