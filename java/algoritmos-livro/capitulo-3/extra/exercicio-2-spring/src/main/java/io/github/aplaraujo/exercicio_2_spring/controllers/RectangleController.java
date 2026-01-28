package io.github.aplaraujo.exercicio_2_spring.controllers;

import io.github.aplaraujo.exercicio_2_spring.dto.RectangleRequest;
import io.github.aplaraujo.exercicio_2_spring.dto.RectangleResponse;
import io.github.aplaraujo.exercicio_2_spring.services.RectangleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rectangle")
public class RectangleController {
    private final RectangleService service;

    public RectangleController(RectangleService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<RectangleResponse> calculate(@RequestBody RectangleRequest rectangleRequest) {
        RectangleResponse response = service.calculate(
                rectangleRequest.getWidth(),
                rectangleRequest.getHeight()
        );
        return ResponseEntity.ok(response);
    }
}
