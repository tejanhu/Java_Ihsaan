package com.java.development.enums;

public class ExampleApplication {



	public static void main(String[] args) {

		Car car = Car.MERCEDES;

		switch(car) {
		case FORD:
			System.out.println("Ford");
			break;
		case MERCEDES:
			System.out.println("Mercedes");
			break;
		case TOYOTA:
			System.out.println("Toyota");
			break;
		default:
			break;
		
		}
		
		System.out.println(Car.FORD.getName());
		
		System.out.println("Enum name as a String: " + Car.FORD.name());
		
		System.out.println(Car.TOYOTA.toString());
		
		System.out.println(Car.FORD instanceof Enum);
}
}