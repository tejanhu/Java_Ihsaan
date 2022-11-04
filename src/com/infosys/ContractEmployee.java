package com.infosys;

public class ContractEmployee extends Employee {

	private double wages;

	private int hours;

	public ContractEmployee(String name, int empId, double wages, int hours) {
		super(empId, name, 0);
		this.wages = wages;
		this.hours = hours;
	}

	public double getWages() {
		return wages;
	}

	public void setWages(double wages) {
		this.wages = wages;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void calculateSalary() {
		double salary;
		salary = hours * wages;
		System.out.println("Contract Employee: Your salary is: " + salary);
	}

}
