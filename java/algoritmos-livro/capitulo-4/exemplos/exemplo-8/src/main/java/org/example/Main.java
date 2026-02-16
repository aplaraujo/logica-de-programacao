package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 4 == 0 && num % 5 == 0) {
            System.out.println("O número " + num + " é divisível por 4 e 5");
        } else {
            System.out.println("O número " + num + " não é divisível por 4 nem por 5");
        }

        sc.close();
    }
}