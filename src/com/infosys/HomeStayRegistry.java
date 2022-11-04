package com.infosys;

public class HomeStayRegistry {

	public static void main(String[] args) {
		RoomDetails roomBillRegistry = new RoomDetails("James Whitaker", "Deluxe", 2, 15);

		System.out.println("BillId: " + roomBillRegistry.getBillID());
		System.out.println("Customer Name: " + roomBillRegistry.getCustomerName());
		System.out.println("No. of days of Stay: " + roomBillRegistry.getNoOfDaysOfStay());
		System.out.println("Total Bill: " + roomBillRegistry.calculateBill() + "Rs.");
	}

}
