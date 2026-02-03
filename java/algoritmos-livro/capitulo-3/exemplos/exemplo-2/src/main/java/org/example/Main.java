package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CalculationService service = new CalculationService();

        double A, R, pi;
        R = sc.nextDouble();
        CalculationResult result = service.calculate(R);

        System.out.println("Área do círculo: " + result.getArea());

        sc.close();
    }
}