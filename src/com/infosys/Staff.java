package com.infosys;

public class Staff {

	private String empName;
	private int empAge;
	private double empSalary;

	public Staff(String empName, int empAge, double empSalary) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}
