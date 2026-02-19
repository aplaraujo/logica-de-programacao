package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior, menor, i, num;

        i = 0;

        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();

        maior = num;
        menor = num;

        while(num > 0) {
            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }

            System.out.print("Digite um número inteiro: ");
            num = sc.nextInt();
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        sc.close();
    }
}