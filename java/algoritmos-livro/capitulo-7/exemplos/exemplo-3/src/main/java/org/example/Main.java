package org.example;

import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collator collator = Collator.getInstance(Locale.of("pt", "BR"));

        int i, j, inicio, meio, fim;
        String[] nome = new String[6];
        String pesquisa, resposta, aux;
        boolean encontrado;

        for(i = 0; i < 6; i++){
            System.out.print("Digite um nome: ");
            nome[i] = sc.nextLine();
        }

        for (i = 0; i < 5; i++){
            for(j = i+1; j < 6; j++) {
                if (collator.compare(nome[i], nome[j]) > 0){
                    aux = nome[i];
                    nome[i] = nome[j];
                    nome[j] = aux;
                }
            }
        }

        System.out.println("=======================");
        System.out.println("Vetor ordenado");
        System.out.println("=======================");

        for (i = 0; i < 6; i++){
            System.out.println("Nome [" + i + "] = " + nome[i]);
        }

        resposta = "sim";

        while(resposta.equals("sim")){
            System.out.print("Digite um nome para pesquisa: ");
            pesquisa = sc.nextLine();

            inicio = 0;
            meio = 0;
            fim = 5;
            encontrado = false;

            while((inicio <= fim) && (!encontrado)){
                meio = (inicio + fim) / 2;

                if (pesquisa.equals(nome[meio])){
                    encontrado = true;
                } else {
                    if (collator.compare(pesquisa, nome[meio]) < 0) {
                        fim = meio - 1;
                    } else {
                        inicio = meio + 1;
                    }
                }
            }

            if (encontrado){
                System.out.println(pesquisa + " foi localizado na posição " + meio);
            } else {
                System.out.println(pesquisa + " não foi localizado :(");
            }

            System.out.print("Deseja continuar? ");
            resposta = sc.nextLine();
        }

        sc.close();
    }
}