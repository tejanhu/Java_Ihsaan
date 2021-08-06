package com.java.development.multipleexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App5 {

	public static void main(String[] args)  {

		Test test = new Test();

	
		try {
			test.readInput();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
