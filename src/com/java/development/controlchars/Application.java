package com.java.development.controlchars;

public class Application {
	public static void main(String[] args) {

		String tabSpacing = "\t";
		String spacing = " ";
		String doubleTabSpacing = tabSpacing + tabSpacing;
		String period = ".";
		String prompt = tabSpacing + "Select an option:";
		int optionOne = 1;
		String firstOption = doubleTabSpacing + optionOne + "" + period + spacing + "Add an entry";
		int optionTwo = 2;
		String secondOption = doubleTabSpacing + optionTwo + period + spacing + "View the database";
		int optionThree = 3;
		String thirdOption = doubleTabSpacing + optionThree + period + spacing + "Exit";

		System.out.println(prompt);
		System.out.println(firstOption);
		System.out.println(secondOption);
		System.out.println(thirdOption);

	}
}
