package main;

import model.Address;
import model.Department;
import model.Employee;

public class MainClass {

	
	public static void main(String[] args) {
		
		Address add1 = new Address("ISTANBUL", "346554");
		Employee emp1 = new Employee("Jack", add1);
		
		Address add2 = new Address("ANKARA", "45332");
		Employee emp2 = new Employee("John", add2);
		
		System.out.println(emp1.getInfo());
		
		System.out.println(emp2.getInfo());
		
		Employee[] emps = new Employee[] {emp1,emp2};
		
		Department department = new Department("IT", emps);
		
		System.out.println("-----------");
		department.getInfo();
		
		
		
	}
	
	
}
