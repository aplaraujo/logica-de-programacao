package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, aux;
        int[] grupoA = new int[15];
        int[] grupoB = new int[15];

        for (i = 0; i < 15; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextInt();
        }

        for (i = 0; i < 15; i++) {
            grupoB[i] = grupoA[i] / 2;
        }

        System.out.println("=============================");
        System.out.println("===== Vetor A ordenado: =====");

        for (i = 0; i < 14; i++) {
            for (j = i+1; j < 15; j++) {
                if (grupoA[i] < grupoA[j]) {
                    aux = grupoA[i];
                    grupoA[i] = grupoA[j];
                    grupoA[j] = aux;
                }
            }
        }

        for (i = 0; i < 15; i++) {
            System.out.print(grupoA[i] + " ");
        }

        System.out.println();
        System.out.println("=============================");
        System.out.println("===== Vetor B ordenado: =====");

        for (i = 0; i < 14; i++) {
            for (j = i+1; j < 15; j++) {
                if (grupoB[i] > grupoB[j]) {
                    aux = grupoB[i];
                    grupoB[i] = grupoB[j];
                    grupoB[j] = aux;
                }
            }
        }

        for (i = 0; i < 15; i++) {
            System.out.print(grupoB[i] + " ");
        }


        sc.close();
    }
}