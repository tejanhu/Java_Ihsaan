package com.java.development.userinput;

import java.util.Scanner;

public class App {

	public static void convertFarenheightToCelsius(double f) {

		double celsius;

		celsius = (f - 32) * 5.0 / 9.0;

		System.out.printf("%.1f degrees Fareheight is %.1f degrees Celsius.\n", f, celsius);
	}

	public static void main(String[] args) {

		Scanner scannerForInput = new Scanner(System.in);

		System.out.print("Enter a Farenheight Temperature: ");

		final int FARENHEIT = scannerForInput.nextInt();

		System.out.println();

		convertFarenheightToCelsius(FARENHEIT);

	}
}
