package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class StudentService {

	public List<Student> getStudents() {
		return List.of(new Student(1L, "Haresh", "haresh.gujar@yahoo.com", 32, LocalDate.of(1989, Month.OCTOBER, 29)));

	}
}
