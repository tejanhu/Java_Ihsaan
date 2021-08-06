package com.java.algos.development.recursion;

public class Application {

	public static void main(String[] args) {

		calculateWithForLoop(2);
		calculateWithRecursion(1);
	}

	private static void calculateWithForLoop(int value) {

		int sum = 0;
		for (int i = 1; i <= 12; i++) {

			sum = value * i;

		}

		System.out.println("Iterative solution: " + sum);

	}

	private static void calculateWithRecursion(int i) {

		int sum = 0;

		sum = 2 * i;

		if (sum == 24) {
			System.out.println("Recursion solution: " + sum);
			return;
		}

		calculateWithRecursion(i + 1);

	}

}
