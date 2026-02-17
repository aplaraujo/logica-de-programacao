package org.example;

public class Main {
    public static void main(String[] args) {
        int i, soma;
        soma = 0;

        for (i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println("Resultado da soma: " + soma);
    }
}