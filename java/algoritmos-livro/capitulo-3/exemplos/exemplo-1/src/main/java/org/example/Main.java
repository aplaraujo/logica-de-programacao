package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, X;
        SumService service = new SumService();

        A = sc.nextInt();
        B = sc.nextInt();

        SumResult result = service.calculate(A, B);

        System.out.println("Resultado da soma: " + result.getSum());

        sc.close();
    }
}