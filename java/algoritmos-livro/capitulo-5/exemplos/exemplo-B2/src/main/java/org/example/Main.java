package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, fat;

        i = 1;
        fat = 1;

        do {
            fat *= i;
            i++;
        } while (i <= 5);

        System.out.println("Fatorial: " + fat);

        sc.close();
    }
}