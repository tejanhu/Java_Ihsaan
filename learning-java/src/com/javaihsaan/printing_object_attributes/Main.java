package com.javaihsaan.printing_object_attributes;

public class Main {
    public static void main(String[] args) throws Exception {
        Lens lensOne = new Lens("fujitsu", "120mm", true);
        Lens lensTwo = new Lens("sony", "180mm", true);
        Lens lensThree = new Lens("canon", "90mm", false);
        Lens lensFour = new Lens("canon", "240mm", true);

        System.out.println("Lens 1");
        System.out.println("Brand: " + lensOne.brand);
        System.out.println("Focal Length: " + lensOne.focalLength);
        System.out.println("Prime: " + lensOne.isPrime);

        System.out.println("");

        System.out.println("Lens 2");
        System.out.println("Brand: " + lensTwo.brand);
        System.out.println("Focal Length: " + lensTwo.focalLength);
        System.out.println("Prime: " + lensTwo.isPrime);

        System.out.println("");

        System.out.println("Lens 3");
        System.out.println("Brand: " + lensThree.brand);
        System.out.println("Focal Length: " + lensThree.focalLength);
        System.out.println("Prime: " + lensThree.isPrime);

        System.out.println("");

        System.out.println("Lens 4");
        System.out.println("Brand: " + lensFour.brand);
        System.out.println("Focal Length: " + lensFour.focalLength);
        System.out.println("Prime: " + lensFour.isPrime);
    }

    static class Lens {
        String brand;
        String model;
        String colour;
        double price;
        double weight;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
