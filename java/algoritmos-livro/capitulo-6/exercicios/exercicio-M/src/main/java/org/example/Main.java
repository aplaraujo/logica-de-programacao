package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, num;
        int[] tabuada = new int[10];

        System.out.print("Você quer ver a tabuada de qual número? ");
        num = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}