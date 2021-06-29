package com.java.practice.classesobjects;

class Student {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class App {
	public static void main(String args[]) {
		Student studentOne = new Student();
		studentOne.setName("Samantha");
		studentOne.setAge(21);
		System.out.println("Student 1 name: " + studentOne.getName());
		System.out.println("Student 1 age: " + studentOne.getAge());

	}
}
