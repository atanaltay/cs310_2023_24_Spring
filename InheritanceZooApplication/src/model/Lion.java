package model;

public class Lion extends Cat{
	
	private String origin;
	
	
	
	
	public Lion(String name, String habitat, String furColor, String favFood, String origin) {
		super(name, habitat, furColor, favFood);
		this.origin = origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getOrigin() {
		return origin;
	}
	

}
