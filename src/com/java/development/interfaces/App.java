package com.java.development.interfaces;

public class App {

	public static void main(String[] args) {

		Machine mach1 = new Machine();
		
		mach1.start();
		
		Person person1 = new Person("Tim");
		person1.greet();
		
		mach1.showInfo();
		
		person1.showInfo();
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = new Machine();
		info2.showInfo();
		
		System.out.println("");
		
		outputInfo(mach1);
		outputInfo(person1);
		
	}
	
	private static void outputInfo(Info info) {
		info.showInfo();
	}

}
