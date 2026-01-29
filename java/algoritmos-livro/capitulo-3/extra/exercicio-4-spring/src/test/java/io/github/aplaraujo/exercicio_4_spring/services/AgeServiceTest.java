package io.github.aplaraujo.exercicio_4_spring.services;

import io.github.aplaraujo.exercicio_4_spring.dto.SumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeServiceTest {
    private final SumService service = new SumService();

    @Test
    void shouldCalculateSumCorrectly() {
        SumResponse response = service.calculate(8, 10);
        Assertions.assertEquals(18, response.getSum());
    }
}
