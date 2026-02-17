package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, pot, base, expoente;
        i = 1;
        pot = 1;

        base = sc.nextInt();
        expoente = sc.nextInt();

        while(i <= expoente) {
            pot *= base;
            i++;
        }

        System.out.println("Resultado da potência: " + pot);

        sc.close();
    }
}