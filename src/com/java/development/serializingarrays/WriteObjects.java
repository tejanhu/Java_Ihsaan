package com.java.development.serializingarrays;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing Objects ...");

		Vehicle carOne = new Vehicle(201, "Honda");
		Vehicle carTwo = new Vehicle(109, "Ford");

		Vehicle truckOne = new Vehicle(551, "Jeep");
		Vehicle truckTwo = new Vehicle(185, "Hyundai");

		Vehicle motorbikeOne = new Vehicle(255, "Mitsubishi");

		Vehicle motorbikeTwo = new Vehicle(388, "Yamaha");

		Vehicle[] vehicles = { carOne, carTwo, truckOne, truckTwo, motorbikeOne, motorbikeTwo };

		ArrayList<Vehicle> vehiclesList = new ArrayList<Vehicle>(Arrays.asList(vehicles));

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("vehicles.bin"))) {

			os.writeObject(vehicles);

			os.writeObject(vehiclesList);

			os.writeInt(vehiclesList.size());

			for (Vehicle vehicle : vehiclesList) {
				os.writeObject(vehicle);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
