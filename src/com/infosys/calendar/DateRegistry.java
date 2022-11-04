package com.infosys.calendar;

import java.time.LocalDate;
import java.util.Calendar;

public class DateRegistry {

	public static void main(String[] args) {

		AgeFinder ageFinder = new AgeFinder();

		int n = 15, year = 1, month = 2, days = 3;

		Calendar birthDate = Calendar.getInstance();
		birthDate.set(1988, 12, 31);

		System.out.println("Your age is: " + ageFinder.getAge(birthDate) + " years");
		System.out.println("Date after " + n + " days from today: " + ageFinder.getDateAfterNDays(n));
		System.out.println("Date after " + year + " year " + month + " months and " + days + " days from today :"
				+ ageFinder.getDateAfterXYearYMonthZDays(year, month, days).getTime());

	}

}
