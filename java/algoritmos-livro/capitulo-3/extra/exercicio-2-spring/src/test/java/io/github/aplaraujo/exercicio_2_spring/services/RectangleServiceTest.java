package io.github.aplaraujo.exercicio_2_spring.services;

import io.github.aplaraujo.exercicio_2_spring.dto.RectangleResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleServiceTest {
    RectangleService service = new RectangleService();

    double areaExpected, perimeterExpected, diagonalExpected;

    @BeforeEach
    void setUp() {
        areaExpected = 20.0;
        perimeterExpected = 18.0;
        diagonalExpected = 6.4031242374328485;
    }

    @DisplayName("Should calculate area, perimeter and diagonal of a rectangle correctly")
    @Test
    void shouldReturnCorrectResult() {
        RectangleResponse result = service.calculate(4.0, 5.0);

        assertEquals(areaExpected, result.getArea());
        assertEquals(perimeterExpected, result.getPerimeter());
        assertEquals(diagonalExpected, result.getDiagonal());
    }
}
