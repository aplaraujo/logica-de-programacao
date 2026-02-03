package org.example;

public class CalculationResult {
    private double grossSalary;
    private double netSalary;

    public CalculationResult(double grossSalary, double netSalary) {
        this.grossSalary = grossSalary;
        this.netSalary = netSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }
}
