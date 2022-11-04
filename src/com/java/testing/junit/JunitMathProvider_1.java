package com.java.testing.junit;

import static org.junit.Assert.*;
import org.junit.Test;

import com.java.testing.junit.application.MathProvider;

public class JunitMathProvider_1 {

	MathProvider provider;

	public JunitMathProvider_1() {

		provider = new MathProvider();
	}

	@Test
	public void add() {
		System.out.println("Starting test " + new Object() {
		}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 20;
		assertEquals(firstNumber + secondNumber, provider.Add(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object() {
		}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void subtract() {
		System.out.println("Starting test " + new Object() {
		}.getClass().getEnclosingMethod().getName());
		int firstNumber = 70;
		int secondNumber = 30;
		assertEquals(firstNumber - secondNumber, provider.Substract(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object() {
		}.getClass().getEnclosingMethod().getName());
	}
	

}
