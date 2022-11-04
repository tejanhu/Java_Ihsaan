package com.infosys;

public class DataRunner {

	public static void main(String[] args) {

		DataProvider intern = new Intern(5000, 500);

		intern.calcPercentage();

		DataProvider intern2 = new Intern(8000, 500);

		intern2.calcPercentage();

		DataProvider trainee = new Trainee(6000);

		trainee.calcPercentage();

	}

}
