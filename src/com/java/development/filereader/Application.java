package com.java.development.filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		File file = new File("test.txt");

		BufferedReader bufferedReader = null;

		try {
			FileReader fileReader = new FileReader(file);

			bufferedReader = new BufferedReader(fileReader);

			// Whenever we run this line, it will read a line from the file after checking
			// the line is not null
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);

			}

		} catch (FileNotFoundException e) {
			System.out.println(file.toString() + " file not found");
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}

		finally {

			try {
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Unable to close file " + file.toString());
			} catch (NullPointerException ex) {
				// File was probably never opened
			}

		}

	}

}
