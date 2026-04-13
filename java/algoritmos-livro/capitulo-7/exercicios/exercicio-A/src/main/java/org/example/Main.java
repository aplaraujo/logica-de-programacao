package org.example;

/*
* 1 - Efetuar a leitura dos 12 números inteiros do vetor grupoA
* 2 - Ordenar de forma decrescente os valores do vetor grupoA
* 3 - Apresentar os valores do vetor grupoA
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, aux;
        int[] grupoA = new int[12];

        for (i = 0; i < 12; i++) {
            System.out.print("A [" + (i) + "]: ");
            grupoA[i] = sc.nextInt();
        }

        for (i = 0; i < 11; i++) {
            for (j = i+1; j < 12; j++) {
                if(grupoA[i] < grupoA[j]) {
                    aux = grupoA[i];
                    grupoA[i] = grupoA[j];
                    grupoA[j] = aux;
                }
            }
        }

        System.out.println("=======================");
        System.out.println("======= Vetor A =======");

        for (i = 0; i < 12; i++) {
            System.out.print(grupoA[i] + " ");
        }

        sc.close();
    }
}