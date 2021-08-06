package com.java.development.multipleexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {

	public void run() throws IOException,ParseException{
		
		//throw new ParseException
	
		throw new IOException("Couldn't open the file.");
	
	}
	
	public void readInput() throws IOException,FileNotFoundException{
		
		
	
	}
	
}
