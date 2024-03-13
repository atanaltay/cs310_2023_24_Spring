package main;

public class MainClassStringExample {

	
	public static void main(String[] args) {
		
		String javaStr = "Java";
		
		String javaStr2 = "Java";
		
		if(javaStr == javaStr2) {
			System.out.println("Equal");
		}else System.out.println("Not Equal");
		
		String javaStr3 = new String("Java");
		
		if(javaStr2 == javaStr3) {
			System.out.println("Equal");
		}else System.out.println("Not Equal");
		
		System.out.println("------------");
		
		String str1 = "Java rules";
		
		String part1 = "Java";
		String part2 = " rules";
		String partSum = part1+part2;
		
		if(str1 == partSum) {
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		if(str1.equals(partSum)) {
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
		//for concatenating strings use the stringbuilder
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("str 1");
		strBuilder.append("str 2");
		
		System.out.println(strBuilder);
		
	}
	
}
