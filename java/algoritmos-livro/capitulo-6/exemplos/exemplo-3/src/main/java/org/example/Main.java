package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma, i;

        soma = 0;

        int[] A = new int[5];

        for(i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            A[i] = sc.nextInt();
        }

        for(i = 0; i < 5; i++) {
            if (A[i] % 2 != 0) {
                soma += A[i];
            }
        }

        System.out.println("Resultado: " + soma);

        sc.close();
    }
}