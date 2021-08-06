package com.java.development.inheritance;

public class Car extends Machine{
	
	
	
	@Override
	public void start() {
		System.out.println("Car starting...");
	}

	@Override
	public void stop() {
		System.out.println("Car breaking...");
	}

	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}

	
	public void showInfo() {
		System.out.println("Car name " + name);
	}
}
