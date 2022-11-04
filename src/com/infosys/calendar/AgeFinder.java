package com.infosys.calendar;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class AgeFinder {
	public int getAge(Calendar dateOfBirth) {
		int age;

		Calendar currentCalendarDate = Calendar.getInstance();

		LocalDate currentDate = LocalDate.of(currentCalendarDate.get(Calendar.YEAR),
				currentCalendarDate.get(Calendar.MONTH) + 1, currentCalendarDate.get(Calendar.DATE));
		LocalDate birthDate = LocalDate.of(dateOfBirth.get(Calendar.YEAR), dateOfBirth.get(Calendar.MONTH) + 1,
				dateOfBirth.get(Calendar.DATE));

		int currentYear = currentCalendarDate.get(Calendar.YEAR);
		int birthYear = dateOfBirth.get(Calendar.YEAR);

		int currentMonth = currentCalendarDate.get(Calendar.MONTH);
		int birthMonth = dateOfBirth.get(Calendar.MONTH);

		if (currentMonth >= birthMonth) {
			age = currentYear - birthYear;
		} else {
			age = Period.between(currentDate, birthDate).getYears();
		}

		return age;

	}

	public Date getDateAfterNDays(int noOfDays) {

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, noOfDays);
		TimeZone istTime = TimeZone.getTimeZone("IST");
		TimeZone.setDefault(istTime);

		Date newDate = cal.getTime();

		return newDate;

	}

	public Calendar getDateAfterXYearYMonthZDays(int year, int month, int day) {

		Calendar newDateAfterXYearYMonthZDays = Calendar.getInstance();

		newDateAfterXYearYMonthZDays.add(Calendar.YEAR, year);

		newDateAfterXYearYMonthZDays.add(Calendar.MONTH, month);

		newDateAfterXYearYMonthZDays.add(Calendar.DATE, day);
		return newDateAfterXYearYMonthZDays;

	}
}
