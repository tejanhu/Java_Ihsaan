package com.java.development.casting;

class Reptile {

	public void move() {
		System.out.println("Moving ....");
	}

}

class Snake extends Reptile {

	public void move() {
		System.out.println("Slithering ....");
	}

	public void eat() {
		System.out.println("Eating ...");
	}

}

public class App {

	public static void main(String[] args) {
		
		byte byteValue = 20;
		System.out.println("Max Byte size: "+ Byte.MAX_VALUE);
		
		short shortValue = 54;
		System.out.println("Max Short size: "+Short.MAX_VALUE);
		
		int intValue = 500;
		
		System.out.println("Max int size: "+Integer.MAX_VALUE);
		
		long longValue = 5000;
		
		System.out.println("Max Long size: "+Long.MAX_VALUE);
		
		float floatValue = 666.6732f;
		
		float floatValue2 = (float)436.800;
		
		System.out.println("Max Float size: "+Float.MAX_VALUE);
		
		double doubleValue = 0.324;
		
		System.out.println("Max Double size: "+Double.MAX_VALUE);
		
		 intValue = (int)longValue;
		 
		 System.out.println(intValue);
		
		 doubleValue = intValue;
		 System.out.println(doubleValue);
		 
		 intValue = (int)floatValue;
		 System.out.println(intValue);
		 
		 // Inverses --- as byte.MAX_VALUE = 127
		 byteValue = (byte) 128;
		 System.out.println(byteValue);


		Reptile reptile1 = new Reptile();

//		reptile1.move();

		Snake snake1 = new Snake();

//		snake1.move();
//
//		snake1.eat();

	
		// Polymorphism works
		Reptile reptile2 = new Snake();
		
		
		
		// Upcasting (safe) from Snake -> Reptile
		Reptile reptile3 = snake1;
		reptile3.move();
		// error as reptile decides what method is available for the type: reptile3.eat();
		
		
		// Downcasting (inherently unsafe) from Reptile -> Snake
		Reptile reptile4 = new Snake();
		Snake snake2 = (Snake) reptile4;
		snake2.eat();
		snake2.move();
		
		// Doesn't work --- runtime error
		Reptile reptile5 = new Reptile();
//		Snake snake3 = (Snake) reptile5;
//		snake3.move();
//		snake3.eat();

	}

}
