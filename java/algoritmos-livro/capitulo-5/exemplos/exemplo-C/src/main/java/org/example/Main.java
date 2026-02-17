package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, fat, num;
        char resp = 'S';

        do {
           fat = 1;
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            for (i = 1; i <= num; i++) {
                fat *= i;
            }
            System.out.println("Fatorial de " + num + ": " + fat);

            System.out.print("Deseja continuar? ");
            resp = sc.next().charAt(0);

        } while (resp == 'S' || resp == 's');

        sc.close();
    }
}