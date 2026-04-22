package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, pesquisa;
        String resposta;
        boolean achou;

        int[] grupoA = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextInt();
        }

        resposta = "s";

        while (resposta.equals("s") || resposta.equals("S")) {
            System.out.print("Digite um número para pesquisa: ");
            pesquisa = sc.nextInt();

            i = 0;
            achou = false;
            while ((i < 10) && (!achou)) {
                if (pesquisa == grupoA[i]) {
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