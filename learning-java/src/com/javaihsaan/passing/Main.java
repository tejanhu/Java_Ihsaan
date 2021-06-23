package com.javaihsaan.passing;

public class Main {
    public static void main(String[] args) throws Exception {
        int a = 10;
        // Pass by copy - b lives in different memory address
        int b = a;
        a = 100;
        System.out.println("a: " + a + " b:" + b);

        // Pass by reference - hamed and asiyah point to same reference
        Person hamed = new Person("hamed");
        Person asiyah = hamed;

        System.out.println("before changing hamed");
        System.out.println(hamed.name + " " + asiyah.name);
        hamed.name = "Hamed Abdul Hamid";

        asiyah.name = "Asiyah";

        System.out.println("after changing hamed");
        System.out.println(hamed.name + " " + asiyah.name);
    }

    static class Person

    {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
