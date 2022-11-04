package com.infosys;

import java.time.LocalDate;
import java.time.Period;

public class AgeFinder {
	public int getAge(LocalDate dateOfBirth) {

		LocalDate todaysDate = LocalDate.now();
		int age = 0;
		Period period;

		if (dateOfBirth.getDayOfMonth() >= todaysDate.now().getDayOfMonth()) {
			age = todaysDate.getYear() - dateOfBirth.getYear();
		} else {
			period = Period.between(dateOfBirth, todaysDate);
			age = period.getYears();
		}
		System.out.println("Your age is: " + age + " years");
		return age;
	}

	public LocalDate getDateAfterNDays(int noOfDays) {

		LocalDate newDateAfterNdays = LocalDate.now().plusDays(noOfDays);

		System.out.println("The date after " + noOfDays + " days is: " + newDateAfterNdays);

		return newDateAfterNdays;

	}

	public LocalDate getDateAfterXYearYMonthZDays(int year, int month, int day) {
		LocalDate newDateAfterXYearYMonthZDays = LocalDate.now().plusYears(year);
		newDateAfterXYearYMonthZDays.plusMonths(month);
		newDateAfterXYearYMonthZDays.plusDays(day);

		System.out.println("The date after " + year + " year, " + month + " months and " + day + " days is: "
				+ newDateAfterXYearYMonthZDays);

		return newDateAfterXYearYMonthZDays;
	}
}
