package io.github.aplaraujo.exercicio_1_spring.services;

import io.github.aplaraujo.exercicio_1_spring.dto.RectangleAreaResponse;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleAreaServiceTest {
    private final RectangleAreaService  service = new RectangleAreaService();

    @Test
    void shouldCalculateAreaAndPriceCorrectly() {
        RectangleAreaResponse response = service.calculate(10.0, 30.0, 200.00);
        double areaExpected = 300.0;
        double priceExpected = 60000.0;

        assertEquals(areaExpected, response.getArea());
        assertEquals(priceExpected, response.getPrice());
    }
}
