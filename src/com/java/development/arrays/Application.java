package com.java.development.arrays;

public class Application {
	public static void main(String[] args) {

		String [] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String [] fruits = {"orange", "strawberry", "blueberry", "blackberry", "banana", "kiwi", "sharon fruit"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
	
		
		
		
	}
}
