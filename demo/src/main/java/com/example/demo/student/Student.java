package com.example.demo.student;

import java.time.LocalDate;

public class Student {
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getDob() {
		return dob;
	}
	



	@Override
	public String toString() {
		return "Student{"+"id=" + id + ", name='" + name + '\'' + ", age=" + age + ", email='" + email + '\'' + ", dob=" + dob + "}";
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	private Long id;
	private String name;
	private String email;
	private Integer age;
	private LocalDate dob;

	public Student() {
		
	}
	
	
	public Student(Long id, String name, String email, Integer age, LocalDate dob) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.dob = dob;
	}
	public Student(String name, Integer age, String email, LocalDate dob) {
		
		this.name = name;
		this.email = email;
		this.age = age;
		this.dob = dob;
	}


}
