package model;

public class HouseCat extends Cat{
	
	String owner;
	
	
	
	public HouseCat(String name, String habitat, String furColor, String favFood, String owner) {
		super(name, habitat, furColor, favFood);
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
