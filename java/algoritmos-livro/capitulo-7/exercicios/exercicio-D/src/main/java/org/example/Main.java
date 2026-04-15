package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, aux;
        int[] grupoA = new int[12];
        int[] grupoB = new int[12];
        int[] grupoC = new int[12];

        // Efetuar a leitura dos 12 números inteiros no vetor grupoA
        for (i = 0; i < 12; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextInt();
        }

        // Ordenar os valores do vetor grupoA de forma crescente
        for (i = 0; i < 11; i++) {
            for (j = i+1; j < 12; j++) {
                if (grupoA[i] > grupoA[j]) {
                    aux = grupoA[i];
                    grupoA[i] = grupoA[j];
                    grupoA[j] = aux;
                }
            }
        }

        System.out.println("==========================");
        System.out.println("==== Vetor A ordenado ====");

        for (i = 0; i < 12; i++) {
            System.out.print(grupoA[i] + " ");
        }

        System.out.println();
        System.out.println("==========================");

        // Efetuar a leitura dos 12 números inteiros no vetor grupoB
        for (i = 0; i < 12; i++) {
            System.out.print("B[" + i + "]: ");
            grupoB[i] = sc.nextInt();
        }

        // Ordenar os valores do vetor grupoB de forma crescente
        for (i = 0; i < 11; i++) {
            for (j = i+1; j < 12; j++) {
                if (grupoB[i] > grupoB[j]) {
                    aux = grupoB[i];
                    grupoB[i] = grupoB[j];
                    grupoB[j] = aux;
                }
            }
        }

        System.out.println("==========================");
        System.out.println("==== Vetor B ordenado ====");

        for (i = 0; i < 12; i++) {
            System.out.print(grupoB[i] + " ");
        }

        System.out.println();
        System.out.println("==========================");

        // Criar o vetor grupoC que vai conter o valor da soma dos elementos dos vetores grupoA e grupoB
        for (i = 0; i < 12; i++) {
            grupoC[i] = grupoA[i] + grupoB[i];
        }

        // Ordenar os valores do vetor grupoB em ordem decrescente
        for (i = 0; i < 11; i++) {
            for (j = i+1; j < 12; j++) {
                if (grupoC[i] < grupoC[j]) {
                    aux = grupoC[i];
                    grupoC[i] = grupoC[j];
                    grupoC[j] = aux;
                }
            }
        }

        // Mostrar os valores do vetor grupoC
        System.out.println("==========================");
        System.out.println("==== Vetor C ordenado ====");

        for (i = 0; i < 12; i++) {
            System.out.print(grupoC[i] + " ");
        }

        sc.close();
    }
}