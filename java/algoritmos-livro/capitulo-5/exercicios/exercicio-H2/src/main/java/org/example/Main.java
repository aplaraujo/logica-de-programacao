package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, pot, base, expoente;

        pot = 1;

        base = sc.nextInt();
        expoente = sc.nextInt();

        for (i = 1; i <= expoente; i++) {
            pot *= base;
        }

        System.out.println("Resultado da potência: " + pot);

        sc.close();
    }
}