package com.java.development.userinput;

import java.util.Scanner;

public class projectTwo {

	public static void main(String[] args) {
		Scanner scannerForInput = new Scanner(System.in);
		
		System.out.print("Enter the number of inches: ");
		
		double inchValue = scannerForInput.nextFloat();

		scannerForInput.close();
		
		System.out.println();
		
		double feetValue;
		
		feetValue = inchValue/12;
		
		System.out.printf("%.1f Inches = %.1f Foot\n", inchValue, feetValue);

	}

}
