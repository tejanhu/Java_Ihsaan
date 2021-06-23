package com.javaihsaan.enhanced_for_loop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        int[] numbers = { 2, 0, 1, 4, 100, 4, 90, 78, 77 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Enhanced For loop");

        for (int number : numbers) {
            System.out.println(number);
        }

        Arrays.stream(numbers).forEach(System.out::println);

    }
}
