package org.example;

public class Main {
    public static void main(String[] args) {
        int i, pot;
        i = 1;
        pot = 1;

        while(i <= 15) {
            pot *= 3;
            System.out.println("Resultado: " + pot);
            i++;
        }
    }
}