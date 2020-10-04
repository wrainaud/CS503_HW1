package edu.monmouth.CS503.s0833836.CS503HW1;

public class Fish implements Animal {

	private String color;
	
	public Fish () {
	}//Fish
	
	public String getColor() {
		return color;
	}//getColor
	
	public void setColor(String color) {
		this.color = color;
	}//setColor

	//@Override
	public void move() {
		System.out.println("Move fins");
	}//move
	
	//@Override
	public void makeSound() {
		System.out.println("SPLISH! SPLASH! SPLISH! SPLASH!");
	}//makeSound
	
	public String toString() {
		return "Fish - " + "Color: " + color + "  ";
	}//toString
}//Fish
