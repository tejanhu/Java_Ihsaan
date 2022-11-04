package com.infosys;

public enum Grade {

	A(5000), B(4000), C(3000), D(2000), E(1000);

	private int scholarshipAmount;

	Grade(int scholarshipAmount) {
		this.scholarshipAmount = scholarshipAmount;
	}

	public int getScholarshipAmount() {
		return scholarshipAmount;
	}

}
