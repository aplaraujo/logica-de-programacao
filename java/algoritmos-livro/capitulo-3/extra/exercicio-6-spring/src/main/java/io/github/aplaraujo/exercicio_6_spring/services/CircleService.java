package io.github.aplaraujo.exercicio_6_spring.services;

import io.github.aplaraujo.exercicio_6_spring.dto.CircleResponse;
import org.springframework.stereotype.Service;

@Service
public class CircleService {
    public CircleResponse calculate(double radius) {
        double area = 3.14159265 * Math.pow(radius, 2);
        return new CircleResponse(area);
    }
}
