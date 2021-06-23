package com.javaihsaan.break_and_continue;

public class Main {
    public static void main(String[] args) throws Exception {

        String[] names = { "Baba", "Ali", "Adam", "Awa" };

        for (String name : names) {
            if (name.equals("Adam")) {
                break;

            }
            System.out.println(name);
        }

        double[] weights = { 400.00, 220.00, 500.00, 190.00 };

        for (double weight : weights) {
            if (weight == (400.00)) {
                continue;

            }
            System.out.println(weight);
        }

    }
}
