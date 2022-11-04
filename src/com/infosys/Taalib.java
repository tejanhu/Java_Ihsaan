package com.infosys;

public class Taalib {

	private String name;
	private int rollNumber;
	private int totalMarks;

	public Taalib(String name, int rollNumber, int totalMarks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.totalMarks = totalMarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	// add toString() method

	@Override
	public String toString() {

		return "Name: " + getName() + "\n Roll Number: " + getRollNumber();
	}

	// add appropriate method for avoiding duplicate Student

	@Override
	public int hashCode() {

		return rollNumber;
	}

	@Override
	public boolean equals(Object obj) {
		Taalib student = (Taalib) obj;
		return this.hashCode() == student.hashCode();
	}

	public String calculateGrade() {

		String grade = "";

		if (totalMarks >= 60) {
			grade = "A";
		} else if (totalMarks < 60 && totalMarks > 40) {
			grade = "B";
		} else if (totalMarks <= 40) {
			grade = "C";
		} else {
			grade = "N/A";
		}

		return grade;

	}

}
