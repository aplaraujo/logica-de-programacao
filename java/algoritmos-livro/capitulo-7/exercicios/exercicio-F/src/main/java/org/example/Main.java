package org.example;

import java.util.Objects;
import java.util.Scanner;

// Efetuar a leitura dos 30 elementos do vetor grupoA
// Criar o vetor grupoB, com os valores do vetor grupoA elevados ao cubo
// Apresentar os valores do vetor grupoB a partir da pesquisa sequencial
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, pesquisa;
        String resposta;
        boolean achou;
        int[] grupoA = new int[30];
        int[] grupoB = new int[30];

        for (i = 0; i < 30; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextInt();
        }

        for (i = 0; i < 30; i++) {
            grupoB[i] = (grupoA[i] * grupoA[i] * grupoA[i]);
        }

        System.out.println("====================================");
        resposta = "s";
        while (Objects.equals(resposta, "s")) {
            System.out.print("Digite um número para pesquisa: ");
            pesquisa = sc.nextInt();
            i = 0;
            achou = false;
            while ((i < 30) && (!achou)) {
                if (pesquisa == grupoB[i]) {
                    achou = true;
                } else {
                    i++;
                }
            }
            if (achou) {
                System.out.println(pesquisa + " foi encontrado na posição " + i);
            } else {
                System.out.println(pesquisa + " não foi encontrado!");
            }
            System.out.print("Deseja continuar? ");
            resposta = sc.next();
        }


        sc.close();
    }
}