package com.java.practice;

public class Application {
	public static void main(String[] args) {
		int[][] grid = { { 3, 5, 142 }, { 2, 4 }, { 3, 4, 5, 6 } };
		
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col] +"\t");
			}
			System.out.println();
		}
		
		
	}

}
