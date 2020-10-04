package edu.monmouth.CS503.s0833836.CS503HW1;

public class AnimalList {
		
		Animal[] list = new Animal[20];
		public int counter = 0;
		
		public AnimalList() {
		}//InstructorList
		
		public void addDog() {
			Dog newDog = new Dog();
			list[counter] = newDog;
			counter++;
		}//addDog
	
		public void addFish() {
			Fish newFish = new Fish();
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

}//AnimalList
