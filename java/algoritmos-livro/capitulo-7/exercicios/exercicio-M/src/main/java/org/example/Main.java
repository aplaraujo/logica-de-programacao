package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, aux, pesquisa;
        boolean achou;
        String resposta;

        int[] grupoA = new int[12];
        int[] grupoB = new int[12];
        int[] grupoC = new int[12];

        for (i = 0; i < 12; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextInt();
        }

        for (i = 0; i < 12; i++) {
            System.out.print("B[" + i + "]: ");
            grupoB[i] = sc.nextInt();
        }

        for (i = 0; i < 12; i++) {
            grupoC[i] = grupoA[i] * grupoB[i];
        }

        resposta = "s";

        while (resposta.equals("s") || resposta.equals("S")) {
            System.out.print("Digite um número para pesquisa: ");
            pesquisa = sc.nextInt();
            i = 0;
            achou = false;

            while ((i < 15) && (!achou)) {
                if (pesquisa == grupoC[i]) {
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