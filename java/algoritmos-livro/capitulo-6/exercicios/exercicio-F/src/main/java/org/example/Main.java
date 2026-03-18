package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] grupoA = new int[15];
        int[] grupoB = new int[15];
        int[] grupoC = new int[30];

        for (i = 0; i < 15; i++) {
            System.out.print("Digite o " + (i+1) + "o. número do grupo A: ");
            grupoA[i] = sc.nextInt();
        }

        for (i = 0; i < 15; i++) {
            System.out.print("Digite o " + (i+1) + "o. número do grupo B: ");
            grupoB[i] = sc.nextInt();
        }

        for (i = 0; i < 15; i++) {
            grupoC[i] = grupoA[i];
        }

        for (i = 15; i < 30; i++) {
            grupoC[i] = grupoB[i - 15];
        }

        System.out.println("======================");
        System.out.println("====== Vetor C =======");

        for (i = 0; i < 30; i++) {
            System.out.println(grupoC[i]);
        }

        sc.close();
    }
}