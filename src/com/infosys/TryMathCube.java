package com.infosys;

import java.util.Scanner;

public class TryMathCube {
	public int cube(int n) {
		return n * n * n;
	}

	public static void main(String[] args) {
		TryMathCube tc = new TryMathCube();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number");

		int num = s.nextInt();

		try {

			System.out.println(tc.cube(num));

		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}

	}
}
