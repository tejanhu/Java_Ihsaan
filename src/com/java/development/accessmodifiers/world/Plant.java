package com.java.development.accessmodifiers.world;

public class Plant {

//	Bad practice to declare instance variables public

	public String name;

//	Acceptable practice ----- it's final

	public final static int ID = 10;

	private String type;

	protected String size;
	
	// No access specifier
	int height;

	public Plant() {

		this.name = "Lizzy";

		this.type = "plant ";

		this.size = "M";
		
		this.height = 9;

	}

}
