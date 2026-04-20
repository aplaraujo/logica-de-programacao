package org.example;

// Criar duas variáveis i e j do tipo número inteiro
// Criar quatro variáveis inicio, meio, fim e aux do tipo número inteiro
// Criar uma variável pesquisa do tipo número inteiro
// Criar uma variável resposta do tipo cadeia de caracteres
// Criar uma variável achou do tipo lógico
// Efetuar a leitura dos 20 números inteiros do vetor grupoA
// Criar um vetor grupoB com os valores do vetor grupoA somados por 2
// Ordenar os valores do vetor grupoB em ordem crescente
// Mostrar os valores do vetor grupoB com pesquisa binária

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, aux, inicio, meio, fim, pesquisa;
        String resposta;
        boolean achou;
        int[] grupoA = new int[20];
        int[] grupoB = new int[20];

        for (i = 0; i < 20; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextInt();
        }

        for (i = 0; i < 20; i++) {
            grupoB[i] = grupoA[i] + 2;
        }

        for (i = 0; i < 19; i++) {
            for (j = i+1; j < 20; j++) {
                if (grupoB[i] > grupoB[j]) {
                    aux = grupoB[i];
                    grupoB[i] = grupoB[j];
                    grupoB[j] = aux;
                }
            }
        }
        System.out.println("============================");
        System.out.println("===== Vetor B ordenado =====");

        for (i = 0; i < 20; i++) {
            System.out.print(grupoB[i] + " ");
        }

        System.out.println();
        System.out.println("============================");
        resposta = "s";

        while (resposta.equals("s") || resposta.equals("S")) {
            System.out.print("Digite um número para pesquisa: ");
            pesquisa = sc.nextInt();
            inicio = 0;
            meio = 0;
            fim = 20;
            achou = false;
            while ((inicio <= fim) && (!achou)) {
                meio = (inicio + fim) / 2;

                if (pesquisa == grupoB[meio]) {
                    achou = true;
                } else {
                    if (pesquisa < grupoB[meio]) {
                        fim = meio - 1;
                    } else {
                        inicio = meio + 1;
                    }
                }
            }

            if (achou) {
                System.out.println(pesquisa + " foi encontrado na posição: " + meio);
            } else {
                System.out.println(pesquisa + " não foi encontrado!");
            }

            System.out.print("Deseja continuar? ");
            resposta = sc.next();
        }

        sc.close();
    }
}