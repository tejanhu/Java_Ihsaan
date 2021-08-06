package com.java.development.dowhileloop;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int value = input.nextInt();
		
		do {
			System.out.println("Enter a number: ");
			 value = input.nextInt();
			
		}while(value != 10);
		
		System.out.println("Got 10!");

	}
}
