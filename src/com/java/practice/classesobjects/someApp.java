package com.java.practice.classesobjects;

class someObject {
	public final static int CHOSEN_NUMBER = 13;

	public String name;

	public static String description;

	public static int count = 0;

	public int id;

	public someObject() {
		id = count;
		count++;
	}

	public void showName() {
		System.out.println("Object id: " + id + " ," + description + ":" + name);
	}

	public static void showInfo() {
		System.out.println(description);
	}

}

public class someApp {

	public static void main(String[] args) {
		someObject.description = "I am an object";

		someObject.showInfo();

		System.out.println("Before creating objects, count is: " + someObject.count);

		someObject obj1 = new someObject();
		someObject obj2 = new someObject();

		System.out.println("After creating objects, count is: " + someObject.count);

		obj1.name = "Thomas";

		obj2.name = "Veronica";

		obj1.showName();

		obj2.showName();

		System.out.println(Math.PI);
		
		System.out.println(someObject.CHOSEN_NUMBER);

	}

}
