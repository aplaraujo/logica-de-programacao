package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma, i, num;
        double media;

        soma = 0;
        i = 0;

        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();

        while(num != 0) {
            soma += num;
            System.out.print("Digite um número inteiro: ");
            num = sc.nextInt();
            i++;
        }

        media = (double)soma / i;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        sc.close();
    }
}