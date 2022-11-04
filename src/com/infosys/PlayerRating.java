package com.infosys;

public class PlayerRating {

	private int playerPosition;
	private String playerName;
	private float criticOneRating;
	private float criticTwoRating;
	private float criticThreeRating;
	private float averageRating;
	private char category;

	PlayerRating(int playerPosition, String playerName) {
		this.playerPosition = playerPosition;
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getPlayerPosition() {
		return playerPosition;
	}

	public void calculateAverageRating(float criticOneRating, float criticTwoRating) {
		averageRating = (criticOneRating + criticTwoRating) / 2;
		System.out.println("The average rating is " + averageRating);
	}

	public void calculateAverageRating(float criticOneRating, float criticTwoRating, float criticThreeRating) {
		averageRating = (criticOneRating + criticTwoRating + criticThreeRating) / 3;
		System.out.println("The average rating is " + averageRating);
	}

	public void calculateCategory() {
		if (averageRating > 8) {
			category = 'A';
		} else if (averageRating > 5 && averageRating <= 8) {
			category = 'B';
		} else if (averageRating > 0 && averageRating <= 5) {
			category = 'C';
		}
		System.out.println("The category is " + category);
	}

	public void display() {
		System.out.println("The player name is " + getPlayerName());
		System.out.println("The player position is " + getPlayerPosition());
	}

}
