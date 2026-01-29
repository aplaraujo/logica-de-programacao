package io.github.aplaraujo.exercicio_3_spring.service;

import io.github.aplaraujo.exercicio_3_spring.dto.AgeResponse;
import io.github.aplaraujo.exercicio_3_spring.services.AgeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AgeServiceTest {
    private final AgeService service = new AgeService();

    String name1, name2;
    int age1, age2;
    double expected;

    @BeforeEach
    void setUp() {
        name1 = "Maria Silva";
        age1 = 19;
        name2 = "Joao Melo";
        age2 = 20;
        expected = 19.5;
    }

    @Test
    void shouldCalculateAverageCorrectly() {
        AgeResponse response = service.calculate(name1, age1, name2, age2);

        Assertions.assertEquals(expected, response.getAverage());
    }
}
