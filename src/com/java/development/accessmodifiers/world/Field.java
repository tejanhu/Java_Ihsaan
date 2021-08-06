package com.java.development.accessmodifiers.world;

public class Field {

	private Plant plant = new Plant();

	public Field() {

		// size is protected and field is in the same package as Plant.
		System.out.println(plant.size);
	}

}
