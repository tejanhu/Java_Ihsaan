 package com.java.development.innerclasses;

public class Employee {

	private int empId;
	private String username;
	private String password;
	
	
	//	Nested Inner Class
	public class Brain{
		public void think() {
			System.out.println("Employee " + empId + " is thinking.");
		}
	}
	
	// Static Inner Class
	public static class Heart{
		public void beat() {
			// This will not work as empId is not a static variable, will only work if empId is a static variable			
			//	System.out.println("Employee " + empId + " heart is beating...");
			System.out.println("Heart is beating...");
		}
	}
	
	
	
	public Employee(int empId, String username, String password){
		this.empId = empId;
		this.username = username;
		this.password = password;
	}
	
	public void work() {
		System.out.println("Employee " + empId + " is now working ");
		
		Brain brain = new Brain();
		brain.think();
		
		// Local Class
		class Temp{
			public void login() {
				System.out.println("Username is: " + username);
				System.out.println("Password is: " + password);
			}
		}
		
		Temp temp = new Temp();
		temp.login();
	}
}
