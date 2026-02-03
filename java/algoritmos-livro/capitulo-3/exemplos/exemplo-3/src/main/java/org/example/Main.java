package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CalculationService service = new CalculationService();

        double hourlyRate, discountPercentage;
        int hourQuantity;
        hourQuantity = sc.nextInt();
        hourlyRate = sc.nextDouble();
        discountPercentage = sc.nextDouble();

        CalculationResult result = service.calculate(hourQuantity, hourlyRate, discountPercentage);

        System.out.println("Salário bruto: " + result.getGrossSalary());
        System.out.println("Salário líquido " + result.getNetSalary());
    }
}