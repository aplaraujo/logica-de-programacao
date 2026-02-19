package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, num;
        System.out.print("Quantos números você vai digitar? ");
        num = sc.nextInt();

        int[] numArr = new int[num];

        for(i = 0; i < num; i++) {
            System.out.print("Digite um número: ");
            numArr[i] = sc.nextInt();
        }

        System.out.println("Números digitados: ");
        for(i = 0; i < num; i++) {
            System.out.println(numArr[i]);
        }

        sc.close();
    }
}