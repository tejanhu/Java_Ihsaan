package com.infosys;

public class PermanentEmployee extends Employee {

	private double basicPay;
	private double hra;
	private int experience;

	PermanentEmployee(String name, int empId, double basicPay, double hra, int experience) {
		super(empId, name, 0);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void calculateSalary() {
		double salary;
		double variable;

		if (experience < 3) {
			variable = 0;
		} else if (experience >= 3 || experience < 5) {
			variable = 0.05 * basicPay;
		} else if (experience >= 5 || experience < 10) {
			variable = 0.07 * basicPay;
		} else {
			variable = 0.12 * basicPay;
		}

		salary = variable + basicPay + hra;
		System.out.println("Permanent Employee: Your salary is: " + salary);
	}

}
