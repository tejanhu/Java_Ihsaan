package com.java.development.welcome;

public class Welcomeback {
    public static void main(String[] args) {


       System.out.println(addThem(1,1,1,1,1,2,10,11,12,13,4,5));

    }

    static double addThem(double ...n){
        double counter = 0;

        for(double i: n){
            counter +=i;
        }

        return counter;
    }
}