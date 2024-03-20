package com.sabanciuniv.model;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class TimeDAO {
	Logger logger = LoggerFactory.getLogger(TimeDAO.class);
	@PostConstruct
	public void init() {
		logger.info("TimeDAO initialized.");
	}
	
	public String getTimeInfo() {
		return LocalDateTime.now().toString();
	}

	@PreDestroy
	public void destroy() {
		logger.info("TimeDAO is being destroyed..");
	}
	
}
