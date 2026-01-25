package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, R, pi;
        R = sc.nextDouble();
        pi = 3.14159265;
        A = pi * (R * R);

        System.out.printf("Área do círculo: %.2f", A);

        sc.close();
    }
}