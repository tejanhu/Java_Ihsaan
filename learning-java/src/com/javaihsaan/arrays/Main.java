package com.javaihsaan.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        int zero = 0;
        int one = 1;

        int[] numbers = new int[3];
        numbers[0] = 2;
        numbers[1] = 0;
        numbers[2] = 1;
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = { 2, 0, 1, 4, 100 };
        String[] names = { "Alieu", "Fatoumata" };
        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

    }

}
