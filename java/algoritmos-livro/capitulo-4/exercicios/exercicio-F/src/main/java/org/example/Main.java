package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, AUX;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if (A > B) {
            AUX = A;
            A = B;
            B = AUX;
        }

        if (A > C) {
            AUX = A;
            A = C;
            C = AUX;
        }

        if (B > C) {
            AUX = B;
            B = C;
            C = AUX;
        }

        System.out.println(A + " | " + B + " | " + C);

        sc.close();
    }
}