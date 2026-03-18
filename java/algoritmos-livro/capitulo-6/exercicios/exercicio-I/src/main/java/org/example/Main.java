package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] grupoA = new int[5];
        int[] grupoB = new int[5];
        int[] grupoC = new int[5];
        int[] grupoD = new int[15];

        for(i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "o. número do grupo A: ");
            grupoA[i] = sc.nextInt();
        }

        for(i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "o. número do grupo B: ");
            grupoB[i] = sc.nextInt();
        }

        for(i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "o. número do grupo C: ");
            grupoC[i] = sc.nextInt();
        }

        for(i = 0; i < 5; i++) {
            grupoD[i] = grupoA[i];
        }

        for(i = 5; i < 10; i++) {
            grupoD[i] = grupoB[i - 5];
        }

        for(i = 10; i < 15; i++) {
            grupoD[i] = grupoC[i - 10];
        }

        System.out.println("=======================");
        System.out.println("====== Vetor D ========");

        for(i = 0; i < 15; i++) {
            System.out.println(grupoD[i]);
        }

        sc.close();
    }
}