package edu.monmouth.CS503.s0833836.CS503HW1;

public class AnimalTester {
	
	final int ARRAYSIZE = 20;
	Animal[] list = new Animal[ARRAYSIZE];
	public int counter = 0;
	
	public void addDog(String inFurColor) {
		Dog newDog = new Dog(inFurColor);
		list[counter] = newDog;
		counter++;
	}//addDog

	public void addFish(String inColor) {
		Fish newFish = new Fish(inColor);
		list[counter] = newFish;
		counter++;
	}//addFish

	public void addGuardDog(String inFurColor, short inMeanness) {
		GuardDog newGuardDog = new GuardDog(inFurColor, inMeanness);
		list[counter] = newGuardDog;
		counter++;
	}//addGuardDog

	public void addShowDog(String inFurColor, String inBreed) {
		ShowDog newShowDog = new ShowDog(inFurColor, inBreed);
		list[counter] = newShowDog;
		counter++;
	}//addShowDog
	
	public void printList() {		
		for (int newCounter = 0; newCounter < counter; newCounter++) {
			System.out.println(list[newCounter].toString());
		}//for
	}//printList
	
	public void printEvenElementsList() {		
		for (int newCounter = 0; newCounter < counter; newCounter++) {
			if(newCounter % 2 == 0) {
			System.out.println(list[newCounter].toString());
			}//if
		}//for
	}//printList
	
	public void printReverseList() {		
		for (int newCounter = -1; newCounter > counter; newCounter--) {
			System.out.println(list[newCounter].toString());
		}//for
	}//printList

	public static void main(String[] args) {
		
		Animal dog = new Dog(null);
		dog.move();
		dog.makeSound();
		
		Animal fish = new Fish(null);
		fish.move();
		fish.makeSound();
		
		AnimalTester test1 = new AnimalTester();
		test1.addDog("Black");
		test1.addDog("Gold");
		test1.addDog("Yellow");
		test1.addDog("Brown");
		test1.addDog("Charcoal");
		
		test1.addFish("Black");
		test1.addFish("Gold");
		test1.addFish("Yellow");
		test1.addFish("Brown");
		test1.addFish("Charcoal");
		
		test1.addGuardDog("Black", (short) 7);
		test1.addGuardDog("Gold", (short) 2);
		test1.addGuardDog("Yellow", (short) 8);
		test1.addGuardDog("Brown",(short) 5);
		test1.addGuardDog("Charcoal", (short) 10);
		
		test1.addShowDog("Black", "Lab");
		test1.addShowDog("Gold", "Golden Retriever");
		test1.addShowDog("Yellow", "Great Dane");
		test1.addShowDog("Brown", "French Bulldog");
		test1.addShowDog("Charcoal", "Dobermann");
		
		System.out.println("");
		System.out.println("Full List of Animals");
		System.out.println("");
		test1.printList();
		
		System.out.println("");
		System.out.println("Every Even Animal in the Array");
		System.out.println("");
		test1.printEvenElementsList();
		
		System.out.println("");
		System.out.println("Every Animal in the Array in Reverse Order");
		System.out.println("");
		test1.printReverseList();

	}//main
	
}//AnimalTester

