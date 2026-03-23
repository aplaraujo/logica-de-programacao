package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma nova instância do método Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Criar uma variável i
        int i;

        // Criar dois vetores grupoA e grupoB com 6 elementos cada
        int[] grupoA = new int[6];
        int[] grupoB = new int[6];

        // Ler os valores no vetor grupoA
        for (i = 0; i < 6; i++) {
            System.out.print("A[" + i + "] = ");
            grupoA[i] = sc.nextInt();
        }

        /*
            Atribuir os valores do vetor grupoA no vetor grupoB com a seguinte condição:
            Se o índice do vetor é par, colocar o elemento do vetor grupoA com índice ímpar.
            Caso contrário, colocar o elemento do vetor A com índice par
        */
        for (i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                grupoB[i] = grupoA[i + 1];
            } else {
                grupoB[i] = grupoA[i - 1];
            }
        }
        // Mostrar os vetores grupoA e grupoB
        System.out.println("================================");
        System.out.println("========== Vetor A =============");

        for (i = 0; i < 6; i++) {
            System.out.println("A[" + i + "] = " + grupoA[i]);
        }

        System.out.println("================================");
        System.out.println("========== Vetor B =============");

        for (i = 0; i < 6; i++) {
            System.out.println("B[" + i + "] = " + grupoB[i]);
        }

        // Chamar o método sc.close() para liberar memória
        sc.close();
    }
}