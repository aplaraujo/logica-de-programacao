package io.github.aplaraujo.exercicio_1_spring.services;

import io.github.aplaraujo.exercicio_1_spring.dto.RectangleAreaResponse;
import org.springframework.stereotype.Service;

@Service
public class RectangleAreaService {
    public RectangleAreaResponse calculate(double width, double height, double meter) {
        double area = width * height;
        double price = area * meter;

        return new RectangleAreaResponse(area, price);
    }
}
