package io.github.aplaraujo.exercicio_4_spring.services;

import io.github.aplaraujo.exercicio_4_spring.dto.SumResponse;
import org.springframework.stereotype.Service;

@Service
public class SumService {
    public SumResponse calculate(int a, int b) {
        int sum = a + b;
        return new SumResponse(sum);
    }
}
