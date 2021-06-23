package com.javaihsaan.passport_example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        Passport ukPassport = new Passport("1234", "ENGLAND (UK)", LocalDate.of(2025, 5, 15));

        Passport usPassport = new Passport("12343", "USA", LocalDate.of(2023, 9, 18));
    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
