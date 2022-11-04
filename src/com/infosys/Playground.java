package com.infosys;

import java.util.Scanner;

public class Playground {
	public static void main(String[] args) {
		CalculateNumber cn = new CalculateNumber();
		Scanner scn = new Scanner(System.in);
		//
		System.out.println("2. Calculate Lucky Number" + "\n\nSelect Number:");
		int choice = scn.nextInt();
		//
		System.out.println("Enter Number to Calculate: ");
		int num = scn.nextInt();
		//
		switch (choice) {

		case 2:
			System.out.println("\nYou have chosen Lucky Number Calculation");
			cn.cLuckyNumber(num);
			break;

		}

	}
}
