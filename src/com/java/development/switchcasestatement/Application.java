package com.java.development.switchcasestatement;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter something: ");

		String text = input.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine started!");
			break;
		case "stop":
			System.out.println("Machine stopped!");
			break;
		default:
			System.out.println("Command not recognised");
		}

	}
}
