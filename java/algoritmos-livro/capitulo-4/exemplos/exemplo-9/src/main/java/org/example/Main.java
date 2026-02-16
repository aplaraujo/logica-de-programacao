package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N;
        double R = 0.0;

        N = sc.nextDouble();

        if (!(N < 0)) {
            if(N == 5) {
                R = Math.sqrt(N);
            } else {
                R = Math.cbrt(N);
            }
        }

        System.out.println("Valor de R: " + R);

        sc.close();
    }
}