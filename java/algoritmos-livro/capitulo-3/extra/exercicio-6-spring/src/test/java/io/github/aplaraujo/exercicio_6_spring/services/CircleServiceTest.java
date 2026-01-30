package io.github.aplaraujo.exercicio_6_spring.services;

import io.github.aplaraujo.exercicio_6_spring.dto.CircleResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleServiceTest {
    private final CircleService service = new CircleService();

    @Test
    void shouldCalculateCircleAreaCorrectly() {
        CircleResponse response = service.calculate(9.0);
        double expected = 254.46900465000002;

        assertEquals(expected, response.getArea());
    }
}