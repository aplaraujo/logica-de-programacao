package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma nova instância do método Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Criar uma variável i (tipo inteiro)
        int i;

        // Criar um vetor grupoA com 12 elementos (tipo inteiro)
        int[] grupoA = new int[12];

        // Criar um vetor grupoB com 12 elementos (tipo inteiro)
        int[] grupoB = new int[12];

        // Ler todos os valores no vetor grupoA
        for (i = 0; i < 12; i++) {
            System.out.print("Digite um número: ");
            grupoA[i] = sc.nextInt();
        }

        // Atribuir os valores do vetor grupoA ao vetor grupoB da seguinte forma:
        // Se o valor é ímpar, multiplicá-lo por 2. Caso contrário, deixar do jeito que está
        for (i = 0; i < 12; i++) {
            if (grupoA[i] % 2 != 0) {
                grupoB[i] = grupoA[i] * 2;
            } else {
                grupoB[i] = grupoA[i];
            }
        }

        // Mostrar os valores do vetor grupoB
        System.out.println("============================");
        System.out.println("========= Vetor B ==========");

        for (i = 0; i < 12; i++) {
            System.out.println(grupoB[i]);
        }

        // Chamar o método sc.close() para liberar memória
        sc.close();
    }
}