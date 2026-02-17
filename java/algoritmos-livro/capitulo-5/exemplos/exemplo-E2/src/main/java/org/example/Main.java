package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, resultado;
        char resp = 'S';

        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            resultado = num * 3;
            System.out.println("Resultado: " + resultado);

            System.out.print("Deseja continuar?: ");
            resp = sc.next().charAt(0);

        } while (resp == 'S' || resp == 's');

        sc.close();
    }
}