package org.example;

public class Main {
    public static void main(String[] args) {
        int soma, i;
        i = 1;
        soma = 0;

        while (i <= 100) {
            soma += i;
            i++;
        }

        System.out.println("Resultado da soma: " + soma);
    }
}