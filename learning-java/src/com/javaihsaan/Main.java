package com.javaihsaan;

public class Main {
    public static void main(String[] args) {

        String req = "";

        req += "I want eggs, bread, rice, butter";
        req += "";
        req += " ,milk, cheese";

        System.out.println(req);

        // More efficient
        StringBuilder sb = new StringBuilder("");

        sb.append("I want a car, truck, jet.");
        sb.append("");
        sb.append(" I want gold, silver and rubies");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Peter.").append(" ").append("I love pizzas");

        System.out.println(s.toString());

        //// Formatting /////////////////////////////////////

        System.out.print("Here is some text.\tThat was a tab.\nThat was a newline");
        System.out.println(" More text.");
        System.out.printf("Total  cost %d; quantity is %d", 5, 120);

        for (int i = 0; i < 20; i++) {
            System.out.printf("%-2d: %s\n", i, "here is some text");
        }

        System.out.printf("Total value :  %.2f\n", 5.8964);
        System.out.printf("Total value :  %-6.1f\n", 235.458964);

    }

}
