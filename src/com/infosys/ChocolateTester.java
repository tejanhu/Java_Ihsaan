package com.infosys;

public class ChocolateTester {
	public static void main(String[] args) {
		// Create an object of chocolate
		Chocolate choco = new Chocolate();
		// Use getter methods to display the values
		System.out.println(choco.getBarCode());
		System.out.println(choco.getCost());
		System.out.println(choco.getName());
		System.out.println(choco.getWeight());
		// Use setter methods to modify the values
		choco.setBarCode(102);
		choco.setName("Hershey's");
		choco.setWeight(24);
		choco.setCost(50);
		// Use getter methods to display the modified values
		System.out.println(choco.getBarCode());
		System.out.println(choco.getCost());
		System.out.println(choco.getName());
		System.out.println(choco.getWeight());
	}
}
