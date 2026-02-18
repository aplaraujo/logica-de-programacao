package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, fat, num, soma;

        i = 1;
        fat = 1;
        soma = 0;

        while(i <= 15) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            fat = fat * num;
            soma += fat;
            i++;
        }

        System.out.println("Resultado da soma: " + BigInteger.valueOf(soma));

        sc.close();
    }
}