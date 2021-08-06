package com.java.development.multidimensionalarrays;

public class Application {
	public static void main(String[] args) {

		int[][] matrix = { { 2, 4, 6, 8 }, { 3, 6, 9 }, { 2, 5, 7, 11, 13 } };

		System.out.println(matrix[2][2]);
		System.out.println(matrix[1][1]);

		String[][] words = new String[4][5];

		words[2][2] = "Boomerang";

		System.out.println(words[2][2]);

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + "\t");
			}
			System.out.println();
		}

		String[][] laptopBrands = new String[2][];

		laptopBrands[0] = new String[3];

		laptopBrands[0][2] = "Dell".toUpperCase();

		laptopBrands[0][1] = "Macintosh".toUpperCase();

		laptopBrands[0][0] = "Hp Pavillion".toUpperCase();

		System.out.println(laptopBrands[0][2]);

		System.out.println(laptopBrands[0][1]);

		System.out.println(laptopBrands[0][0]);

		laptopBrands[1] = new String[3];

		laptopBrands[1][0] = "Toshiba".toUpperCase();

		laptopBrands[1][1] = "Samsung".toUpperCase();

		laptopBrands[1][2] = "Fujitsu".toUpperCase();

		System.out.println(laptopBrands[1][2]);

		System.out.println(laptopBrands[1][1]);

		System.out.println(laptopBrands[1][0]);

	}
}
