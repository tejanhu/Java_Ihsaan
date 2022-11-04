package com.infosys;

public class PerformanceRating {

	private final static int Outstanding = 5;
	private final static int Good = 4;
	private final static int Average = 3;
	private final static int Poor = 2;

	static int calculatePerformace(Worker worker) {

		int rating = 0;

		if (worker.getPoint() == 41 || worker.getPoint() <= 49) {
			rating = Poor;
			System.out.println("Employee performance Rating is : Poor");
		} else if (worker.getPoint() == 50 || worker.getPoint() <= 59) {
			rating = Average;
			System.out.println("Employee performance Rating is : Average");
		} else if (worker.getPoint() == 60 || worker.getPoint() <= 79) {
			rating = Good;
			System.out.println("Employee performance Rating is : Good");
		} else if (worker.getPoint() == 80 || worker.getPoint() <= 99) {
			rating = Outstanding;
			System.out.println("Employee performance Rating is : Outstanding");
		}

		return rating;

	}

}
