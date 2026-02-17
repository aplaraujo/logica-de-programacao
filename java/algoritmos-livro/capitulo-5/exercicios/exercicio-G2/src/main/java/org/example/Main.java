package org.example;

public class Main {
    public static void main(String[] args) {
        int pot, i;
        pot = 1;

        for (i = 1; i <= 15; i++) {
            pot *= 3;
            System.out.println("Resultado: " + pot);
        }
    }
}