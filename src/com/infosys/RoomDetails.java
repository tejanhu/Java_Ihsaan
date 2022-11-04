package com.infosys;

public class RoomDetails implements RoomBillComponent {

	int billId;
	String customerName;
	String typeOfRoom;
	int noOfExtraPersons;
	int noOfDaysOfStay;
	static int counter;

	public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPersons, int noOfDaysOfStay) {
		this.customerName = customerName;
		this.typeOfRoom = typeOfRoom;
		this.noOfExtraPersons = noOfExtraPersons;
		this.noOfDaysOfStay = noOfDaysOfStay;
		counter = 101;
		billId = counter;
		counter++;
	}

	public int getBillID() {
		return billId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getTypeOfRoom() {
		return typeOfRoom;
	}

	public int getNoOfExtraPersons() {
		return noOfExtraPersons;
	}

	public int getNoOfDaysOfStay() {
		return noOfDaysOfStay;
	}

	public boolean validateNoOfDaysOfStay() {
		String message = "";
		Boolean validatedNoOfDaysOfStay;
		if (getNoOfDaysOfStay() <= 15) {
			validatedNoOfDaysOfStay = true;
		} else {
			message = "Based on the number of days you requested to stay, you are not permitted!";
			validatedNoOfDaysOfStay = false;
		}
		System.out.println(message);
		return validatedNoOfDaysOfStay;
	}

	public boolean validateNoOfExtraPerson() {
		String message = "";
		Boolean validatedNoOfExtraPerson;
		if (getNoOfExtraPersons() <= 2) {
			validatedNoOfExtraPerson = true;
		} else {
			message = "Based on the number of extra people you requested to add, you are not permitted!";
			validatedNoOfExtraPerson = false;
		}
		System.out.println(message);
		return validatedNoOfExtraPerson;
	}

	public boolean validateTypeOfRoom() {
		String message = "";
		Boolean validatedTypeOfRoom;
		if (getTypeOfRoom().equals("Standard") || getTypeOfRoom().equals("Deluxe")
				|| getTypeOfRoom().equals("Cottage")) {
			validatedTypeOfRoom = true;
		} else {
			message = "Based on the type of room you requested, you are not permitted!";
			validatedTypeOfRoom = false;
		}
		System.out.println(message);
		return validatedTypeOfRoom;
	}

	@Override
	public float calculateBill() {

		float totalBill;
		float baseRoomFare = 0;

		if (getTypeOfRoom().equals("Standard")) {
			baseRoomFare = 2500;
		} else if (getTypeOfRoom().equals("Deluxe")) {
			baseRoomFare = 3500;
		} else if (getTypeOfRoom().equals("Cottage")) {
			baseRoomFare = 5500;
		}

		if (validateNoOfDaysOfStay() && validateNoOfExtraPerson() && validateTypeOfRoom()) {
			totalBill = (float) ((noOfDaysOfStay * baseRoomFare) + noOfDaysOfStay * FOOD_CHARGE
					+ (EXTRA_PERSON_CHARGE * noOfExtraPersons));

			totalBill = (float) (totalBill + TAX * totalBill);
		} else {
			totalBill = 0;
		}

		return totalBill;
	}

}
