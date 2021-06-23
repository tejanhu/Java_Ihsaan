package com.javaihsaan.user_defined_methods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        char letters[] = { 'A', 'A', 'B', 'C', 'D', 'D', 'D' };
        int count = countOccurrences(letters, 'F');
        System.out.println(count);
    }

    public static int countOccurrences(char[] letters, char searchLetter) {
        int count = 0;
        for (char l : letters) {
            if (l == searchLetter) {
                count++;
            }
        }
        return count;
    }
}
