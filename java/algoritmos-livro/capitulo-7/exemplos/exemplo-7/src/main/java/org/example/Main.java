package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, aux, pesquisa, inicio, meio, fim;
        int[] grupoA = new int[10];
        int[] grupoB = new int[10];
        int[] grupoC = new int[20];
        String resposta;
        boolean encontrado;

        for(i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            grupoA[i] = sc.nextInt();
        }

        System.out.println("=========================");
        System.out.println();

        for(i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            grupoB[i] = sc.nextInt();
        }

        System.out.println("=========================");
        System.out.println();

        for(i = 0; i < 10; i++) {
            grupoC[i] = grupoA[i];
        }

        for(i = 10; i < 20; i++) {
            grupoC[i] = grupoB[i - 10];
        }

        for (i = 0; i < 19; i++) {
            for(j = i+1; j < 20; j++) {
                if(grupoC[i] > grupoC[j]) {
                    aux = grupoC[i];
                    grupoC[i] = grupoC[j];
                    grupoC[j] = aux;
                }
            }
        }

        System.out.println("=========================");
        System.out.println("====== Vetor C ==========");
        System.out.println();

        for(i = 0; i < 20; i++) {
            System.out.println(grupoC[i]);
        }

        System.out.println("=========================");
        System.out.println();

        resposta = "sim";

        while(resposta.equals("sim")) {
            System.out.print("Digite um número para pesquisa: ");
            pesquisa = sc.nextInt();

            inicio = 0;
            meio = 0;
            fim = 20;
            encontrado = false;

            while((inicio <= fim) && (!encontrado)) {
                meio = (inicio + fim) / 2;

                if (pesquisa == grupoC[meio]) {
                    encontrado = true;
                } else {
                    if(pesquisa < grupoC[meio]) fim = meio - 1;
                    else inicio = meio + 1;
                }
            }

            if(encontrado) System.out.println(pesquisa + " foi encontrado na posição " + meio);
            else System.out.println(pesquisa + " não foi encontrado!");

            System.out.print("Deseja continuar? ");
            resposta = sc.next();
        }

        sc.close();
    }
}