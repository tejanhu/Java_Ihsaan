package com.java.development.serialization;

import java.io.Serializable;

public class Vehicle implements Serializable {

	private static final long serialVersionUID = 5500422525633408334L;

	private int vehicleId;

	private String vehicleName;

	public Vehicle(int vehicleId, String vehicleName) {
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + vehicleId + ", name=" + vehicleName + "]";
	}

}
