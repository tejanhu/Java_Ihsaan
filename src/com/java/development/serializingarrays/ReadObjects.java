package com.java.development.serializingarrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading Objects ...");

		try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("vehicles.bin"))) {

			Vehicle[] vehicles = (Vehicle[]) oi.readObject();
			System.out.println("Array length: " + vehicles.length);

			@SuppressWarnings("unchecked")
			ArrayList<Vehicle> vehiclesList = (ArrayList<Vehicle>) oi.readObject();
			System.out.println("ArrayList size: " + vehiclesList.size());

			for (Vehicle vehicle : vehicles) {
				System.out.println("Coming from the Array: " + vehicle);
			}

			for (Vehicle v : vehiclesList) {
				System.out.println("Coming from the ArrayList: " + v);
			}

			int num = oi.readInt();

			for (int item = 0; item < num; item++) {
				Vehicle vehicle = (Vehicle) oi.readObject();
				System.out.println("Item" + item + ": " + vehicle);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
