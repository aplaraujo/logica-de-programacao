package org.example;

public class Main {
    public static void main(String[] args) {
        int i;
        double F;

        for(i = 10; i <= 100; i += 10) {
            System.out.println("Valor de i: " + i);
            F = i * ((double) 9 / 5) + 32;
            System.out.println("Temperatura em F: " + F);
        }
    }
}