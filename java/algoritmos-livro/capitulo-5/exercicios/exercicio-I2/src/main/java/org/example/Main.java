package org.example;

public class Main {
    public static void main(String[] args) {
        int i, anterior, atual, proximo;
        anterior = 0;
        atual = 1;

        for (i = 1; i <= 15; i++) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            System.out.println(anterior + " | " + atual + " | " + proximo);
        }
    }
}