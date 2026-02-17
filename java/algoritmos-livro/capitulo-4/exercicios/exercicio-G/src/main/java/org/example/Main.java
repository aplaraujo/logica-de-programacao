package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        if (A % 2 == 0 && A % 3 == 0) {
            System.out.println("Valor de A: " + A);
        }

        if (B % 2 == 0 && B % 3 == 0) {
            System.out.println("Valor de B: " + B);
        }

        if (C % 2 == 0 && C % 3 == 0) {
            System.out.println("Valor de C: " + C);
        }

        if (D % 2 == 0 && D % 3 == 0) {
            System.out.println("Valor de D: " + D);
        }

        sc.close();
    }
}