package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, mult;
        num = sc.nextInt();

        mult = num * 2;

        if (mult >= 30) {
            System.out.println("Resultado: " + mult);
        }


        sc.close();
    }
}