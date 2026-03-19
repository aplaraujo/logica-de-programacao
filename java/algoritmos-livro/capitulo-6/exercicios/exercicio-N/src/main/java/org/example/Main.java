package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criar a variável i (tipo inteiro)
        int i;

        // Criar as variáveis soma, media, maiorTemperatura e menorTemperatura (tipo real)
        double maiorTemperatura, menorTemperatura, soma, media;

        // Criar um vetor com 5 elementos
        double[] temperaturas = new double[5];

        // Atribuir à variável soma o valor inicial 0
        soma = 0.0;

        // Ler todos os valores para inclusão no vetor de temperaturas
        for (i = 0; i < 5; i++) {
            System.out.print("Digite uma temperatura: ");
            temperaturas[i] = sc.nextDouble();
        }

        // Efetuar a adição da varável soma com cada elemento do vetor, atribuindo o resultado à variável soma
        for (i = 0; i < 5; i++) {
            soma += temperaturas[i];
        }

        // Atribuir o primeiro elemento do vetor à variável maiorTemperatura
        maiorTemperatura = temperaturas[0];

        // Atribuir o primeiro elemento do vetor à variável menorTemperatura
        menorTemperatura = temperaturas[0];

        // Verificar se um elemento do vetor é maior do que o valor da variável maiorTemperatura
        // Se sim, maiorTemperatura vai receber o valor do vetor
        for (i = 0; i < 5; i++) {
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
        }

        // Verificar se um elemento do vetor é menor do que o valor da variável menorTemperatura
        // Se sim, menorTemperatura vai receber o valor do vetor
        for (i = 0; i < 5; i++) {
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
            }
        }

        // Calcular a média das temperaturas
        media = soma / temperaturas.length;

        // Mostrar a menor temperatura, a maior temperatura e a média
        System.out.println("Menor temperatura: " + menorTemperatura);
        System.out.println("Maior temperatura: " + maiorTemperatura);
        System.out.println("Média: " + media);

        sc.close();
    }
}