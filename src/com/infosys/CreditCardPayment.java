package com.infosys;

public class CreditCardPayment extends RRPaymentServices {

	private static int counter = 1000;
	private String paymentID;
	private double cashBack;
	private double balanceDue;

	public CreditCardPayment(double balance, int customerID) {
		super(balance, customerID);
		counter = counter + 1;
		paymentID = "C" + String.valueOf(counter);
	}

	public String getPaymentID() {
		return paymentID;
	}

	@Override
	public int getCustomerID() {
		// TODO Auto-generated method stub
		return super.getCustomerID();
	}

	@Override
	public void setBalance(double balance) {
		super.setBalance(balance);

	}

	@Override
	public void payBill(double amount) {

		char[] remainingPartOfPaymentID[] = { getPaymentID().substring(1, getPaymentID().length()).toCharArray() };
		int[] remainingPartOfPaymentIDInt = new int[4];
		int temp = 0;
		for (int i = 0; i < remainingPartOfPaymentID.length; i++) {
			temp = Integer.parseInt("" + remainingPartOfPaymentIDInt[i]);
			remainingPartOfPaymentIDInt[i] = temp;
		}

		if (getPaymentID().startsWith("C") && remainingPartOfPaymentIDInt.length == 4) {
			balanceDue = amount > getBalance() ? 0 : getBalance() - amount;
			if (amount > getBalance()) {
				cashBack = amount - getBalance();
				System.out.println("Congratulations!! You have successfully made a payment of Rs." + amount
						+ " . Payment Details are-");
				System.out.println(
						"**************************************************************************************************");
				System.out.println("Customer ID\t:" + getCustomerID());
				System.out.println("Payment ID\t:" + getPaymentID());
				System.out.println("Previous Due\t:Rs." + getBalance());
				System.out.println("Remaining Due\t:Rs." + balanceDue);
				System.out.println("Cashback wallet Balance\t:Rs." + cashBack);
				System.out.println();

			} else if (amount < getBalance() && amount == 0) {
				System.out.println("Congratulations!! You have successfully made a payment of Rs." + amount
						+ " . Payment Details are-");
				System.out.println(
						"**************************************************************************************************");
				System.out.println("Customer ID\t:" + getCustomerID());
				System.out.println("Payment ID\t:" + getPaymentID());
				System.out.println("Previous Due\t:Rs." + getBalance());
				System.out.println("Remaining Due\t:Rs." + balanceDue);
				System.out.println();
			} else {
				System.out.println("Congratulations!! You have successfully made a payment of Rs." + amount
						+ " . Payment Details are-");
				System.out.println(
						"**************************************************************************************************");
				System.out.println("Customer ID\t:" + getCustomerID());
				System.out.println("Payment ID\t:" + getPaymentID());
				System.out.println("Previous Due\t:Rs." + getBalance());
				System.out.println("Remaining Due\t:Rs." + balanceDue);
				System.out.println("Cashback wallet Balance\t:Rs." + cashBack);
				System.out.println();

			}

		}
	}

}
