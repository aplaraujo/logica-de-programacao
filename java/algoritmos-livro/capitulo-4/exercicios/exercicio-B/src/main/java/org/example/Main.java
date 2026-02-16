package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, negativoParaPositivo;
        num = scanner.nextInt();

        if (num < 0) {
            negativoParaPositivo = num * (-1);
            System.out.println("Resultado: " + negativoParaPositivo);
        } else {
            System.out.println("Resultado: " + num);
        }

        scanner.close();
    }
}