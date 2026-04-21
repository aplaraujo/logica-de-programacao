package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, aux, inicio, meio, fim, pesquisa;
        String resposta;
        boolean achou;

        int[] grupoA = new int[15];
        int[] grupoB = new int[15];
        int[] grupoC = new int[15];
        int[] grupoD = new int[15];

        for (i = 0; i < 15; i++) {
            System.out.print("A[" + "]: ");
            grupoA[i] = sc.nextInt();
        }

        for (i = 0; i < 15; i++) {
            System.out.print("B[" + "]: ");
            grupoB[i] = sc.nextInt();
        }

        for (i = 0; i < 15; i++) {
            System.out.print("C[" + "]: ");
            grupoC[i] = sc.nextInt();
        }

        for (i = 0; i < 15; i++) {
            grupoD[i] = (grupoA[i] + grupoB[i] + grupoC[i]);
        }

        for (i = 0; i < 14; i++) {
            for (j = i+1; j < 15; j++) {
                if (grupoD[i] > grupoD[j]) {
                    aux = grupoD[i];
                    grupoD[i] = grupoD[j];
                    grupoD[j] = aux;
                }
            }
        }

        resposta = "s";

        while (resposta.equals("s") || resposta.equals("S")) {
            System.out.print("Digite um número para pesquisa: ");
            pesquisa = sc.nextInt();
            inicio = 0;
            meio = 0;
            fim = 15;
            achou = false;

            while ((inicio < fim) && (!achou)) {
                meio = (inicio + fim) / 2;
                if (pesquisa == grupoD[meio]) {
                    achou = true;
                } else {
                    if (pesquisa < grupoD[meio]) {
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