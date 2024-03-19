package com.sabanciuniv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringApplication implements CommandLineRunner{

	Logger logger = LoggerFactory.getLogger(FirstSpringApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Welcome to Spring Framework..");
		
		
	}

}
