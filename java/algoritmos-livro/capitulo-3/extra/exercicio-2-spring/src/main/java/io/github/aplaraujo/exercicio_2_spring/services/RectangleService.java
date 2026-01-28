package io.github.aplaraujo.exercicio_2_spring.services;

import io.github.aplaraujo.exercicio_2_spring.dto.RectangleResponse;
import org.springframework.stereotype.Service;

@Service
public class RectangleService {
    public RectangleResponse calculate(double width, double height) {
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        return new RectangleResponse(area, perimeter, diagonal);
    }
}
