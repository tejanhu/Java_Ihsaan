package com.java.development.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading Objects ...");

		try (FileInputStream fi = new FileInputStream("vehicle.bin")) {

			ObjectInputStream oi = new ObjectInputStream(fi);

			Vehicle vehicleOne = (Vehicle) oi.readObject();

			Vehicle vehicleTwo = (Vehicle) oi.readObject();
			
			System.out.println(vehicleOne);
			System.out.println(vehicleTwo);

			oi.close();

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
