package com.infosys;

public class Cashier {

	public static void main(String[] args) {
		Billing bill1 = new Billing(0, 0, 0, 0);
		Billing bill2 = new Billing(0, 0, 0, 0);

		bill1.setBillId(1001);
		bill1.setCustomerId(101);
		bill1.setDiscount(2);
		bill1.setBillAmount(199.99);

		System.out.println(bill1);

		bill2.setBillId(1002);
		bill2.setCustomerId(102);
		bill2.setDiscount(4);
		bill2.setBillAmount(210.5);

		System.out.println(bill2);

	}

}
