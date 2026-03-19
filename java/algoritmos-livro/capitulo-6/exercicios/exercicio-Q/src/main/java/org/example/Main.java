package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma nova instância do método Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Criar uma variável i (tipo inteiro)
        int i;

        // Criar um vetor grupoA com 15 elementos (tipo real)
        double[] grupoA = new double[15];

        // Criar um vetor grupoB com 15 elementos (tipo real)
        double[] grupoB = new double[15];

        // Ler os valores no vetor grupoA
        for (i = 0; i < 15; i++) {
            System.out.print("Digite um número: ");
            grupoA[i] = sc.nextDouble();
        }

        // Ler os valores do vetor grupoA no vetor grupoB da seguinte forma:
        // Os elementos que estão no índice par devem ser divididos por 2
        // Os elementos que estão no índice ímpar devem ser multiplicados por 1.5
        for (i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                grupoB[i] = grupoA[i] / 2;
            } else {
                grupoB[i] = grupoA[i] * 1.5;
            }
        }

        // Mostrar os valores do vetor grupoB
        System.out.println("=========================");
        System.out.println("======= Vetor B =========");

        for (i = 0; i < 15; i++) {
            System.out.println(grupoB[i]);
        }

        // Chamar o método sc.close() para liberar memória
        sc.close();
    }
}