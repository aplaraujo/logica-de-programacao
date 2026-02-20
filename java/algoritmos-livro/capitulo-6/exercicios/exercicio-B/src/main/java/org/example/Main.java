package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int[] A = new int[8];
        int[] B = new int[8];

        for(i = 0; i < 8; i++) {
            System.out.print("Digite um número: ");
            A[i] = sc.nextInt();
        }

        for(i = 0; i < 8; i++) {
            B[i] = A[i] * 3;
        }

        System.out.println("Vetor B:");
        for(i = 0; i < 8; i++) {
            System.out.println(B[i]);
        }

        sc.close();
    }
}