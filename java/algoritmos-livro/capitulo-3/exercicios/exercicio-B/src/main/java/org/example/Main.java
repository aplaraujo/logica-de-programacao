package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double F, C;

        System.out.print("Digite a temperatura em graus Faherenheit: ");
        F = sc.nextDouble();

        C = ((F - 32.0) * 5.0) / 9.0;

        System.out.printf("Temperatura em graus Celsius: %.1f", C);
    }
}