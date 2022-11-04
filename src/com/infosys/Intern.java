package com.infosys;

public class Intern implements DataProvider {

	private int marksSecured;
	private int graceMarks;

	Intern(int marksSecured, int graceMarks) {
		this.marksSecured = marksSecured;
		this.graceMarks = graceMarks;
	}

	@Override
	public void calcPercentage() {

		double totalMarks;

		totalMarks = graceMarks + marksSecured;

		if (totalMarks > totalMaximumMarks) {
			System.out.println("Please enter the correct marks");
		}

		else {
			totalMarks = (totalMarks / totalMaximumMarks) * 100;
			System.out.println("The total aggregate percentage secured is " + totalMarks);

		}

	}

}
