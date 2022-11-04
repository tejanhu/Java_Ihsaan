package com.infosys;

public class Rectangle {

	private int length, breadth;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int calculatePerimeter() {
		return 2 * (getLength() + getBreadth());
	}

	@Override
	public String toString() {
		return "Length: " + getLength() + "\n" + "Breadth: " + getBreadth() + "\nPerimeter: " + calculatePerimeter();
	}

}
