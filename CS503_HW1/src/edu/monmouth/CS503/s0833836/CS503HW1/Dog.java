package edu.monmouth.CS503.s0833836.CS503HW1;

public class Dog implements Animal {

	protected String furColor;
	public String moveDog = "Move legs";
	public String makeDogSound = "BARK! BARK! BARK!";
	
	public Dog () {
	}//Dog
	
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}//setFurColor

	public String getFurColor() {
		return furColor;
	}//getFurColor

	//@Override
	public void move() {
		System.out.println(moveDog);
	}//move
	
	//@Override
	public void makeSound() {
		System.out.println(makeDogSound);
	}//makeSound
	
	public String toString() {
		return "Dog - " + "Fur Color: " + furColor + "  ";
	}//toString
}//Dog
