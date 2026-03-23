package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma instância de Scanner para a entrada de dados
        Scanner sc = new Scanner(System.in);
        int i, j, num;
        i = 0;

        // Criar o vetor grupoA com 12 elementos (números inteiros)
        int[] grupoA = new int[12];

        // Criar o vetor grupoB com 12 elementos (números inteiros)
        int[] grupoB = new int[12];

        // Criar o vetor grupoC com 24 elementos (números inteiros)
        int[] grupoC = new int[24];

        j = 0;

        // Ler os valores no vetor grupoA (apenas números divisíveis por 2 ou 3, validados pelo programa)
        while(i < 12) {
            System.out.print("Digite um número divisível por 2 ou 3: ");
            num = sc.nextInt();

            if ((num % 2 == 0) || (num % 3 == 0)) {
                grupoA[i] = num;
                i++;
            } else {
                System.out.println("Valor inválido! Esse vetor aceita apenas números divisíveis por 2 ou 3!");
            }
        }

        System.out.println("===========================");

        // Ler os valores ne vetor grupoB (apenas números que não são divisíveis por 5, validados pelo programa)
        while(j < 12) {
            System.out.print("Digite um número não divisível por 5: ");
            num = sc.nextInt();

            if (!(num % 5 ==0)) {
                grupoB[j] = num;
                j++;
            } else {
                System.out.println("Valor inválido! Esse vetor aceita apenas números que não são divisíveis por 5!");
            }
        }

        // Incluir no vetor grupoC os valores dos vetores grupoA e grupoB
        for (i = 0; i < 12; i++) {
            grupoC[i] = grupoA[i];
        }

        for (i = 12; i < 24; i++) {
            grupoC[i] = grupoB[i - 12];
        }

        System.out.println("============================");
        System.out.println("======== Vetor C ===========");

        // Mostrar o vetor grupoC
        for (i = 0; i < 24; i++) {
            System.out.println(grupoC[i]);
        }

        // Chamar o método sc.close() para liberar memória
        sc.close();
    }

}