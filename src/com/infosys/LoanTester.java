package com.infosys;

public class LoanTester {
	public static void main(String[] args) {
		// Create 2 objects of Loan class using the default and 2 using parametrized
		// constructor.
		Loan loanA = new Loan();
		Loan loanB = new Loan();
		Loan loanC = new Loan(1523, 100, 500.00f, 1, 0.10f);
		Loan loanD = new Loan(1547, 200, 800.00f, 2, 0.25f);
		// Use getter methods and display the value of loanCounter for every instance
		System.out.println(Loan.getLoanCounter());
	}
}
