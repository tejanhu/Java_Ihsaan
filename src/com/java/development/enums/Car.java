package com.java.development.enums;

public enum Car {
	TOYOTA("Toyota"),MERCEDES("Mercedes"),FORD("Ford");
	
	private String name;
	
	private Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "This car is a " + name;
	}
	
	
}
