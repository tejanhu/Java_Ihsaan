package com.java.development.ifstatement;

public class Application {

	public static void main(String[] args) {
		
		int loop = 0;
		
		

		while (loop < 9) {
			loop++;

			System.out.println("Looping: " + loop); 
			
			if(loop == 9) {
				break;
			}
			
			
			System.out.println("Running still ...");
		}

	}
}
