package org.example;

public class CalculationService {
    public CalculationResult calculate(double radius) {
        final double PI_VALUE = 3.14159265;
        double area = PI_VALUE * Math.pow(radius, 2);
        return new CalculationResult(area);
    }
}
