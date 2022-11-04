package com.infosys;

public class ReverseCalculator {

	public static int reverseNumberUsingWhileLoop(int n) {

		int tempNo = n, remainder = 0, reverseNo = 0;

		while (tempNo > 0) {

			remainder = tempNo % 10;

			reverseNo = reverseNo * 10 + remainder;

			tempNo = tempNo / 10;

		}

		return reverseNo;

	}

	public static int reverseNumberUsingDoWhileLoop(int n) {

		int tempNo = n, remainder = 0, reverseNo = 0;

		do {
			remainder = tempNo % 10;

			reverseNo = reverseNo * 10 + remainder;

			tempNo = tempNo / 10;

		}

		while (tempNo > 0);

		return reverseNo;

	}

	public static int reverseNumberUsingForLoop(int n) {

		int remainder = 0, reverseNo = 0;

		for (int tempNo = n; tempNo > 0;) {
			remainder = tempNo % 10;

			reverseNo = reverseNo * 10 + remainder;

			tempNo = tempNo / 10;

		}

		return reverseNo;

	}

	public static void main(String[] args) {

		int n = 23;

		System.out.println("The original number given is: " + n);

		System.out.print("(Using while loop) The reverse number given is:  ");

		System.out.println(reverseNumberUsingWhileLoop(n));

		System.out.print("(Using Do-while loop) The reverse number given is: ");

		System.out.println(reverseNumberUsingDoWhileLoop(n));

		System.out.print("(Using For loop) The reverse number given is: ");

		System.out.println(reverseNumberUsingForLoop(n));
	}

}
