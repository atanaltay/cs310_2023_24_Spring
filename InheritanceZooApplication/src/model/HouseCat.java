package model;

//COncrete class
public class HouseCat extends Cat{
	
	String owner;
	
	
	
	public HouseCat(String name, String habitat, String furColor, String favFood, String owner) {
		super(name, habitat, furColor, favFood);
		this.owner = owner;
		System.out.println("Housecat constructor");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Cat: Miaw miaw");
	}
	@Override
	public void getFed() {
		System.out.println("Cat is getting fed with cat food..");
	}


	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
