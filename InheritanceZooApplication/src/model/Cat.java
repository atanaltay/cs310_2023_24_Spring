package model;

public abstract class Cat extends Animal{
	
	/*
	 * Cat (extends Animal)
	- favFood
	 */
	
	private String favFood;

	public Cat(String name, String habitat, String furColor, String favFood) {
		super(name, habitat, furColor);
		this.favFood = favFood;
		System.out.println("Cat constructor");
	}
	
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	
	public String getFavFood() {
		return favFood;
	}
	
	
	
	
	
	

}
