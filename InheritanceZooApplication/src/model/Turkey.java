package model;

public class Turkey extends Animal implements Eatable{

	public Turkey(String name, String habitat, String furColor) {
		super(name, habitat, furColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("Turkey sound..");
		
	}

	@Override
	public void getFed() {
		System.out.println("Turkey is getting fed..");
		
	}

	@Override
	public void howToCook() {
		System.out.println("Bake the Turkey..");
		
	}

}
