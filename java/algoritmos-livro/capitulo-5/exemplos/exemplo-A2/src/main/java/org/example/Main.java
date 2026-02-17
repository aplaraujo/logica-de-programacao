package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, num, resultado;
        i = 1;

        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            resultado = num * 3;
            System.out.println("Resultado: " + resultado);
            i++;
        } while (i <= 5);

        sc.close();
    }
}