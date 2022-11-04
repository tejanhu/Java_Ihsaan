package com.infosys;

public class LocationChanger {

	private String location;

	private String name;

	public LocationChanger(String name, String location) {
		this.location = location;
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void checkCity() {

		String cityOfLocation = getLocation().split(",")[1];

		switch (cityOfLocation) {
		case "Delhi":
			System.out.println("Welcome to Infy Mysore Delhites!");
			break;

		case "Trivandrum":
			System.out.println("Welcome to MyDC people of Trinify!!");
			break;

		case "Bhubaneshwar":
			System.out.println("You came a long way down South! We welcome you!");
			break;

		default:
			System.out.println("Oops your city name is not listed!");
			break;

		}

	}

	public void editAddress() {

		String previousAddress = "", newAddress = "";
		previousAddress = getLocation().split(",")[2];
		newAddress = "SEZ";

		if (previousAddress.equals(newAddress)) {
			System.out.println("Your location remains the same!");
		} else {
			System.out.println("Your location has been changed from " + previousAddress + " to " + newAddress);
		}

	}

	public void welcomeEmployee() {

		String fname = getName().split(" ")[0];

		System.out.println("Hello " + fname);

	}

}
