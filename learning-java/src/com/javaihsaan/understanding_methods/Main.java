package com.javaihsaan.understanding_methods;

public class Main {
    public static void main(String[] args) throws Exception {
        char letters[] = { 'A', 'A', 'B', 'C', 'D', 'D', 'D' };
        int count = countOccurrences(letters);
        System.out.println(count);
    }

    public static int countOccurrences(char[] letters) {
        System.out.println("Method countOccurrences() was invoked.");
        return -1;
    }
}
