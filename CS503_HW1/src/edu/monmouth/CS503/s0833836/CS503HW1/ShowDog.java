package edu.monmouth.CS503.s0833836.CS503HW1;

public class ShowDog extends Dog {
	
	private String breed;
	
	public ShowDog(String inFurColor, String inBreed) {
		super(inFurColor);
		breed = inBreed;
	}//ShowDog
	
	//@Override
	public String getBreed() {
		return breed;
	}//getBreed
	
	//@Override
	public void setBreed(String breed) {
		this.breed = breed;
	}//setBreed
	
	//@Override
	public String toString() {
		return "Show Dog - " + "Fur Color: " + super.getFurColor() + ". Breed: " + breed + " ";
	}//toString
	
}//ShowDog
