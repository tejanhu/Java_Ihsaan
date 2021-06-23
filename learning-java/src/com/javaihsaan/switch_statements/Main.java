package com.javaihsaan.switch_statements;

public class Main {
    public static void main(String[] args) throws Exception {

        String gender = "da";

        switch (gender.toUpperCase()) {
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("I am a male");
                break;
            case "PREFER NOT TO SAY":
                System.out.println("Prefer not to say");
                break;
            default:
                System.out.println("Unknown gender");
        }

    }
}
