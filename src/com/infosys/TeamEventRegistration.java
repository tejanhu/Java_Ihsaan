package com.infosys;

public class TeamEventRegistration extends EventRegistration {

	private int noOfParticipants;
	private int teamNo;

	public TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo) {
		super(name, nameOfEvent, 0);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}

	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}

	public void registerEvent() {

		int baseFee = 0;

		if (super.getNameOfEvent().equals("ShakeALeg")) {
			baseFee = 50;
			super.setRegistrationFee(baseFee * getNoOfParticipants());
		} else if (super.getNameOfEvent().equals("Sing&Win")) {
			baseFee = 60;
			super.setRegistrationFee(baseFee * getNoOfParticipants());
		} else if (super.getNameOfEvent().equals("Actathon")) {
			baseFee = 80;
			super.setRegistrationFee(baseFee * getNoOfParticipants());
		} else if (super.getNameOfEvent().equals("PlayAway")) {
			baseFee = 100;
			super.setRegistrationFee(baseFee * getNoOfParticipants());
		}

		boolean isValidNameOfEvent;
		String message = "";

		if (getNameOfEvent().equals("ShakeALeg") || getNameOfEvent().equals("Sing&Win")
				|| getNameOfEvent().equals("PlayAway")) {
			isValidNameOfEvent = true;

		} else {

			isValidNameOfEvent = false;
		}

		if (isValidNameOfEvent)

		{
			message = "Thank You " + getName() + " for your participation. Your registration fee is: "
					+ getRegistrationFee() + "\nYou are participant no:" + getTeamNo();
		} else {
			message = "Please choose a valid event";
		}

		System.out.println(message);
	}

}
