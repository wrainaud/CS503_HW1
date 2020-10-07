package edu.monmouth.CS503.s0833836.CS503HW1;

public class Fish implements Animal {

	public String color;
	protected String moveFish = "Move fins";
	protected String makeFishSound = "SPLISH! SPLASH! SPLISH! SPLASH!";
	
	public Fish (String inColor) {
		color = inColor;
	}//Fish
	
	public String getColor() {
		return color;
	}//getColor
	
	public void setColor(String color) {
		this.color = color;
	}//setColor

	//@Override
	public void move() {
		System.out.println(moveFish);
	}//move
	
	//@Override
	public void makeSound() {
		System.out.println(makeFishSound);
	}//makeSound
	
	public String toString() {
		return "Fish - " + "Color: " + color + "  ";
	}//toString
}//Fish
