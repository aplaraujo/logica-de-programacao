package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma nova instância do método Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Criar uma variável i
        int i;

        // Criar um variável porcentagemImpar
        double porcentagemImpar;

        // Criar uma variável quantidadeImpar com valor inicial igual a 0
        int quantidadeImpar = 0;

        // Criar um vetor grupoA com 10 elementos
        int[] grupoA = new int[10];

        // Ler os valores no vetor grupoA
        for (i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            grupoA[i] = sc.nextInt();
        }

        // Verificar se o valor do vetor grupoA é ímpar. Se sim, somar 1 à variável quantidadeImpar
        for (i = 0; i < 10; i++) {
            if (grupoA[i] % 2 != 0) {
                quantidadeImpar++;
            }
        }

        // Calcular a porcentagem de valores ímpares
        porcentagemImpar = ((double) quantidadeImpar / grupoA.length) * 100;

        // Mostrar os valores das variáveis quantidadeImpar e porcentagemImpar
        System.out.println("======================================");
        System.out.println("Quantidade de números ímpares: " + quantidadeImpar);
        System.out.println("Porcentagem de números ímpares: " + porcentagemImpar + "%");

        // Chamar o método sc.close() para liberar memória
        sc.close();
    }
}