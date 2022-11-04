package com.infosys.customer;

public class Customer {

	private int customerId;
	String customerName;
	private long contactNumbers[];
	private String address;

	protected Customer(int customerId, String customerName, long[] contactNumbers, String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumbers = contactNumbers;
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long[] getContactNumbers() {
		return contactNumbers;
	}

	public void setContactNumbers(long[] contactNumbers) {
		this.contactNumbers = contactNumbers;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
