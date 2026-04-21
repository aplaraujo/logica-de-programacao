package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, aux;
        int[] grupoA = new int[10];
        int[] grupoB = new int[10];
        int[] grupoC = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextInt();
        }

        for (i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            grupoB[i] = sc.nextInt();
        }

        for (i = 0; i < 10; i++) {
            grupoC[i] = (grupoA[i] * grupoA[i]) + (grupoB[i] * grupoB[i]);
        }

        for (i = 0; i < 9; i++) {
            for (j = i+1; j < 10; j++) {
                if (grupoC[i] < grupoC[j]) {
                    aux = grupoC[i];
                    grupoC[i] = grupoC[j];
                    grupoC[j] = aux;
                }
            }
        }

        System.out.println("=========================");
        System.out.println("=== Vetor C ordenado: ===");

        for (i = 0; i < 10; i++) {
            System.out.print(grupoC[i] + " ");
        }

        sc.close();
    }
}