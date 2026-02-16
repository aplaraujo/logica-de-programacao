package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        num = sc.nextInt();

        if (num == 1) {
            System.out.println("Você digitou o número 1");
        }

        if (num == 2) {
            System.out.println("Você digitou o número 2");
        }

        if (num < 1) {
            System.out.println("Você digitou um valor muito baixo");
        }

        if (num > 2) {
            System.out.println("Você digitou um valor muito alto");
        }

        sc.close();
    }
}