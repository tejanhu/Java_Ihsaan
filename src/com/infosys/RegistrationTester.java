package com.infosys;

public class RegistrationTester {

	public static void main(String[] args) {

		StudentRegistration studentRegistration = new StudentRegistration("Peter", 23, 5001);
		StudentRegistration studentRegistration2 = new StudentRegistration("Peter", 24, 5003);
		StudentRegistration studentRegistration3 = new StudentRegistration("Peter", 24, 5001);

		studentRegistration.generateRollNumber();

		studentRegistration.equals(studentRegistration2);

		studentRegistration.equals(studentRegistration3);

	}

}
