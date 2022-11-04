package com.infosys;

public class PerformanceCalculator {

	public static void main(String[] args) {

		Worker employee1 = new Worker();
		Worker employee2 = new Worker();
		Worker employee3 = new Worker();

		employee1.setPoint(10);
		employee2.setPoint(50);
		employee3.setPoint(96);

//		System.out.println(employee1.getPoint());
//		System.out.println(employee2.getPoint());
//		System.out.println(employee3.getPoint());

		System.out.println(PerformanceRating.calculatePerformace(employee1));
		System.out.println(PerformanceRating.calculatePerformace(employee2));
		System.out.println(PerformanceRating.calculatePerformace(employee3));

	}

}
