package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double sum = num1 + num2;

        if (sum > 10) {
            System.out.println("Resultado da soma: " + sum);
        }

        sc.close();
    }
}