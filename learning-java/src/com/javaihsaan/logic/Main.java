package com.javaihsaan.logic;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean isKid = false;

        boolean isAdult = false;

        boolean isWorkingWithIhsaan = true;

        System.out.println(isKid && isAdult);
        System.out.println(isKid || isAdult);
        System.out.println((isKid || isAdult) && isWorkingWithIhsaan);
        System.out.println((!isKid || isAdult) && !isWorkingWithIhsaan);
        System.out.println(isAdult == true);
        System.out.println(isAdult == false);
        System.out.println(!isAdult);
        String name = "Frank";
        System.out.println(12 > 17 || 6 <= 6 && !isAdult && name.contains("F"));
        // System.out.println(zubeiraAge == hossamAge);
        // System.out.println(zubeiraAge != hossamAge);
    }
}
