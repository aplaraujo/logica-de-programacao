package org.example;

import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collator collator = Collator.getInstance(Locale.of("pt", "BR"));

        int i, j, inicio, fim;
        String aux;

        String[] grupoA = new String[10];
        String[] grupoB = new String[10];

        for (i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextLine();
        }

        System.out.println("========================");
        System.out.println("== Vetor B invertido: ==");

        inicio = 0;
        fim = grupoA.length - 1;

        for (i = 0; i < 10; i++) {
            grupoB[i] = grupoA[inicio];
            grupoA[inicio] = grupoA[fim];
            grupoA[fim] = grupoB[i];
            inicio++;
            fim--;
        }

        System.out.println("=========================");
        System.out.println("== Vetor B ascendente: ==");

        for (i = 0; i < 9; i++) {
            for (j = i+1; j < 10; j++) {
                if (collator.compare(grupoB[i], grupoB[j]) > 0) {
                    aux = grupoB[i];
                    grupoB[i] = grupoB[j];
                    grupoB[j] = aux;
                }
            }
        }

        for (i = 0; i < 10; i++) {
            System.out.print(grupoB[i] + " ");
        }

        sc.close();
    }
}