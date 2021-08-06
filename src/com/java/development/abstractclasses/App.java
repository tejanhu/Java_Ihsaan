package com.java.development.abstractclasses;

public class App {
	
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		
		tiger.setAnimalType("Tiger");
		
		Lion lion = new Lion();
		
		lion.setAnimalType("Lion");
		
		//We cannot instantiate abstract classes
		//WildCat wildCat = new WildCat();
	}

}
