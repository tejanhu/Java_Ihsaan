package com.java.interfaces;

public class Person implements Info {
	
	private String name; 
			
			

	public Person(String name) {
		this.name = name;
	}



	public void greet() {
		System.out.println("Marhaaban");
	}



	@Override
	public void showInfo() {
		System.out.println("Person is " + name);
		
	}
}
