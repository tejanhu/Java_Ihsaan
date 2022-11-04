package com.infosys;

public class StudentTester {

	public static void main(String[] args) {
		// Create an object of Student class
		Student jacob = new Student(0, null, 0, ' ', 0);
		Student peter = new Student(0, null, 0, ' ', 0);

		// Use setter methods to set the values
		jacob.setStudentId(1001);
		jacob.setName("Jacob");
		jacob.setQualifyingExamMarks(80);
		jacob.setResidentialStatus('H');
		jacob.setYearOfEngg(3);

		peter.setStudentId(1002);
		peter.setName("Peter");
		peter.setQualifyingExamMarks(83);
		peter.setResidentialStatus('D');
		peter.setYearOfEngg(2);
		// Use getter methods with proper escape sequences to display values

	

		System.out.println("Output: ");
		System.out.println(" ");
		System.out.println("Student Name\t: " + jacob.getName());
		System.out.println("Student Id\t: " + jacob.getStudentId());
		System.out.println("Qualifying marks\t: " + jacob.getQualifyingExamMarks());
		System.out.println("Year of Engineering\t: " + jacob.getYearOfEngg());
		jacob.getResidentialStatus();

		System.out.println();

		System.out.println("Output: ");
		System.out.println(" ");
		System.out.println("Student Name\t: " + peter.getName());
		System.out.println("Student Id\t: " + peter.getStudentId());
		System.out.println("Qualifying marks\t: " + peter.getQualifyingExamMarks());
		System.out.println("Year of Engineering\t: " + peter.getYearOfEngg());
		peter.getResidentialStatus();

//		System.out.println();
	}
}
