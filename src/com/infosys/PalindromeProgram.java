package com.infosys;

public class PalindromeProgram {

	public static boolean checkIfPalindromeOriginalMethod() {
		int number = 45687;
		int copy = number, reverse = 0;
		while (number > 0) {
			reverse = (reverse * 10) + number % 10;
			number /= 10;
		}
		

		return reverse == copy;

	}

	public static boolean checkIfPalindromeStringBuilderMethod(int n) {

		String num = "" + n;

		int m = 0;

		boolean isPalindrome = false;

		StringBuilder sb = new StringBuilder(num);

		m = Integer.parseInt(sb.reverse().toString());

		if (m == n) {
			isPalindrome = true;
			System.out.println(n + " is a palindrome number!");
		}

		else {
			System.out.println(n + " is not a palindrome number!");
		}

		return isPalindrome;

	}
	
	public static boolean checkIfPalindromeStringBufferMethod(int n) {

		String num = "" + n;

		int m = 0;

		boolean isPalindrome = false;

		StringBuffer sb = new StringBuffer(num);

		m = Integer.parseInt(sb.reverse().toString());

		if (m == n) {
			isPalindrome = true;
			System.out.println(n + " is a palindrome number!");
		}

		else {
			System.out.println(n + " is not a palindrome number!");
		}

		return isPalindrome;

	}

	public static void main(String[] args) {

		System.out.println(checkIfPalindromeOriginalMethod());

		int n = 101;

		checkIfPalindromeStringBuilderMethod(n);

		checkIfPalindromeStringBufferMethod(n);

	}
}
