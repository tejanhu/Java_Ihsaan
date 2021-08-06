package com.java.development.transientfields;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading Objects ...");

		try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("v.bin"))) {

			Vehicle vehicle = (Vehicle) oi.readObject();

			System.out.println(vehicle);

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
