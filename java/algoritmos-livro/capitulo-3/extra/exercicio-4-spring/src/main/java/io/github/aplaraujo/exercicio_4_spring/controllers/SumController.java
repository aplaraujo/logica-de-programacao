package io.github.aplaraujo.exercicio_4_spring.controllers;

import io.github.aplaraujo.exercicio_4_spring.dto.SumRequest;
import io.github.aplaraujo.exercicio_4_spring.dto.SumResponse;
import io.github.aplaraujo.exercicio_4_spring.services.SumService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
public class SumController {
    private final SumService service;

    public SumController(SumService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<SumResponse> calculate(@RequestBody SumRequest request) {
        SumResponse response = service.calculate(request.getA(), request.getB());
        return ResponseEntity.ok(response);
    }
}
