package main;

public class MainClass {

	
	public static void main(String[] args) {
		
		//int -> Integer
		// boolean -> Boolean
		// String -> String
		
		//Boxing
		
		Integer num1 = 4;
		
		//unboxing
		int num2 = num1;
		
		
		TypeBox<Integer,String> myBox = new TypeBox<>(4);
		
		System.out.println(myBox.getInfo());
		
		TypeBox<String,String> strBox = new TypeBox<>("Altug");
		
		System.out.println(strBox.getInfo());
		
		
		
	}
	
	
}
