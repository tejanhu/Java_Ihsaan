package com.java.development.transientfields;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing Objects ...");

		Vehicle motorbike = new Vehicle(388, "Yamaha");

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("v.bin"))) {

			Vehicle.setCount(81);
			
			os.writeObject(motorbike);

		

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
