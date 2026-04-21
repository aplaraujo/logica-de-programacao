package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, aux, soma;
        int[] grupoA = new int[15];
        int[] grupoB = new int[15];
        int[] grupoC = new int[15];
        int[] grupoD = new int[15];

        for (i = 0; i < 15; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextInt();
        }

        System.out.println("=============================");

        for (i = 0; i < 15; i++) {
            System.out.print("B[" + i + "]: ");
            grupoB[i] = sc.nextInt();
        }

        System.out.println("=============================");

        for (i = 0; i < 15; i++) {
            System.out.print("C[" + i + "]: ");
            grupoC[i] = sc.nextInt();
        }

        System.out.println("=============================");

        for (i = 0; i < 15; i++) {
            soma = grupoA[i] + grupoB[i] + grupoC[i];
            grupoD[i] = soma *  soma * soma;
        }

        for (i = 0; i < 14; i++) {
            for (j = i+1; j < 15; j++) {
                if (grupoD[i] > grupoD[j]) {
                    aux = grupoD[i];
                    grupoD[i] = grupoD[j];
                    grupoD[j] = aux;
                }
            }
        }

        System.out.println("=============================");
        System.out.println("===== Vetor D ordenado: =====");

        for (i = 0; i < 15; i++) {
            System.out.print(grupoD[i] + " ");
        }

        sc.close();
    }
}