package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, soma, num;
        double media;

        soma = 0;
        i = 1;

        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();

        do {
            soma += num;
            System.out.print("Digite um número inteiro: ");
            num = sc.nextInt();

            i++;
        } while(num > 0);

        media = (double)soma / i;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        sc.close();
    }
}