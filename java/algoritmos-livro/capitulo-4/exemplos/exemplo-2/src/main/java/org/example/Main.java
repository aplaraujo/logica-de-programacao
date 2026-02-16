package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2, sum, result;
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        sum = num1 + num2;


        if (sum >= 10) {
            result = sum + 5;
        } else {
            result = sum - 7;
        }

        System.out.println("Resultado: " + result);

        sc.close();
    }
}