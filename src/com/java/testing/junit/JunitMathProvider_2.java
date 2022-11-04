package com.java.testing.junit;

import static org.junit.Assert.*;
import org.junit.Test;

import com.java.testing.junit.application.MathProvider;

public class JunitMathProvider_2 {

	MathProvider provider;

	public JunitMathProvider_2() {

		provider = new MathProvider();
	}

	
	@Test
	public void multiply() {
		System.out.println("Starting test " + new Object() {
		}.getClass().getEnclosingMethod().getName());
		int firstNumber = 50;
		int secondNumber = 20;
		assertEquals(firstNumber * secondNumber, provider.Multiply(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object() {
		}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void divide() {
		System.out.println("Starting test " + new Object() {
		}.getClass().getEnclosingMethod().getName());
		int firstNumber = 80;
		int secondNumber = 20;
		assertEquals(firstNumber / secondNumber, provider.Divide(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object() {
		}.getClass().getEnclosingMethod().getName());
	}
	

}
