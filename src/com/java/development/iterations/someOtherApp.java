package com.java.development.iterations;

public class someOtherApp {

	public static void main(String[] args) {
		for (char i = 'A'; i <= 'C'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
