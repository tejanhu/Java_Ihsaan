package com.infosys;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class WorkerService {
	// lop --- method
	public static long calculateLOPs(String startDateLOP, String endDateLOP) throws ParseException {
		SimpleDateFormat formatt = new SimpleDateFormat("dd/MM/yyyy");
		Date start = formatt.parse(startDateLOP);
		Date end = formatt.parse(endDateLOP);
		long diff = end.getTime() - start.getTime();
		long lops = diff / (24 * 60 * 60 * 1000);
		return lops;
	}

	// Other fields and methods

	public static long calculateLOPsUsingChronoUnit(String startDateLOP, String endDateLOP) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate start = LocalDate.parse(startDateLOP, formatter);

		LocalDate end = LocalDate.parse(endDateLOP, formatter);

		return ChronoUnit.DAYS.between(start, end);

	}

	public static void main(String[] args) {

//		try {
//			System.out.println(calculateLOPs("23/12/2021", "3/1/2022"));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println(calculateLOPsUsingChronoUnit("13/12/2021", "23/12/2021"));

	}
}
