package com.infosys;

public class EmployeeRecord {

	public static double getAverageSalary(double salary[]) {
		double avg = 0;

		for (int i = 0; i < salary.length; i++) {
			avg = avg + salary[i];
		}

		avg = avg / salary.length;

		return avg;
	}

	public static int getSalaryGreaterThanAvg(double salary[]) {

		double avg = getAverageSalary(salary);
		int count = 0;

		for (int i = 0; i < salary.length; i++) {
			if (salary[i] > avg) {
				count++;
			}
		}

		return count;

	}

	public static int getSalaryLesserThanAvg(double salary[]) {

		double avg = getAverageSalary(salary);
		int count = 0;

		for (int i = 0; i < salary.length; i++) {
			if (salary[i] < avg) {
				count++;
			}
		}

		return count;

	}

	public static void main(String[] args) {

		double salary[] = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };

		System.out.println("The average salary of the employee is :" + getAverageSalary(salary));

		System.out.println("The number of employees having salary greater than the average is :" + getSalaryGreaterThanAvg(salary));

		System.out.println("The number of employees having salary lesser than the average is :" +getSalaryLesserThanAvg(salary));

	}

}
