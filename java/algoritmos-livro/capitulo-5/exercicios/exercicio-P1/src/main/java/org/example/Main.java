package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int soma, i;
        double media;

        soma = 0;
        i = 50;

        while(i <= 70) {
            soma += i;
            i++;
        }

        media = (double)soma / i;

        System.out.println("Soma: " + soma);
        System.out.println(String.format("Média: %.2f", media));
    }
}