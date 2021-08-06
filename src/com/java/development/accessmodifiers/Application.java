package com.java.development.accessmodifiers;

import com.java.development.accessmodifiers.world.Plant;

/*
* private -- only accessible in same class
* public -- accessible from anywhere
* protected -- accessible from subclass as well as same package
* no modifier -- only accessible from same package
*/

public class Application {

	public static void main(String[] args) {
		Plant plant = new Plant();

		System.out.println(plant.name);

		System.out.println(plant.ID);

		// Won't work as type is private - restricted to Plant class

		// System.out.println(plant.type);

		// Won't work as size is protected - Application.java is not in the same package as Plant
		// System.out.println(plant.size);

		// Won't work because --- height has no access specifier which will default to package level visibility
		// System.out.println(plant.height);
	}

}
