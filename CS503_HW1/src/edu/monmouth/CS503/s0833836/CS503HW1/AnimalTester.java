package edu.monmouth.CS503.s0833836.CS503HW1;

public class AnimalTester {

	public static void main(String[] args) {
		
		Animal dog = new Dog(null);
		dog.move();
		dog.makeSound();
		
		Animal fish = new Fish(null);
		fish.move();
		fish.makeSound();
		
		AnimalList test1 = new AnimalList();
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

		test1.printList();

	}//main
}//AnimalTester

