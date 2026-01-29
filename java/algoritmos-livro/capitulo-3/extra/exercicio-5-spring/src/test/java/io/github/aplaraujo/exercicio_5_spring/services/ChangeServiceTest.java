package io.github.aplaraujo.exercicio_5_spring.services;

import io.github.aplaraujo.exercicio_5_spring.dto.ChangeResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChangeServiceTest {
    private final ChangeService service = new ChangeService();

    double price, amount, total, change;
    int quantity;

    @BeforeEach
    void setUp() {
        price = 30.00;
        quantity = 3;
        total = 90.0;
        amount = 100.00;
        change = 10.0;
    }

    @Test
    void shouldCalculateChangeCorrectly() {
        ChangeResponse response = service.calculate(price, quantity, amount);

        Assertions.assertEquals(total, response.getTotal());
        Assertions.assertEquals(change, response.getChange());
    }
}
