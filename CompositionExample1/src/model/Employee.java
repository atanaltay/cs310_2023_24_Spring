package model;

public class Employee {
	
	//Employee has address
	
	private String name;
	
	private Address address;

	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getInfo() {
		return "Employee: " + getName() + " + \n" + address.getInfo(); 
	}

}
