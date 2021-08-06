package com.java.development.equals;

public class ExampleApplication {

	public static void main(String[] args) {

		Person person1 = new Person(7, "James");
		Person person2 = new Person(7, "James");

		System.out.println(person1.equals(person2));

		Double v1 = 7.8;

		Double v2 = 7.8;

		System.out.println(v1.equals(v2));

		Integer num1 = 3;
		Integer num2 = 3;

		System.out.println(num1.equals(num2));

		String str1 = "Hello";
		String str2 = "Hello World".substring(0,5);
		System.out.println(str2);
		System.out.println(str1.equals(str2));
		
	
//		System.out.println(str1.equals(str2)); 

	}
}