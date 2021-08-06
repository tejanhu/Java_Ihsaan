package com.java.development.throwingexceptions;

import com.java.development.throwingexceptions.exceptions.ServerException;

public class Test {

	public void run() throws ServerException{
		
		
		// Some kind of status code returned from application
		
		// 200 = SUCCESS!!
		
		// Anything = ERROR CODE
		
		int statusCode = 404;
		
		
		if(statusCode == 500) {
			// Something has gone terribly wrong!
			throw new ServerException("Internal Server Error. Unable to connect to server!");
			
		}
		
		else if(statusCode == 404) {
			// Something has gone terribly wrong!
			throw new ServerException("Server Not Found Error. Unable to connect to server!");
			
		}
		
		else if(statusCode == 301) {
			// Something has gone terribly wrong!
			throw new ServerException("Moved Permanently. Unable to connect to server!");
			
		}
		
		else {
			System.out.println("Running Successfully.");

		}
		
		
		
		
	}
	
}
