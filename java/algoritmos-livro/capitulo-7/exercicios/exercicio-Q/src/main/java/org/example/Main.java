package org.example;

import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collator collator = Collator.getInstance(Locale.of("pt", "BR"));

        int i, j, inicio, meio, fim;
        String aux, resposta, pesquisa;
        boolean achou;

        String[] grupoA = new String[10];

        for (i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            grupoA[i] = sc.nextLine();
        }

        for (i = 0; i < 9; i++) {
            for (j = i+1; j < 10; j++) {
                if (collator.compare(grupoA[i], grupoA[j]) > 0) {
                    aux = grupoA[i];
                    grupoA[i] = grupoA[j];
                    grupoA[j] = aux;
                }
            }
        }

        resposta = "s";

        while (resposta.equals("s") || resposta.equals("S")) {
            System.out.print("Digite um número para pesquisa: ");
            pesquisa = sc.nextLine();

            inicio = 0;
            meio = 0;
            fim = 10;
            achou = false;

            while ((inicio < fim) && (!achou)) {
                meio = (inicio + fim) / 2;
                if (pesquisa == grupoA[meio]) {
                    achou = true;
                } else {
                    if(collator.compare(pesquisa, grupoA[i]) < 0) {
                        fim = meio - 1;
                    } else {
                        inicio = meio + 1;
                    }
                }
            }

            if (achou) System.out.println(pesquisa + " foi encontrado na posição: " + meio);
            else System.out.println(pesquisa + " não foi encontrado!");

            System.out.print("Deseja continuar? ");
            resposta = sc.next();
        }

        sc.close();
    }
}