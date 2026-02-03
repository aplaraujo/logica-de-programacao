package org.example;

public class CalculationService {
    public CalculationResult calculate(int hourQuantity, double hourlyRate, double discountPercentage) {
        double grossSalary = hourlyRate * hourQuantity;
        double netSalary = grossSalary - (grossSalary * (discountPercentage / 100));
        return new CalculationResult(grossSalary, netSalary);
    }
}
