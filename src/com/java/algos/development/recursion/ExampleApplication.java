package com.java.algos.development.recursion;

public class ExampleApplication {

	public static void main(String[] args) {

//		calculateWithRecursion(1);
		System.out.println(factorial(7));
	}

	private static void calculateWithRecursion(int i) {
		
		int sum = 0;
		
		sum = 2 * i;
		
		System.out.println(sum);

		if (sum == 24) {
			return;
		}


		calculateWithRecursion(i + 1);
	

	}
	
	private static int factorial(int n) {
		
//		System.out.println("N value:" + n);

		if (n == 1) {
			return 1;
		}


		return factorial(n - 1)*n;
	
		

	}

}
