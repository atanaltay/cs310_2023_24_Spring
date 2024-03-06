package model;

public class Lion extends Cat{
	
	private String origin;
	
	
	
	
	public Lion(String name, String habitat, String furColor, String favFood, String origin) {
		super(name, habitat, furColor, favFood);
		this.origin = origin;
		System.out.println("Lion constructor");
	}

	
	@Override
	public void makeSound() {
		System.out.println("Lion: Roar roar...");
	}
	
	@Override
	public void getFed() {
		System.out.println("Lion is getting fed with meet..");
	}
	
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void gettingFed() {
		
	}

}
