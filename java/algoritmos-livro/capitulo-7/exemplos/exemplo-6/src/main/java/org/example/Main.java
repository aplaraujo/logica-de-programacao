package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, pesquisa;
        int[] grupoA = new int[5];
        int[] grupoB = new int[5];
        int[] grupoC = new int[5];
        String resposta;
        boolean encontrado;

        for(i = 0; i < 5; i++){
            System.out.print("Digite um número: ");
            grupoA[i] = sc.nextInt();
        }

        System.out.println("===========================");
        System.out.println();

        for(i = 0; i < 5; i++){
            System.out.print("Digite um número: ");
            grupoB[i] = sc.nextInt();
        }

        System.out.println("===========================");
        System.out.println();

        for(i = 0; i < 5; i++){
            grupoC[i] = grupoA[i] - grupoB[i];
        }

        System.out.println("===========================");
        System.out.println();

        System.out.println("===========================");
        System.out.println("====== Vetor C ============");
        System.out.println();

        for(i = 0; i < 5; i++){
            System.out.println(grupoC[i]);
        }

        resposta = "sim";

        while(resposta.equals("sim")){
            System.out.print("Digite um número para pesquisa: ");
            pesquisa = sc.nextInt();
            i = 0;
            encontrado = false;

            while((i < 5) && (!encontrado)){
                if (pesquisa == grupoC[i]){
                    encontrado = true;
                } else {
                    i++;
                }
            }

            if(encontrado) System.out.println(pesquisa + " foi localizado na posição " + i);
            else System.out.println(pesquisa + " não foi localizado!");

            System.out.print("Deseja continuar? ");
            resposta = sc.next();
        }

        sc.close();
    }
}