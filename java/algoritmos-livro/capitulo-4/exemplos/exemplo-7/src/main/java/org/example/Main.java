package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, X;
        A = sc.nextInt();
        B = sc.nextInt();
        X = sc.nextInt();

        if (!(X > 5)) {
            C = A + B;
        } else {
            C = A - B;
        }

        System.out.println("Resultado: " + C);

        sc.close();
    }
}