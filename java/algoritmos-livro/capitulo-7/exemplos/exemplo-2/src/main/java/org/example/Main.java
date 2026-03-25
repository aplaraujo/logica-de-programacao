package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        String[] nome = new String[5];
        String pesquisa, resposta;
        boolean encontrado;

        for(i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            nome[i] = sc.nextLine();
        }

        resposta = "sim";

        while(resposta.equals("sim")) {
            System.out.print("Digite um nome para pesquisa: ");
            pesquisa = sc.nextLine();

            i = 0;
            encontrado = false;

            while((i < 5) && (encontrado == false)) {
                if (pesquisa.equals(nome[i])) {
                    encontrado = true;
                } else {
                    i++;
                }
            }

            if (encontrado == true) {
                System.out.println(pesquisa + " foi encontrado na posição " + i);
            } else {
                System.out.println(pesquisa + " não foi encontrado");
            }

            System.out.print("Deseja continuar? ");
            resposta = sc.nextLine();
        }

        sc.close();
    }
}