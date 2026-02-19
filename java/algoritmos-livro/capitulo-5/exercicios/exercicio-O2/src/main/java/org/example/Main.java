package org.example;

public class Main {
    public static void main(String[] args) {
        int i, fat;

        fat = 1;

        for (i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                fat *= i;
            }
        }

        System.out.println("Fatorial: " + fat);
    }
}