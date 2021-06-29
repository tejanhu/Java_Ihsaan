package com.java.accessmodifiers;

import com.java.accessmodifiers.world.Plant;

public class Grass extends Plant {

	public Grass() {
		// Won't work because --- as height is not in same package as Plant eventhough it is a subclass
		// System.out.println(this.height);
	}

}
