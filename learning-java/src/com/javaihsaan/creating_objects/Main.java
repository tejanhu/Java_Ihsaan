package com.javaihsaan.creating_objects;

public class Main {
    public static void main(String[] args) throws Exception {
        Lens lensOne = new Lens("fujitsu", "120mm", true);
        Lens lensTwo = new Lens("sony", "180mm", true);
        Lens lensThree = new Lens("canon", "90mm", false);
        Lens lensFour = new Lens("canon", "240mm", true);
    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
