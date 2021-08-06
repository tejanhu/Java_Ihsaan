package com.java.development.getuserinput;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a floating point number: ");
		
		double value = in.nextDouble();
		
		System.out.println("You entered: " + value);

	}
}
 