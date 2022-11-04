package com.infosys;

import java.util.Arrays;
import java.util.Scanner;

public class VaragsExercise1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of your array: ");

		int input[] = new int[scan.nextInt()];

		System.out.println("Enter the numbers you wish to add to your array: ");

		for (int i = 0; i < input.length; i++) {
			input[i] = scan.nextInt();
		}

		displayList(input);

		sortList(input);

		averageList(input);

		maxOfList(input);
	}

	public static void displayList(int... input) {

		System.out.println("Array items as entered: ");
		for (int item : input) {
			System.out.print(item + " ");
		}
		System.out.println();

	}

	public static void maxOfList(int... input) {

		int max = 0;

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {

				if (input[i] > input[j]) {
					max = input[i];
					input[j] = input[i];
					input[i] = input[j];
				}

				else {
					max = input[j];
					input[i] = input[j];
					input[j] = input[i];
				}

			}

		}

		System.out.println("Maximum from the array is: " + max);
		System.out.println("");

	}

	public static void sortList(int... input) {
		Arrays.sort(input);

		System.out.println("Array items sorted: ");
		for (int item : input) {
			System.out.print(item + " ");
		}
		System.out.println("");

	}

	public static void averageList(int... input) {

		int avg = 0;

		for (int i = 0; i < input.length; i++) {
			avg = input[i] + avg;
		}
		avg = avg / input.length;

		System.out.println("Average: " + avg);
		System.out.println("");

	}

}
