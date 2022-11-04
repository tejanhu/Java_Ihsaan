package com.infosys.purchase;

import com.infosys.customer.Customer;

public class PurchaseBill {

	private int billId;

	private double discount = 10.0;

	private double processingFee;

	private String paymentMethod;

	public PurchaseBill(int billId, String paymentMethod, double processingFee) {

		this.billId = billId;
		this.paymentMethod = paymentMethod;
		this.processingFee = processingFee;

	}

	public int getBillId() {
		return billId;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public double getProcessingFee() {
		return processingFee;
	}

	public double getDiscount() {
		return discount;
	}

	public void calculateBillAmount(Customer customer) {

		double finalBillAmount = getDiscount() * Receipt.billAmount;
		finalBillAmount = finalBillAmount + getProcessingFee();

		System.out.println("------------------------------------------");
		System.out.print("------------------------------------------");
		System.out.print("Easy Shop Retail Store Bill");
		System.out.println("Bill Id\t:" + getBillId());
		System.out.println("Customer Id\t:" + customer.getCustomerId());
		System.out.println("Customer Name\t:" + customer.getCustomerName());
		System.out.print("Contact Nos\t:");
		for (long contactNumber : customer.getContactNumbers()) {
			System.out.print(contactNumber + " ");
		}
		System.out.println();
		System.out.println("Address \t:" + customer.getAddress() + " ");
		System.out.println("Discount:" + getDiscount());
		System.out.println("Final bill amount to be paid\t:Rs." + finalBillAmount);
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.print("Thank You!!! Visit Again");

	}

}
