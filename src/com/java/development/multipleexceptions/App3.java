package com.java.development.multipleexceptions;

import java.io.IOException;
import java.text.ParseException;

public class App3 {

	public static void main(String[] args)  {

		Test test = new Test();

	
		
			try {
				test.run();
			} catch (IOException | ParseException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

	}

}
