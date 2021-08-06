package com.java.development.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing Objects ...");

		Vehicle carOne = new Vehicle(201, "Honda");
		Vehicle carTwo = new Vehicle(109, "Ford");

		System.out.println(carOne);

		System.out.println(carTwo);

		try (FileOutputStream fs = new FileOutputStream("vehicle.bin")) {

			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(carOne);
			
			os.writeObject(carTwo);
			
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
