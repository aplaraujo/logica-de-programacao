package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma nova instância do método Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Criar uma variável i
        int i;

        // Criar uma variável quantidadePar com valor inicial 0
        int quantidadePar = 0;

        // Criar um vetor grupoA com 15 elementos
        int[] grupoA = new int[15];

        // Ler os valores no vetor grupoA
        for (i = 0; i < 15; i++) {
            System.out.print("A[" + i + "] = ");
            grupoA[i] = sc.nextInt();
        }

        // Verificar se o valor do vetor grupoA é par. Se sim, somar 1 à variável quantidadePar
        for (i = 0; i < 15; i++) {
            if (grupoA[i] % 2 == 0) {
                quantidadePar++;
            }
        }

        // Mostrar o valor da variável quantidadePar
        System.out.println("========================================");
        System.out.println("Quantidade de números pares: " + quantidadePar);

        // Chamar o método sc.close() para liberar memória
        sc.close();
    }
}