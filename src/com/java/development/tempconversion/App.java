package com.java.development.tempconversion;

public class App {

	public static void convertFarenheightToCelsius(double f) {

		double celsius;

		celsius = (f - 32) * 5.0 / 9.0;

		System.out.printf("%.1f degrees Fareheight is %.1f degrees Celsius.\n", f, celsius);
	}

	public static void main(String[] args) {

		final int FARENHEIT = 91;

		convertFarenheightToCelsius(FARENHEIT);

	}
}
