package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int[] A = new int[20];
        int[] B = new int[20];
        int[] C = new int[20];

        System.out.println("------------ Vetor A -------------");
        for(i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            A[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("------------ Vetor B -------------");
        for(i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            B[i] = sc.nextInt();
        }

        for(i = 0; i < 20; i++) {
            C[i] = A[i] - B[i];
        }

        System.out.println();
        System.out.println("------------ Vetor C -------------");
        for(i = 0; i < 20; i++) {
            System.out.println(C[i]);
        }

        sc.close();
    }
}