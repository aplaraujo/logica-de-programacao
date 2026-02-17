package org.example;

public class Main {
    public static void main(String[] args) {
        int soma, i;
        soma = 0;

        for (i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("Resultado da soma: " + soma);
    }
}