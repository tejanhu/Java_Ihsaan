package com.infosys;

public class RegistrationRecord {
	public static void main(String[] args) {
		Registration register = new Registration("Kevin", "MN9891N", new long[] { 9452425421L, 7676765252L });
		Registration register2 = new Registration("Julias", 123, "PN7878", new long[] { 2345615451L, 6763562562L });
		Registration register3 = new Registration("Jammy", 45453, 765, new long[] { 9634524353L, 9887373737L });
		Registration register4 = new Registration("Rose", "PN8934", 34356, new long[] { 9867456367L, 7645367356L });

		System.out.println("Congratulations " + register.getCustomerName()
				+ "!!! you have been successfully registered for our services with the following details:\n"
				+ "Passport number:" + register.getPassportNo() + "\nPhone numbers:");
		for (long phoneNums : register.getTelephoneNo()) {
			System.out.println(phoneNums);
		}
		System.out.println();

		System.out.println("Congratulations " + register2.getCustomerName()
				+ "!!! you have been successfully registered for our services with the following details:\n"
				+ "License number:" + register2.getLicenseNo() + "\nPan card number:" + register2.getPanCardNo()
				+ "\nPhone numbers:");
		for (long phoneNums : register2.getTelephoneNo()) {
			System.out.println(phoneNums);
		}
		System.out.println();

		System.out.println("Congratulations " + register3.getCustomerName()
				+ "!!! you have been successfully registered for our services with the following details:\n"
				+ "Voter id:" + register3.getVoterId() + "\nLicense number:" + register3.getLicenseNo()
				+ "\nPhone numbers:");
		for (long phoneNums : register3.getTelephoneNo()) {
			System.out.println(phoneNums);
		}
		System.out.println();

		System.out.println("Congratulations " + register4.getCustomerName()
				+ "!!! you have been successfully registered for our services with the following details:\n"
				+ "Pan card number:" + register4.getPanCardNo() + "\nVoter id:" + register4.getVoterId()
				+ "\nPhone numbers:");
		for (long phoneNums : register4.getTelephoneNo()) {
			System.out.println(phoneNums);
		}

	}
}
