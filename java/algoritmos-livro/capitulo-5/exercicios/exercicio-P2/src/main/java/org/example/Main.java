package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int i, soma;
        double media;

        soma = 0;

        for (i = 50; i <= 70; i++) {
            soma += i;
        }

        media = (double)soma / i;

        System.out.println("Soma: " + soma);
        System.out.println(String.format("Média: %.2f", media));
    }
}