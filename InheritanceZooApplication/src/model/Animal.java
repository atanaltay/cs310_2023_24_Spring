package model;

public abstract class Animal{

	/**
	 * Animal (Super type, top level class)
	- name:String
	- habitat:String
	- furColor:String
	 */
	
	private String name;
	private String habitat;
	private String furColor;
	


	public Animal(String name, String habitat, String furColor) {
		super();
		this.name = name;
		this.habitat = habitat;
		this.furColor = furColor;
		System.out.println("Animal constructor");
	}
	
	//abstract method: without body, must be implemented in the first concrete
	//class
	public abstract void makeSound();
	
	public abstract void getFed();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getFurColor() {
		return furColor;
	}
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	
	
	
}
