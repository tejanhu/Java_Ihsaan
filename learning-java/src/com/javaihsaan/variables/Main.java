package com.javaihsaan.variables;

public class Main {
    public static void main(String[] args) throws Exception {
        int zero = 0;
        int one = 1;
        double pi = 3.14;
        // Use camel case for variables
        int subscriberCountForIhsaan = 1_000_000;

        // String
        char a = 'A';
        char b = 'B';

        String name = "Ihsaan";

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(1));
        String saan = new String("saan");
        System.out.println(name.contains(saan));
        System.out.println(name.equals(saan));

    }
}
