package com.infosys;

public class StudentRegistration {

	private String studentName;
	private double age;
	private int admissionNumber;
	private int rollNumber;
	static int counter = 1001;

	public StudentRegistration(String studentName, double age, int admissionNumber) {
		this.studentName = studentName;
		this.age = age;
		this.admissionNumber = admissionNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public double getAge() {
		return age;
	}

	public int getAdmissionNumber() {
		return admissionNumber;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void generateRollNumber() {

		rollNumber = counter;

		System.out.println("Student Details");
		System.out.println("**************************");
		System.out.println("Student Name\t:" + getStudentName());
		System.out.println("Admission Number\t:" + getAdmissionNumber());
		System.out.println("Roll Number\t:" + getRollNumber());

		counter++;

	}

	@Override
	public int hashCode() {
		return admissionNumber;
	}

	@Override
	public boolean equals(Object obj) {
		StudentRegistration studentRegistration = (StudentRegistration) obj;

		boolean doesExists = false;

		doesExists = this.getStudentName().equals(studentRegistration.getStudentName())
				&& this.getAdmissionNumber() == studentRegistration.getAdmissionNumber();

		if (doesExists) {

			System.out.println("Roll number already generated for the student!!");

		} else {
			generateRollNumber();
		}

		return doesExists;
	}

}
