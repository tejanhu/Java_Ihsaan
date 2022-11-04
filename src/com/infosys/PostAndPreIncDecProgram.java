package com.infosys;

public class PostAndPreIncDecProgram {

	public static void main(String[] args) {
		int m = 1;
		int n = ++m + m++ + --m;
//		int n = ++m;

//		int n = m++;

//		int n = --m;

//		int n = m--;

		System.out.println(n);
//		System.out.println(m);

	}

}
