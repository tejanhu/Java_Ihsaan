package com.infosys;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDateTimeProblem {

	public static String formatDateTime(LocalDate dateObj, LocalTime timeObj) {

		LocalDate localDate = LocalDate.of(dateObj.getYear(), dateObj.getMonth(), dateObj.getDayOfMonth());
		LocalTime localTime = LocalTime.of(timeObj.getHour(), timeObj.getMinute(), timeObj.getSecond());

		ZoneId istZone = ZoneId.of("Asia/Kolkata");

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm:SS");

		String zonedDateTime = ZonedDateTime.of(localDate, localTime, istZone).format(dtf);

		return zonedDateTime;

	}

	public static void main(String[] args) {

		LocalDate departureDate = LocalDate.of(2016, 11, 30);
		LocalTime departureTime = LocalTime.of(21, 30, 00);
		LocalDate arrivalDate = LocalDate.of(2016, 12, 1);
		LocalTime arrivalTime = LocalTime.of(06, 00, 00);

		System.out.print("Departure Time - ");
		System.out.print(formatDateTime(departureDate, departureTime));
		System.out.println();
		System.out.print("Arrival Time - ");
		System.out.print(formatDateTime(arrivalDate, arrivalTime));

	}

}
