package com.infosys;

public class PlayerBoard {
	public static void main(String[] args) {
		PlayerRating pr = new PlayerRating(1, "Beckham");
		pr.display();
		pr.calculateAverageRating(9, 9.9f);

		pr.calculateCategory();
		System.out.println();

		PlayerRating pr2 = new PlayerRating(1, "Oscar");
		pr2.display();
		pr2.calculateAverageRating(1, 1, 1);
		pr2.calculateCategory();

	}
}
