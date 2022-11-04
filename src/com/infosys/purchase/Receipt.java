package com.infosys.purchase;

import com.infosys.customer.Customer;
import com.infosys.customer.typeofcustomer.Regular;

public class Receipt {

	static double billAmount = 172.2;

	public static void main(String[] args) {

		Customer regularCustomer = new Regular(1001, "John", new long[] { 9980788712L, 9886124566L, 9496781256L },
				"No.333,ABC street, Mysore, Karnataka, 570001");

		PurchaseBill pb = new PurchaseBill(5001, "Cash", 150);

		pb.calculateBillAmount(regularCustomer);

	}

}
