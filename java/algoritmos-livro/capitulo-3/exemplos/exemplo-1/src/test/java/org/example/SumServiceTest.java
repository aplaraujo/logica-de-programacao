package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumServiceTest {
    SumService service = new SumService();

    @Test
    public void shouldReturn57() {
        // Given
        int A = 3;
        int B = 54;
        int expected = 57;

        // When
        SumResult result = service.calculate(A, B);

        // Then
        assertNotNull(result.getSum());
        assertEquals(expected, result.getSum());
    }

    @Test
    public void shouldReturn109() {
        // Given
        int A = 99;
        int B = 10;
        int expected = 109;

        // When
        SumResult result = service.calculate(A, B);

        // Then
        assertNotNull(result.getSum());
        assertEquals(expected, result.getSum());
    }

    @Test
    public void shouldReturn74() {
        // Given
        int A = 27;
        int B = 47;
        int expected = 74;

        // When
        SumResult result = service.calculate(A, B);

        // Then
        assertNotNull(result.getSum());
        assertEquals(expected, result.getSum());
    }
}