package com.infosys;

public class EmployeeService {

	public void checkEmployeeSalary(Staff emp) throws EmpSalaryException {

		if (emp.getEmpSalary() < 1000) {
			throw new EmpSalaryException("Too Low Salary Exception");
		}

	}

	public static void main(String[] args) {

		Staff e1 = new Staff("Joe Smith", 20, 5345);
		Staff e2 = new Staff("Lewis Jane", 21, 1345);
		Staff e3 = new Staff("Larry Page", 22, 245);
		Staff e4 = new Staff("Smith James", 23, 945);
		Staff e5 = new Staff("Elvis George", 25, 1425);
		EmployeeService empser = new EmployeeService();
		Staff[] emparray = { e1, e2, e3, e4, e5 };
		for (Staff employee : emparray) {
			// call check employee with appropriate exception handling code
			try {
				empser.checkEmployeeSalary(employee);
			} catch (EmpSalaryException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage() + ":\n" + employee.getEmpName() + " has too low of a salary!");
			}

		}

	}

}
