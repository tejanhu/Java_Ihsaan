package com.infosys;

public class Calc {
	public static void main(String[] args) {
		int i = 300;
		long l = i; // no explicit type casting
		float f = l; // no explicit type casting
		System.out.println("int value :" + i);
		System.out.println("long value :" + l);
		System.out.println("float value :" + f);
		
		byte b = 50;
		b = (byte) (b+50);
		b = (byte) (b-50);
		b = (byte) (b/50);
		b = (byte) (b*50);
		
		System.out.println();
	}
}
