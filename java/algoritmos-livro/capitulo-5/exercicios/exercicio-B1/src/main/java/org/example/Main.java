package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, N;
        i = 1;
        N = sc.nextInt();

        while(i <= 10) {
            System.out.println(N + " x " + i + " = " + N * i);
            i++;
        }

        sc.close();
    }
}