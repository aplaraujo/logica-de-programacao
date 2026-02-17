package org.example;

public class Main {
    public static void main(String[] args) {
        int i, anterior, atual, proximo;
        i = 1;
        anterior = 0;
        atual = 1;

        while(i <= 15) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            System.out.println(anterior + " | " + atual + " | " + proximo);
            i++;
        }
    }
}