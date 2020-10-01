package edu.monmouth.CS503.s0833836.CS503HW1;

public class Dog implements Animal {

	private String furColor;
	
	public String getFurColor() {
		return furColor;
	}//getFurColor
	
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}//setFurColor

	//@Override
	public void move() {
		System.out.println("Move legs");
	}//move
	
	//@Override
	public void makeSound() {
		System.out.println("BARK! BARK! BARK!");
	}//makeSound
}//Dog
