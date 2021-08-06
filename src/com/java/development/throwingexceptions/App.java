package com.java.development.throwingexceptions;

import com.java.development.throwingexceptions.exceptions.ServerException;

public class App {

	public static void main(String[] args) {

		Test test = new Test();

		try {
			test.run();
		} catch (ServerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
