package edu.monmouth.CS503.s0833836.CS503HW1;

public class GuardDog extends Dog {
	
	private short meanness;
	
	public GuardDog(String inFurColor, short inMeanness) {
		super(inFurColor);
		meanness = inMeanness;
	}//ShowDog
		
	public short getMeanness() {
		return meanness;
	}//getMeanness
	
	public void setMeanness(short meanness) {
		this.meanness = meanness;
	}//setMeanness
	
	public String toString() {
		return "Guard Dog - " + "Fur Color: " + super.getFurColor() + ". Meanness: " + meanness + " ";
	}//toString
		
}//GuardDog
