package com.infosys;

public class EmployeeRecords {

	public static void main(String[] args) {
		PermanentEmployee permEmp = new PermanentEmployee("Anil", 101, 10000, 1500, 3);

		permEmp.calculateSalary();

		ContractEmployee contractEmp = new ContractEmployee("Ankit", 102, 500, 10);

		contractEmp.calculateSalary();

	}

}
