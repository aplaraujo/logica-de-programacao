package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, X;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        X = A + B + C;

        if (X >= 100) {
            System.out.println("Resultado: " + X);
        }

        sc.close();
    }
}