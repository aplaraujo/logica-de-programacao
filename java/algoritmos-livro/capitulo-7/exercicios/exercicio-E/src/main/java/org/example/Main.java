package org.example;

import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collator brCollator = Collator.getInstance(Locale.of("pt", "BR"));

        int i, j;
        String[] grupoA = new String[20];
        String[] grupoB = new String[30];
        String[] grupoC = new String[50];
        String aux;

        // Efetuar a leitura dos 20 nomes no vetor grupoA
        for (i = 0; i < 20; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextLine();
        }

        System.out.println("=======================");

        // Efetuar a leitura dos 30 nomes no vetor grupoB
        for (i = 0; i < 30; i++) {
            System.out.print("B[" + i + "]: ");
            grupoB[i] = sc.nextLine();
        }

        // Criar um vetor grupoC com a junção dos elementos dos vetores grupoA e grupoB
        for (i = 0; i < 20; i++) {
            grupoC[i] = grupoA[i];
        }

        for (i = 20; i < 50; i++) {
            grupoC[i] = grupoB[i - 20];
        }

        // Ordenar os valores do vetor grupoC em ordem decrescente
        for (i = 0; i < 49; i++) {
            for (j = i+1; j < 50; j++) {
                if (brCollator.compare(grupoC[i], grupoC[j]) < 0) {
                    aux = grupoC[i];
                    grupoC[i] = grupoC[j];
                    grupoC[j] = aux;
                }
            }
        }

        // Apresentar os valores do vetor grupoC
        System.out.println("==============================");
        System.out.println("===== Vetor C Ordenado =======");

        for (i = 0; i < 50; i++) {
            System.out.println(grupoC[i]);
        }

        sc.close();
    }
}