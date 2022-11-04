package com.infosys;

public class Pupil {

	private int studentId;
	private String name;
	private Grade grade;
	private int scholarshipAmount;
	private int totalMarks;

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Grade getGrade() {
		return grade;
	}

	public int getScholarshipAmount() {
		return scholarshipAmount;
	}

	public void calculateGrade() {
		if (totalMarks >= 250) {
			grade = Grade.A;
		} else if (totalMarks >= 200 && totalMarks < 250) {
			grade = Grade.B;
		} else if (totalMarks >= 175 && totalMarks < 200) {
			grade = Grade.C;
		} else if (totalMarks >= 150 && totalMarks < 175) {
			grade = Grade.D;
		} else {
			grade = Grade.E;
		}
	}

	public void calculateScholarshipAmount() {

		Grade A = Grade.A;
		Grade B = Grade.B;
		Grade C = Grade.C;
		Grade D = Grade.D;

		switch (grade) {
		case A:
			scholarshipAmount = 5000;
			break;
		case B:
			scholarshipAmount = 4000;
			break;
		case C:
			scholarshipAmount = 3000;
			break;
		case D:
			scholarshipAmount = 2000;
			break;
		default:
			scholarshipAmount = 0;
		}
	}

//	public void calculateScholarshipAmount() {
//		scholarshipAmount = grade.getScholarshipAmount();
//	}

}
