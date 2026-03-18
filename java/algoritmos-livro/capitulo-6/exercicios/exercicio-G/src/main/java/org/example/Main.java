package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        String[] grupoA = new String[20];
        String[] grupoB = new String[30];
        String[] grupoC = new String[50];

        for (i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i+1) + "o. nome do grupo A: ");
            grupoA[i] = sc.nextLine();
        }

        System.out.println("==============================");

        for (i = 0; i < 30; i++) {
            System.out.print("Digite o " + (i+1) + "o. nome do grupo B: ");
            grupoB[i] = sc.nextLine();
        }

        for (i = 0; i < 20; i++) {
            grupoC[i] = grupoA[i];
        }

        for (i = 20; i < 50; i++) {
            grupoC[i] = grupoB[i - 20];
        }

        System.out.println("=====================");
        System.out.println("======= Vetor C =====");

        for (i = 0; i < 50; i++) {
            System.out.println(grupoC[i]);
        }

        sc.close();
    }
}