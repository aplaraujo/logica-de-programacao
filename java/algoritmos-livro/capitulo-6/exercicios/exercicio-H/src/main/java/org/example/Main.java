package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] grupoA = new int[20];
        int[] grupoB = new int[20];

        for(i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i+1) + "o. número do grupo A: ");
            grupoA[i] = sc.nextInt();
        }

        for(i = 0; i < 20; i++) {
            grupoB[i] = grupoA[19 - i];
        }

        System.out.println("=========================");
        System.out.println("======== Vetor A ========");

        for(i = 0; i < 20; i++) {
            System.out.println(grupoA[i]);
        }

        System.out.println("=========================");
        System.out.println("======== Vetor B ========");

        for(i = 0; i < 20; i++) {
            System.out.println(grupoB[i]);
        }

        sc.close();
    }
}