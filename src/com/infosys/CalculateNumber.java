package com.infosys;

import java.util.Scanner;

class CalculateNumber {

	public void cLuckyNumber(int num) {
		String intString = Integer.toString(num);
		int rem;
		int evenSumNum = 0;
		int indexNum;
		while (num > 0) {
			rem = num % 10;
			indexNum = intString.indexOf(Integer.toString(rem)) + 1;
			if (indexNum % 2 == 0) {
				evenSumNum = evenSumNum + rem * rem;
			}
			num = num / 10;
		}
		// Check to see if number is divisible by 9
		if (evenSumNum % 9 == 0) {
			System.out.println("\nLucky Number: " + evenSumNum);
		}
	}
}
