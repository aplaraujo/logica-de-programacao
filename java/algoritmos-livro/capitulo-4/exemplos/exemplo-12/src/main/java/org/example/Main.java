package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("O número " + num + " é divisível por 2 ou 3");
        }

        sc.close();
    }
}