package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double C, F;
        System.out.print("Digite a temperatura em graus Celsius: ");
        C = sc.nextDouble();
        F = (C * (9.0 / 5.0)) + 32;

        System.out.printf("Temperatura em graus Fahrenheit: %.1f", F);

        sc.close();
    }
}