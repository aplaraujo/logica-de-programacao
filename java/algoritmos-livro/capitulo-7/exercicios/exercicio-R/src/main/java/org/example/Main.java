package org.example;

import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collator collator = Collator.getInstance(Locale.of("pt", "BR"));

        int i, j;
        String aux;

        String[] grupoA = new String[10];
        String[] grupoB = new String[5];
        String[] grupoC = new String[15];

        for (i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextLine();
        }

        System.out.println("===========================");

        for (i = 0; i < 5; i++) {
            System.out.print("B[" + i + "]: ");
            grupoB[i] = sc.nextLine();
        }

        for (i = 0; i < 10; i++) {
            grupoC[i] = grupoA[i];
        }

        for (i = 10; i < 15; i++) {
            grupoC[i] = grupoB[i - 10];
        }

        for (i = 0; i < 14; i++) {
            for (j = i+1; j < 15; j++) {
                if (collator.compare(grupoC[i], grupoC[j]) < 0) {
                    aux = grupoC[i];
                    grupoC[i] = grupoC[j];
                    grupoC[j] = aux;
                }
            }
        }

        System.out.println("===========================");
        System.out.println("==== Vetor C ordenado =====");

        for (i = 0; i < 15; i++) {
            System.out.println(grupoC[i]);
        }

        sc.close();
    }
}