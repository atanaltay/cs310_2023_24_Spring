package model;

public class Chicken extends Animal implements Eatable{

	public Chicken(String name, String habitat, String furColor) {
		super(name, habitat, furColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("Chicken sound");
		
	}

	@Override
	public void getFed() {
		System.out.println("Chicken is eating");
		
	}

	@Override
	public void howToCook() {
		System.out.println("Make chikcen soup..");
		
	}

}
