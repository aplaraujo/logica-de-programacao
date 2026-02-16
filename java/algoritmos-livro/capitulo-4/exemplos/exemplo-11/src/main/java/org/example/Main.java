package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if ((A < B + C) && (B < A + C) && (C < A + B)) {
            if ((A == B) && (B == C)) {
                System.out.println("Triângulo equilátero");
            } else {
                if ((A == B) || (A == C) || (C == B)) {
                    System.out.println("Triângulo isóceles");
                } else {
                    System.out.println("Triângulo escaleno");
                }
            }
        } else {
            System.out.println("Não forma um triângulo");
        }

        sc.close();
    }
}