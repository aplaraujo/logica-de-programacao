package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, soma, num;
        double media;

        soma = 0;

        for (i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            soma += num;
        }

        media = (double)soma / 10;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        sc.close();
    }
}