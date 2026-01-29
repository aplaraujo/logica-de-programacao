package io.github.aplaraujo.exercicio_5_spring.services;

import io.github.aplaraujo.exercicio_5_spring.dto.ChangeResponse;
import org.springframework.stereotype.Service;

@Service
public class ChangeService {
    public ChangeResponse calculate(double price, int quantity, double amount) {
        double total = price * quantity;
        double change = amount - total;

        return new ChangeResponse(total, change);
    }
}
