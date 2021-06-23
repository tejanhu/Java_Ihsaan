package com.javaihsaan.if_statements;

public class Main {
    public static void main(String[] args) throws Exception {
        int age = 15;

        if (age >= 18) {
            System.out.println("Yes!!!");
        } else if (age >= 16 && age < 18) {
            System.out.println("I am almost an adult");
        } else {
            System.out.println("I am not an adult");

        }

    }
}
