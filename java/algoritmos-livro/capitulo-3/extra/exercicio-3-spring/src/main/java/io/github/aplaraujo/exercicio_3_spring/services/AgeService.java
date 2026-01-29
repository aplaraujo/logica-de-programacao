package io.github.aplaraujo.exercicio_3_spring.services;

import io.github.aplaraujo.exercicio_3_spring.dto.AgeResponse;
import org.springframework.stereotype.Service;

@Service
public class AgeService {
    public AgeResponse calculate(String name1, int age1, String name2, int age2) {
        double average = ((double) age1 + age2) / 2.0;

        return new AgeResponse(average);
    }
}
