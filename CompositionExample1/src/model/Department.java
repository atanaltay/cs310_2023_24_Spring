package model;


public class Department {
	private String name;
	
	private Employee[] employees;
	
	
	
	
	public Department(String name, Employee[] employees) {
		super();
		this.name = name;
		this.employees = employees;
	}




	public void getInfo() {
		System.out.println("Department:" + name);
		for (Employee employee : employees) {
			System.out.println(employee.getInfo());
		}
	}

}
