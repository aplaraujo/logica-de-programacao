package io.github.aplaraujo.exercicio_5_spring.controllers;

import io.github.aplaraujo.exercicio_5_spring.dto.ChangeRequest;
import io.github.aplaraujo.exercicio_5_spring.dto.ChangeResponse;
import io.github.aplaraujo.exercicio_5_spring.services.ChangeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/change")
public class ChangeController {
    private final ChangeService service;

    public ChangeController(ChangeService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ChangeResponse> calculate(@RequestBody ChangeRequest request) {
        ChangeResponse response = service.calculate(request.getPrice(), request.getQuantity(), request.getAmount());
        return ResponseEntity.ok(response);
    }
}
