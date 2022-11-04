package com.infosys;

public class Tester {

	public static void main(String[] args) {
		LocationChanger lc1 = new LocationChanger("Annabelle Michael", "BL003,Delhi,STP");
		LocationChanger lc2 = new LocationChanger("Jissele James", "FL091,Pune,SEZ");

		lc1.welcomeEmployee();
		lc1.checkCity();
		lc1.editAddress();
		System.out.println("");
		lc2.welcomeEmployee();
		lc2.checkCity();
		lc2.editAddress();
	}

}
