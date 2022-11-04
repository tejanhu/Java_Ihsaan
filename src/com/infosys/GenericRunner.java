package com.infosys;

public class GenericRunner {

	public static void main(String[] args) {
		SimpleGeneric<String> genClass = new SimpleGeneric<String>("Input");
		genClass.showObjectType();
	}

}
