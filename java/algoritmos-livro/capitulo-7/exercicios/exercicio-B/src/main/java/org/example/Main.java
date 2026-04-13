package org.example;

/*
* 1 - Efetuar a leitura dos 8 números inteiros do vetor grupoA
* 2 - Criar um vetor grupoB que vai conter os valores do vetor grupoA
* multiplicados por 5
* 3 - Ordenar de forma decrescente os valores do vetor grupoB
* 4 - Apresentar os valores do vetor grupoA a partir da pesquisa binária
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int i, j, aux, pesquisa, inicio, meio, fim;
        int[] grupoA = new int[8];
        int[] grupoB = new int[8];
        String resposta;
        boolean achou;

        // Vetor A
        for (i = 0; i < 8; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextInt();
        }

        // Vetor B
        for (i = 0; i < 8; i++) {
            grupoB[i] = grupoA[i] * 5;
        }

        // Ordenação de forma crescente
        for (i = 0; i < 7; i++) {
            for (j = i+1; j < 8; j++) {
                if (grupoB[i] > grupoB[j]) {
                    aux = grupoB[i];
                    grupoB[i] = grupoB[j];
                    grupoB[j] = aux;
                }
            }
        }

        System.out.println("===========================");
        System.out.println("===== Vetor B ordenado ====");

        // Apresentar valores do vetor B
        for (i = 0; i < 8; i++) {
            System.out.print(grupoB[i] + " ");
        }

        System.out.println();
        System.out.println("===========================");
        resposta = "s";

        while (resposta.equals("s") || resposta.equals("S")) {
            System.out.print("Digite um número para pesquisa: ");
            pesquisa = sc.nextInt();

            inicio = 0;
            meio = 0;
            fim = 8;
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
                System.out.println("O valor "+ pesquisa + " foi encontrado na posição " + meio);
            } else {
                System.out.println("O valor " + pesquisa + " não foi encontrado!");
            }

            System.out.print("Deseja continuar? ");
            resposta = sc.next();
        }

        sc.close();
    }
}