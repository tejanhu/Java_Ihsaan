package com.infosys;

import java.util.Iterator;

public class EnhancedProblem {

	public static int[] fillArray(int[] marks) {
		int subjectMarks[] = { 50, 80, 30, 20, 40 };

		marks = subjectMarks;

		return marks;
	}

	public static void printArray(int[] marks) {
		marks = fillArray(marks);
		for (int m : marks) {
			System.out.println(m);
		}
	}

	public static void main(String[] args) {
		int[] marks = new int[5];
		fillArray(marks);
		printArray(marks);
	}

}
