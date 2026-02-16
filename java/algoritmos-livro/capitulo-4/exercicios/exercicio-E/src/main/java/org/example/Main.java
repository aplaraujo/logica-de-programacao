package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, delta, R, R1, R2;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        delta = (B * B) * (4 * A * C);

        System.out.println("Valor do delta: " + delta);

        if (delta < 0) {
            System.out.println("Não há solução real");
        } else {
            if (delta == 0) {
                R = - B / (2 * A);
            } else {
                R1 = - (B + Math.sqrt(delta)) / (2 * A);
                R2 = - (B - Math.sqrt(delta)) / (2 * A);
                System.out.println("Raiz 1: " + R1);
                System.out.println("Raiz 2: " + R2);
            }
        }

        sc.close();
    }
}