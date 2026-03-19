package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma nova instância do método Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Criar as variáveis i e j (tipo inteiro)
        int i, j;

        // Criar os vetores grupoA, grupoB, grupoC e grupoD com 6 elementos cada
        int[] grupoA = new int[6];
        int[] grupoB = new int[6];
        int[] grupoC = new int[6];
        int[] grupoD = new int[6];

        // Atribuir o valor 0 à variável j
        j = 0;

        // Ler os valores no vetor grupoA
        for (i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            grupoA[i] = sc.nextInt();
        }

        System.out.println("=======================");

        // Ler os valores no vetor grupoB
        for (i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            grupoB[i] = sc.nextInt();
        }
        // Atribuir os valores que estão nos índices ímpares dos vetores grupoA e grupoB ao vetor grupoC
        // Incrementar o valor da variável j em 1

        System.out.println("============================");
        System.out.println("======== Vetor C ===========");

        for (i = 0; i < 6; i++) {
            if (i % 2 != 0) {
                grupoC[j] = grupoA[i];
                System.out.println("C[" + j + "] = " + grupoC[j]);
                j++;
                grupoC[j] = grupoB[i];
                System.out.println("C[" + j + "] = " + grupoC[j]);
                j++;
            }
        }


        // Atribuir o valor 0 à variável j
        j = 0;

        // Atribuir os valores que estão nos índices pares dos vetores grupoA e grupoB ao vetor grupoD
        // Incrementar o valor da variável j em 1

        System.out.println("============================");
        System.out.println("======== Vetor D ===========");

        for (i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                grupoD[j] = grupoA[i];
                System.out.println("D[" + j + "] = " + grupoD[j]);
                j++;
                grupoD[j] = grupoB[i];
                System.out.println("D[" + j + "] = " + grupoD[j]);
                j++;
            }
        }

        // Mostrar os valores dos vetores grupoC e grupoD


        // Chamar o método sc.close() para liberar memória
        sc.close();
    }
}