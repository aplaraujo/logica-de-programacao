package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma nova instância do método Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Criar uma variável i
        int i;

        // Criar três vetores grupoA, grupoB e grupoC com 10 elementos
        int[] grupoA = new int[10];
        int[] grupoB = new int[10];
        int[] grupoC = new int[10];

        // Ler os valores nos vetores grupoA e grupoB
        for (i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            grupoA[i] = sc.nextInt();
        }

        System.out.println("=================================");

        for (i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            grupoB[i] = sc.nextInt();
        }
        // Incluir o quadrado da soma dos vetores grupoA e grupoB no vetor grupoC
        for (i = 0; i < 10; i++) {
            var soma = grupoA[i] + grupoB[i];
            grupoC[i] = (soma * soma);
        }
        // Mostrar o vetor grupoC
        System.out.println("=================================");
        System.out.println("========== Vetor C ==============");

        for (i = 0; i < 10; i++) {
            System.out.println(grupoC[i]);
        }

        // Chamar o método sc.close() para liberar memória
        sc.close();
    }
}