package io.github.aplaraujo.exercicio_6_spring.controllers;

import io.github.aplaraujo.exercicio_6_spring.dto.CircleRequest;
import io.github.aplaraujo.exercicio_6_spring.dto.CircleResponse;
import io.github.aplaraujo.exercicio_6_spring.services.CircleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/circle")
public class CircleController {
    private final CircleService service;

    public CircleController(CircleService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<CircleResponse> calculate(@RequestBody CircleRequest request) {
        CircleResponse response = service.calculate(request.getRadius());
        return ResponseEntity.ok(response);
    }
}
