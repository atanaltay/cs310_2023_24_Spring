package model;

//If a class is encapsulated (getters and setters)
//and if a class has a default constructor
//We call these classes in Java JavaBean
// We also call them POJO's -> Plain Old Java Object
public class User {
	
	private String username;
	private String name;
	private int birthYear;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	//Non-default constructor
	public User(String username) {
		
		this.username =username;
		
	}
	
	
	
	public User(String username, String name, int birthYear) {

		this.username = username;
		this.name = name;
		this.birthYear = birthYear;
	}

	public void getInfo() {
		
		System.out.println("User: name: " + name);
		System.out.println("User: name: " + name);
		
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		
		this.birthYear = birthYear;
	}
	
	
}
