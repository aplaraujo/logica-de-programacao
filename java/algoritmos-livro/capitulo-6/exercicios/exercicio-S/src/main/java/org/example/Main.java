package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma instância de Scanner para a entrada de dados
        Scanner sc = new Scanner(System.in);
        int i, j, num;
        i = 0;

        // Criar o vetor grupoA com 6 elementos (números inteiros)
        int[] grupoA = new int[6];

        // Criar o vetor grupoB com 6 elementos (números inteiros)
        int[] grupoB = new int[6];

        // Criar o vetor grupoC com 12 elementos (números inteiros)
        int[] grupoC = new int[12];

        j = 0;

        // Ler os valores no vetor grupoA (apenas números pares, validados pelo programa)
        while(i < 6) {
            System.out.print("Digite um número par: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                grupoA[i] = num;
                i++;
            } else {
                System.out.println("Valor inválido! Esse vetor aceita apenas números pares!");
            }
        }

        System.out.println("===========================");

        // Ler os valores ne vetor grupoB (apenas números ímpares, validados pelo programa)
        while(j < 6) {
            System.out.print("Digite um número ímpar: ");
            num = sc.nextInt();

            if (num % 2 != 0) {
                grupoB[j] = num;
                j++;
            } else {
                System.out.println("Valor inválido! Esse vetor aceita apenas números ímpares!");
            }
        }

        // Incluir no vetor grupoC os valores dos vetores grupoA e grupoB
        for (i = 0; i < 6; i++) {
            grupoC[i] = grupoA[i];
        }

        for (i = 6; i < 12; i++) {
            grupoC[i] = grupoB[i - 6];
        }

        System.out.println("============================");
        System.out.println("======== Vetor C ===========");

        // Mostrar o vetor grupoC
        for (i = 0; i < 12; i++) {
            System.out.println(grupoC[i]);
        }

        // Chamar o método sc.close() para liberar memória
        sc.close();
    }
}