package com.infosys;

public class EventRegistration {

	private String name;
	private String nameOfEvent;
	private double registrationFee;

	public EventRegistration(String name, String nameOfEvent, double registrationFee) {
		this.name = name;
		this.nameOfEvent = nameOfEvent;
		this.registrationFee = registrationFee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameOfEvent() {
		return nameOfEvent;
	}

	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}

	public void registerEvent() {

		if (nameOfEvent.equals("ShakeALeg")) {
			registrationFee = 100;
		} else if (nameOfEvent.equals("Sing&Win")) {
			registrationFee = 150;
		} else if (nameOfEvent.equals("Actathon")) {
			registrationFee = 70;
		} else if (nameOfEvent.equals("PlayAway")) {
			registrationFee = 130;
		}

	}

}
