package com.java.development.transientfields;

import java.io.Serializable;

public class Vehicle implements Serializable {

	private static final long serialVersionUID = 5500422525633408334L;

	private transient int vehicleId;

	private String vehicleName;

	private static int count;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Vehicle.count = count;
	}

	public Vehicle(int vehicleId, String vehicleName) {
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		
		System.out.println("Two-argument Constructor");

	}
	
	public Vehicle() {
		System.out.println("Default Constructor");
	}
	

	@Override
	public String toString() {
		return "Vehicle [id=" + vehicleId + ", name=" + vehicleName + "] + Count is: "+count;
	}

}
