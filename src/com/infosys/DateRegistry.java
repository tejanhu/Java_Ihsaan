package com.infosys;

import java.time.LocalDate;
import java.util.Date;

public class DateRegistry {

	public static void main(String[] args) {

		AgeFinder ageFinder = new AgeFinder();

		LocalDate dateOfBirth = LocalDate.of(1989, 10, 26);
		int n = 15, year = 1, month = 2, days = 3;

		ageFinder.getAge(dateOfBirth);
		ageFinder.getDateAfterNDays(n);
		ageFinder.getDateAfterXYearYMonthZDays(year, month, days);

	}

}
