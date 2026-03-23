package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma nova instância do método Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);
        // Criar uma variável i
        int i, quantidadePar, quantidadeImpar;

        // Criar um vetor grupoA com 30 elementos (números inteiros)
        int[] grupoA = new int[30];

        // Criar uma variável quantidadePar com valor inicial igual a 0
        quantidadePar = 0;

        // Criar uma variável quantidadeImpar com valor inicial igual a 0
        quantidadeImpar = 0;

        // Ler os valores no vetor grupoA
        for (i = 0; i < 30; i++) {
            System.out.print("Digite um número inteiro: ");
            grupoA[i] = sc.nextInt();
        }
        /*
            Verificar se o valor do vetor grupoA é par ou ímpar.
            Se for valor par, somar 1 à variável quantidadePar.
            Caso contrário, somar 1 à variável quantidadeImpar.
        */
        for (i = 0; i < 30; i++) {
            if (grupoA[i] % 2 == 0) {
                quantidadePar++;
            } else {
                quantidadeImpar++;
            }
        }

        // Mostrar os valores das variável quantidadePar e quantidadeImpar
        System.out.println("==============================================");
        System.out.println("Quantidade de números pares: " + quantidadePar);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpar);

        // Chamar o método sc.close() para liberar memória
        sc.close();
    }
}