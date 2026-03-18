package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, fat;
        int[] grupoA = new int[15];
        int[] grupoB = new int[15];
        fat = 1;

        for (i = 0; i < 15; i++) {
            System.out.print("Digite o " + (i+1) + "o. do grupo: ");
            grupoA[i] = scan.nextInt();
        }

        for (i = 0; i < 15; i++) {
            fat = fat * grupoA[i];
            grupoB[i] = fat;
        }

        System.out.println("=========================");
        System.out.println("======== Vetor A ========");

        for (i = 0; i < 15; i++) {
            System.out.println(grupoA[i]);
        }

        System.out.println("=========================");
        System.out.println("======== Vetor B ========");

        for (i = 0; i < 15; i++) {
            System.out.println(grupoB[i]);
        }

        scan.close();
    }
}