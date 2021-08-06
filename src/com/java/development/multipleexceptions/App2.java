package com.java.development.multipleexceptions;

import java.io.IOException;
import java.text.ParseException;

public class App2 {

	public static void main(String[] args) {

		Test test = new Test();

		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {

			System.out.println("Couldn't read the file.");
		}

	}

}
