package com.infosys;

import java.util.Scanner;

public class FunCalculator {

	public static boolean checkIfArmstrongNumberMethod1(int n) {

		int tempNum = n, r, sum = 0;

		boolean isArmstrongNumber = false;

		while (n > 0) {
//			 (remainder): 
			r = n % 10;
//			number: 
			n = n / 10;
			sum = sum + r * r * r;
		}

		if (tempNum == sum) {
			isArmstrongNumber = true;
		}

		return isArmstrongNumber;

	}

	public static boolean checkIfLuckyNumberMethod(int m) {

		boolean isLuckyNumber = false;

		String[] numArr = ("" + m).split("");

		int r = 0, tempNum = m, sum = 0, product = 0, i = numArr.length;

		if (i > 2) {

			while (i > 0) {

				r = m % 10;
				m = m / 10;
				if (i % 2 == 0) {
					product = product + r * r;
				}
				i--;
			}

		} else if (i == 2) {
			while (i > 0) {
				r = m % 10;
				m = m / 10;
				product = product + r * r;
				product = product + m * m;
				System.out.println(product);
			}
			i--;

		}

		else

		{
			product = product + m * m;
		}

		if (product % 9 == 0) {
			isLuckyNumber = true;
		}

		return isLuckyNumber;

	}

	public static boolean checkIfArmstrongNumberMehod2(int n) {

		int tempNum = n, secondNum = 0, firstNum = 0, lastNum = 0, orignalNum = n;

		boolean isArmstrongNumber = false;

//		third number (remainder): 3
		lastNum = tempNum % 10;
//		number: 15
		n = n / 10;
//		second number (remainder): 5
		secondNum = n % 10;
		n = n / 10;
//		first number (remainder): 1
		firstNum = n % 10;

		int firstCubedNumber = (int) Math.pow(firstNum, 3.0);
		int secondCubedNumber = (int) Math.pow(secondNum, 3.0);
		int thirdCubedNumber = (int) Math.pow(lastNum, 3.0);
		int sumCubedNumber = firstCubedNumber + secondCubedNumber + thirdCubedNumber;

		if (sumCubedNumber == orignalNum) {
			isArmstrongNumber = true;
		}

		return isArmstrongNumber;

	}

//	public static boolean checkIfArmstrongNumberProperly(int n) {
//
//		int r, sum = 0, temp;
//
//		boolean isArmstrongNumber = false;
//
//		temp = n;
//		while (n > 0) {
//			r = n % 10;
//			sum = sum + (r * r * r);
//			n = n / 10;
//		}
//		if (temp == sum)
//			isArmstrongNumber = true;
//		return isArmstrongNumber;
//
//	}

//	public static boolean checkIfLuckyNumberProperly(int m) {
//		int counter = 2;
//
//		boolean isLuckyNumber = false;
//
//		if (counter > m)
//			isLuckyNumber = true;
//		if (m % counter == 0)
//			isLuckyNumber = false;
//
//		/*
//		 * calculate next position of input no. Variable "next_position" is just for
//		 * readability of the program we can remove it and update in "n" only
//		 */
//		int next_position = m - (m / counter);
//
//		counter++;
//		return checkIfLuckyNumberProperly(next_position);
//	}

	public static void main(String[] args) {

		int n = 153, m = 3;

		Scanner scan = new Scanner(System.in);

		System.out.println("1. Calculate Armstrong");
		System.out.println("2. Calculate Lucky Number");

		System.out.println(" ");
		System.out.println("Your choice is ");
		int choice = scan.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Enter a number: ");
			n = scan.nextInt();
			if (checkIfArmstrongNumberMethod1(n)) {
				System.out.println("The number " + n + " is an Armstrong number");
			} else {
				System.out.println("The number " + n + " is not an Armstrong number");

			}
			break;

		case 2:
			System.out.println("Enter a number: ");
			m = scan.nextInt();
			if (checkIfLuckyNumberMethod(m)) {
				System.out.println("The number " + m + " is a Lucky number");
			} else {
				System.out.println("The number " + m + " is not a Lucky number");

			}
			break;

		default:
			System.out.println("Oops! Invalid choice!");
			break;
		}

	}

}
