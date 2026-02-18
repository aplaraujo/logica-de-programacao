package org.example;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        double F;

        while(i <= 100) {
            System.out.println(i);
            F = i * ((double) 9 / 5) + 32;
            System.out.println("Temperatura em F: " + F);
            i += 10;
        }
    }
}