package com.infosys;

public class Student {

	private int studentId;

	private String name;

	private float qualifyingExamMarks;

	private char residentialStatus;

	private int yearOfEngg;

	Student(int studentId, String name, float qualifyingExamMarks, char residentialStatus, int yearOfEngg) {
		this.studentId = studentId;
		this.name = name;
		this.qualifyingExamMarks = qualifyingExamMarks;
		this.residentialStatus = residentialStatus;
		this.yearOfEngg = yearOfEngg;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}

	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}

	public char getResidentialStatus() {
		
		if (residentialStatus == ('H')) {
			System.out.println("Residential status :   Hostellers");
		} else if (residentialStatus == ('D')) {
			System.out.println("Residential status :   DayScholar");
		} else {
			System.out.println("Residential status :   Unknown");
		}
		
		return residentialStatus;
	}

	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public int getYearOfEngg() {
		return yearOfEngg;
	}

	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}

}
