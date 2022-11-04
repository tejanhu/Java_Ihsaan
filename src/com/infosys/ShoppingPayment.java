package com.infosys;

public class ShoppingPayment extends RRPaymentServices {

	private static int counter = 1000;
	private String paymentID;

	public ShoppingPayment(double balance, int customerID) {
		super(balance, customerID);
		counter = counter + 1;
		paymentID = "S" + String.valueOf(counter);
	}

	public String getPaymentID() {
		return paymentID;
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

		if (getPaymentID().startsWith("S") && remainingPartOfPaymentIDInt.length == 4) {
			if (amount == getBalance()) {
				System.out.println("Congratulations!! Your payment of Rs." + amount
						+ " is successful with the payment id $" + this.getPaymentID());
				System.out.println();
				counter++;
			} else if (amount > getBalance()) {
				System.out.println("Excess amount entered!!!Please try again.");
				System.out.println();

			} else {
				System.out.println("Insufficient amount entered!!Please try again.");
				System.out.println();

			}

		}
	}

}
