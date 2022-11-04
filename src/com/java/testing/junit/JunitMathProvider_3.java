package com.java.testing.junit;

import static org.junit.Assert.*;
import org.junit.Test;

import com.java.testing.junit.application.MathProvider;

public class JunitMathProvider_3 {

	MathProvider provider;

	public JunitMathProvider_3() {

		provider = new MathProvider();
	}

	@Test
	public void modDivisor() {
		System.out.println("Starting test " + new Object() {
		}.getClass().getEnclosingMethod().getName());
		int firstNumber = 100;
		int secondNumber = 5;
		assertEquals(firstNumber % secondNumber, provider.modDivisor(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object() {
		}.getClass().getEnclosingMethod().getName());
	}

}
