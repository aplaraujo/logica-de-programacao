package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma nova instância do método Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Criar uma variável i (tipo inteiro)
        int i;

        // Criar um vetor temperaturasC com 5 elementos (tipo real)
        double[] temperaturasC = new double[5];

        // Criar um vetor temperaturasF com 5 elementos (tipo real)
        double[] temperaturasF = new double[5];

        // Ler os valores no vetor temperaturasC
        for (i = 0; i < 5; i++) {
            System.out.print("Digite uma temperatura em Celsius: ");
            temperaturasC[i] = sc.nextDouble();
        }

        // Atribuir ao vetor temperaturasF todos os valores do vetor temperaturasC convertidos para Fahrenheit
        for (i = 0; i < 5; i++) {
            temperaturasF[i] = (temperaturasC[i] * ((double) 9 / 5)) + 32;
        }
        // Mostrar os valores dos vetores temperaturasC e temperaturasF
        System.out.println("===============================");
        System.out.println("=== Temperaturas em Celsius ===");

        for (i = 0; i < 5; i++) {
            System.out.println(temperaturasC[i]);
        }

        System.out.println("==================================");
        System.out.println("=== Temperaturas em Fahrenheit ===");

        for (i = 0; i < 5; i++) {
            System.out.println(temperaturasF[i]);
        }

        // Chamar o método sc.close() para liberar memória
        sc.close();
    }
}