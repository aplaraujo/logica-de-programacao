package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int[] A = new int[15];
        int[] B = new int[15];

        for(i = 0; i < 15; i++) {
            System.out.print("Digite um número: ");
            A[i] = sc.nextInt();
        }

        for(i = 0; i < 15; i++) {
            B[i] = A[i] * A[i];
        }

        System.out.println();
        System.out.println("-----Vetor A-----");
        for(i = 0; i < 15; i++) {
            System.out.println(A[i]);
        }

        System.out.println();
        System.out.println("-----Vetor B-----");
        for(i = 0; i < 15; i++) {
            System.out.println(B[i]);
        }

        sc.close();
    }
}