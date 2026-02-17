package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, E, maior, menor;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        E = sc.nextInt();

        maior = A;
        menor = A;

        if (B > maior) {
            maior = B;
        }

        if (B < menor) {
            menor = B;
        }

        if (C > maior) {
            maior = C;
        }

        if (C < menor) {
            menor = C;
        }

        if (D > maior) {
            maior = D;
        }

        if (D < menor) {
            menor = D;
        }

        if (E > maior) {
            maior = E;
        }

        if (E < menor) {
            menor = E;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);

        sc.close();
    }
}