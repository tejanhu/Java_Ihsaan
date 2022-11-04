package com.infosys;

public class ShowYourTalentRegistration {
	public static void main(String[] args) {
		// TO-DO :Create an instance of SingleEventRegistration with reference of
		// EventRegistration
		EventRegistration registration1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
		// as participant1, and initialize the same with values given
		// TO-DO :Invoke the method registerEvent using participant1
		registration1.registerEvent();
		// TO-DO :Create an instance of TeamEventRegistration with reference of
		// EventRegistration
		EventRegistration registration2 = new TeamEventRegistration("Aura", "ShakeALeg", 5, 1);
		registration2.registerEvent();
		// as team1, and initialize the same with values given
		// TO-DO :Invoke the method registerEvent using team1
		// TO-DO :Create an instance of SingleEventRegistration with reference of
		// EventRegistration
		EventRegistration registration3 = new SingleEventRegistration("Hudson", "PlayAway", 2);
		registration3.registerEvent();
		// as participant2, and initialize the same with values given
		// TO-DO :Invoke the method registerEvent using participant2
	}
}
