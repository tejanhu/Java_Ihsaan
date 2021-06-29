package com.java.accessmodifiers.world;

public class Palm extends Plant {

	public Palm() {

		// Won't work as type is private
		// type = "Tree";

		// This works --- size is protected and Palm is a sub class of Plant
		this.size = "L";

		// No access specifier; works because Palm and Plant are in the same package
		this.height = 11;
	}

}
