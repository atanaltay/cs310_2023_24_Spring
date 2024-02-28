package main;

import utils.*;

public class MainClass {

	
	public static void main(String[] args) {
		
		//Package naming
		
		// sabanciuniv.edu.tr
		
		// package name: tr.edu.sabanciuniv.utils
		// package name: tr.edu.sabanciuniv.main
		// package name: tr.edu.sabanciuniv.db
		//folder: tr / folder sabanciuniv / utils, main, db
		
		//As User has at least one non
		//default const., Java doesn't provide a default
		//one anymore
		User user1 = new User("atata");
		
		System.out.println(user1.getUsername());
		
		//compiler error
		//System.out.println(user1.name);
		
		
		DBHelper dbHelper = new DBHelper();
		
		//dbHelper.runQuery();
		//dbHelper.printInfo();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
