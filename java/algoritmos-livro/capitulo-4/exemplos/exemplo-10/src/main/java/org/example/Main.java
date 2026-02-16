package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, X;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        X = A;

        if (X < B) {
            X = B;
        }

        if (X < C) {
            X = C;
        }

        System.out.println("Maior peso: " + X);

        sc.close();
    }
}