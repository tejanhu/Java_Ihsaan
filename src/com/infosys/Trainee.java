package com.infosys;

public class Trainee implements DataProvider {

	private int marksSecured;

	public Trainee(int marksSecured) {
		this.marksSecured = marksSecured;
	}

	@Override
	public void calcPercentage() {

		double totalMarks;

		totalMarks = marksSecured;
		totalMarks = (totalMarks / totalMaximumMarks) * 100;

		System.out.println(totalMarks);

		System.out.println("The total aggregate percentage secured is " + totalMarks);

	}

}
