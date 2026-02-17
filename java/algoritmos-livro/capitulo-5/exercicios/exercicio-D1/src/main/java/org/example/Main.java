package org.example;

public class Main {
    public static void main(String[] args) {
        int i, soma;
        i = 1;
        soma = 0;

        while(i <= 500) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }
        System.out.println("Resultado da soma: " + soma);
    }
}