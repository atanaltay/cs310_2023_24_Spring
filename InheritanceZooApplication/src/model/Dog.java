package model;

//Dog is an Animal
public class Dog extends Animal{
/**
 * Dog (extends Animal)
	- species
	- favToy
 */
	
	
	private String species;
	private String favToy;
	
	
	
	public Dog(String name, String habitat, String furColor, String species, String favToy) {
		super(name, habitat, furColor);
		this.species = species;
		this.favToy = favToy;
		System.out.println("Dog constructor");
	}
	
	//Method overriding
	//Annotations
	@Override
	public void makeSound() {
		
		System.out.println("Dog: Bark bark bark!");
		
	}
	
	@Override
		public void getFed() {
			System.out.println("Dog is getting fed with dog food..");
		}
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getFavToy() {
		return favToy;
	}
	public void setFavToy(String favToy) {
		this.favToy = favToy;
	}
	
	
	
	
}
