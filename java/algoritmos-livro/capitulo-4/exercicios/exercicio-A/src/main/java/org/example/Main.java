package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, C;

        A = scanner.nextInt();
        B = scanner.nextInt();

        if (A > B) {
            C = A - B;
        } else {
            C = B - A;
        }

        System.out.println("Resultado: " + C);

        scanner.close();
    }
}