package com.infosys;

public class EnumExercise {

	public static void main(String[] args) {
		
		Pupil student1 = new Pupil();
		student1.setStudentId(1000);
		student1.setName("alvin");
		student1.setTotalMarks(280);
		student1.calculateGrade();
		student1.calculateScholarshipAmount();
		
		System.out.println("Student Details");
		System.out.println("Student Id:" + student1.getStudentId());
		System.out.println("Student Name:" + student1.getName());
		System.out.println("Student Grade:" + student1.getGrade());
		System.out.println("Scholarship Amount:" + student1.getScholarshipAmount());

	}

}
