package com.java.development.abstractclasses;

public abstract class WildCat {
	
	private String animalType;
	
	public String getAnimalType() {
		return animalType;
	}
	
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	
	public abstract void roar();

}
