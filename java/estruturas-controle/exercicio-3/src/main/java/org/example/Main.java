package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        char opcao;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        if (n2 < n1) {
            System.out.println("digite um número maior que " + n2);
            n2 = sc.nextInt();
        }

        System.out.print("Digite p para par ou i para ímpar: ");
        opcao = sc.next().charAt(0);

        for (int i = n2; i > n1; i--) {
            if ((opcao == 'p' || opcao == 'P') && (i % 2 == 0)) {
                System.out.println(i);
            }

            if ((opcao == 'i' || opcao == 'I') && (i % 2 != 0)) {
                System.out.println(i);
            }
        }


        sc.close();
    }
}