package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, num, resultado;

        for (i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            resultado = num * 3;

            System.out.println("Resultado " + resultado);
        }

        sc.close();
    }
}