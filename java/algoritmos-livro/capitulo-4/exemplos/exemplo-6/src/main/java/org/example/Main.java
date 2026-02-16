package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero >= 20 && numero <= 90) {
            System.out.println("O número está na faixa de 20 a 90");
        } else {
            System.out.println("O número não está na faixa de 20 a 90");
        }

        sc.close();
    }
}