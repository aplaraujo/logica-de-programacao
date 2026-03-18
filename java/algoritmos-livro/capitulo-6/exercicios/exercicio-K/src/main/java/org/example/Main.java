package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int[] grupoA = new int[10];
        int[] grupoB = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            grupoA[i] = sc.nextInt();
        }

        for (i = 0; i < 10; i++) {
            grupoB[i] = grupoA[i] * (- 1);
        }

        System.out.println("=====================");
        System.out.println("====== Vetor B ======");

        for (i = 0; i < 10; i++) {
            System.out.println(grupoB[i]);
        }

        sc.close();
    }
}