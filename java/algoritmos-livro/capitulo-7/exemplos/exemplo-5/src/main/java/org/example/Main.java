package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, aux;
        int[] grupoA = new int[5];
        int[] grupoB = new int[5];

        for(i = 0; i < 5; i++){
            System.out.print("Digite um número: ");
            grupoA[i] = sc.nextInt();
        }

        for(i = 0; i < 5; i++){
            grupoB[i] = grupoA[i] / 5;
        }

        System.out.println("=========================");
        System.out.println("======= Vetor B =========");

        for(i = 0; i < 5; i++){
            System.out.println(grupoB[i]);
        }

        sc.close();
    }
}