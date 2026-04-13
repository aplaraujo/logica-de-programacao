package org.example;

/*
* 1 - Efetuar a leitura dos 15 números inteiros do vetor grupoA
* 2 - Criar um vetor grupoB com o fatorial dos valores do vetor grupoA
* 3 - Ordenar os valores do vetor grupoB de forma crescente
* 4 - Apresentar os valores do vetor grupoB
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int i, j, aux, fat;
        int[] grupoA = new int[15];
        int[] grupoB = new int[15];

        fat = 1;

        // Vetor A
        for (i = 0; i < 15; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextInt();
        }

        // Vetor B
        for (i = 0; i < 15; i++) {
            fat *= grupoA[i];
            grupoB[i] = fat;
        }

        // Ordenação crescente do vetor B
        for (i = 0; i < 14; i++) {
            for (j = i+1; j < 15; j++) {
                if (grupoA[i] > grupoB[j]) {
                    aux = grupoA[i];
                    grupoA[i] = grupoB[j];
                    grupoB[j] = aux;
                }
            }
        }

        System.out.println("=========================");
        System.out.println("==== Vetor B ordenado ===");

        for (i = 0; i < 15; i++) {
            System.out.print(grupoB[i] + " ");
        }

        sc.close();
    }
}