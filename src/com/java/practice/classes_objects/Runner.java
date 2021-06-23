package com.java.practice.classes_objects;

class Machine {
	private String name;
	private int code;

	public Machine() {
		this("Arnie", 0);
		System.out.println("First Construtor running ...");
	}

	public Machine(String name) {
		this(name, 15);
		System.out.println("Second Construtor running ...");
		this.name = name;
	}

	public Machine(String name, int code) {

		System.out.println("Third Construtor running ...");
		this.name = name;
		this.code = code;
	}

}

public class Runner {
	public static void main(String[] args) {
		Machine m1 = new Machine();
//		Machine m2 = new Machine("Jones");
//		Machine m3 = new Machine("Roy", 52);
	}
}