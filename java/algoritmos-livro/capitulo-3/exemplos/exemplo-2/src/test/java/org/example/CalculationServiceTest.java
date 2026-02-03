package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceTest {
    CalculationService service = new CalculationService();

   @Test
   public void shouldReturn12468981227850001() {
       // Given
       double R = 63.0;
       double expected = 12468.981227850001;

       // When
       CalculationResult result = service.calculate(R);

       // Then
       assertNotNull(result.getArea());
       assertEquals(expected, result.getArea());
   }

   @Test
   public void shouldReturn2717163482985() {
       // Given
       double R = 93.0;
       double expected = 27171.63482985;

       // When
       CalculationResult result = service.calculate(R);

       // Then
       assertNotNull(result.getArea());
       assertEquals(expected, result.getArea());
   }

   @Test
   public void shouldReturn8042477184() {
       // Given
       double R = 16.0;
       double expected = 804.2477184;

       // When
       CalculationResult result = service.calculate(R);

       // Then
       assertNotNull(result.getArea());
       assertEquals(expected, result.getArea());
   }

   @Test
   public void shouldReturn1093588401465() {
       // Given
       double R = 59.0;
       double expected = 10935.88401465;

       // When
       CalculationResult result = service.calculate(R);

       // Then
       assertNotNull(result.getArea());
       assertEquals(expected, result.getArea());
   }
}