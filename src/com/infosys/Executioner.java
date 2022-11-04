package com.infosys;

public class Executioner {

	public static void main(String[] args) {

		RRPaymentServices creditCard1 = new CreditCardPayment(10000.23, 5001);

		creditCard1.payBill(15000.0);

		RRPaymentServices creditCard2 = new CreditCardPayment(10000.23, 5001);

		creditCard2.payBill(0);

		RRPaymentServices creditCard3 = new CreditCardPayment(10000.23, 5001);

		creditCard3.payBill(5000);

		RRPaymentServices shoppingCard1 = new ShoppingPayment(5000.0, 561328);

		shoppingCard1.payBill(5000.0);

		RRPaymentServices shoppingCard2 = new ShoppingPayment(5000.0, 561328);

		shoppingCard2.payBill(6000.0);

		RRPaymentServices shoppingCard3 = new ShoppingPayment(5000.0, 561328);

		shoppingCard3.payBill(4000.0);

	}

}
