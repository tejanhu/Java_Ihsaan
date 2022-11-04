package com.infosys;

public class Chocolate {

	int barCode;
	String name;
	int weight;
	int cost;

	Chocolate() {
		barCode = 101;
		name = "Cadbury";
		weight = 12;
		cost = 10;
	}

	Chocolate(int barCode, String name, double weight, double cost) {
		this.barCode = barCode;
		this.name = name;
		this.weight = (int) weight;
		this.cost = (int) cost;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
