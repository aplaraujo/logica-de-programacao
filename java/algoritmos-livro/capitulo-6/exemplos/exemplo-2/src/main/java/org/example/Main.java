package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] A = new int[10];
        int[] B = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            A[i] = sc.nextInt();
        }

        for (i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                B[i] = A[i] * 5;
            } else {
                B[i] = A[i] + 5;
            }
        }

        for (i = 0; i < 10; i++) {
            System.out.println(A[i] + " | " + B[i]);
        }

        sc.close();
    }
}