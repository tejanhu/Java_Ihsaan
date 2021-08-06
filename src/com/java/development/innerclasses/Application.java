package com.java.development.innerclasses;

public class Application {

	public static void main(String[] args) {

		Employee emp = new Employee(001, "Ahmed", "password1234");
		
		emp.work();
		
		Employee.Brain brain = emp.new Brain();
		
		brain.think();
		
		Employee.Heart heart = new Employee.Heart();
		heart.beat();
		
		
	}

}
