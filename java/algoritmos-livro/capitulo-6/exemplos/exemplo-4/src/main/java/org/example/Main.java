package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, soma, num;

        soma = 0;

        System.out.print("Quantos números você vai digitar? ");
        num = sc.nextInt();

        int[] A = new int[num];

        for(i = 0; i < num; i++) {
            System.out.print("Digite um número: ");
            A[i] = sc.nextInt();
        }

        for(i = 0; i < num; i++) {
            if (A[i] % 2 == 0) {
                soma += A[i];
            }
        }

        System.out.println("Resultado: " + soma);

        sc.close();
    }
}