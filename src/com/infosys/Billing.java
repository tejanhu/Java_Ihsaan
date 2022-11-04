package com.infosys;

public class Billing {

	private int billId;
	private int customerId;
	private double discount;
	private double billAmount;
	private double discountedBillAmount;

	public Billing(int billId, int customerId, double discount, double billAmount) {
		this.billId = billId;
		this.customerId = customerId;
		this.discount = discount;
		this.billAmount = billAmount;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public double calculateDiscountedBillAmount() {

		discountedBillAmount = billAmount - (billAmount * (discount / 100));

		return discountedBillAmount;
	}

	@Override
	public String toString() {
		return "Bill Id: " + getBillId() + "\n Customer Id: " + getCustomerId() + "\n Discount: " + getDiscount()
				+ "\n Bill Amount: " + getBillAmount() + "\n Discounted Bill Amount: "
				+ calculateDiscountedBillAmount();
	}

}
