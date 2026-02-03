package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceTest {
    CalculationService service = new CalculationService();

    @Test
    public void shouldCalculateGrossSalaryAndNetSalaryCorrectly() {
        // Given
        int hourQuantity = 160;
        double hourlyRate = 82.0;
        double discountPercentage = 5.0;
        double grossSalaryExpected = 13120.0;
        double netSalaryExpected = 12464.0;

        // When
        CalculationResult result = service.calculate(hourQuantity, hourlyRate, discountPercentage);

        // Then
        assertNotNull(result.getGrossSalary());
        assertNotNull(result.getNetSalary());
        assertEquals(grossSalaryExpected, result.getGrossSalary());
        assertEquals(netSalaryExpected, result.getNetSalary());
    }

}