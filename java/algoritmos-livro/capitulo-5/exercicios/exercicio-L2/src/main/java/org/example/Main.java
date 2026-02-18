package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, fat, num, soma;
        fat = 1;
        soma = 0;

        for (i = 1; i <= 15; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            fat *= num;
            soma += fat;
        }
        System.out.println("Resultado da soma: " + BigInteger.valueOf(soma));

        sc.close();
    }
}