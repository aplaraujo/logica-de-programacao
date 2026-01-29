package io.github.aplaraujo.exercicio_3_spring.controllers;

import io.github.aplaraujo.exercicio_3_spring.dto.AgeRequest;
import io.github.aplaraujo.exercicio_3_spring.dto.AgeResponse;
import io.github.aplaraujo.exercicio_3_spring.services.AgeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/age")
public class AgeController {
    private final AgeService service;

    public AgeController(AgeService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<AgeResponse> calculate(@RequestBody AgeRequest request) {
        AgeResponse response = service.calculate(request.getName1(), request.getAge1(), request.getName2(), request.getAge2());
        return ResponseEntity.ok(response);
    }
}
