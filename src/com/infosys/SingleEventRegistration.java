package com.infosys;

public class SingleEventRegistration extends EventRegistration {

	private int participantNo;

	public SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
		super(name, nameOfEvent, 0);
		this.participantNo = participantNo;
	}

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}

	public void registerEvent() {
		if (super.getNameOfEvent().equals("ShakeALeg")) {
			super.setRegistrationFee(100);
		} else if (super.getNameOfEvent().equals("Sing&Win")) {
			super.setRegistrationFee(150);
		} else if (super.getNameOfEvent().equals("PlayAway")) {
			super.setRegistrationFee(130);
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
					+ getRegistrationFee() + "\nYou are participant no:" + getParticipantNo();
		} else {
			message = "Please choose a valid event";
		}

		System.out.println(message);
	}

}
