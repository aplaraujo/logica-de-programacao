package org.example;

import java.util.Scanner;

// Efetuar a leitura dos 20 números inteiros negativos no vetor grupoA
// Criar o vetor grupoB com os valores do vetor grupoA multiplicados por -1 (convertidos para números positivos)
// Ordenar os valores do vetor grupoB de forma decrescente
// Apresentar os valores do vetor grupoB
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, aux;
        int[] grupoA = new int[20];
        int[] grupoB = new int[20];

        for (i = 0; i < 20; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextInt();
        }

        for (i = 0; i < 20; i++) {
            grupoB[i] = grupoA[i] * (-1);
        }

        for (i = 0; i < 19; i++) {
            for (j = i+1; j < 20; j++) {
                if (grupoB[i] < grupoB[j]) {
                    aux = grupoB[i];
                    grupoB[i] = grupoB[j];
                    grupoB[j] = aux;
                }
            }
        }

        System.out.println("==============================");
        System.out.println("====== Vetor B ordenado: =====");

        for (i = 0; i < 20; i++) {
            System.out.print(grupoB[i] + " ");
        }

        sc.close();
    }
}