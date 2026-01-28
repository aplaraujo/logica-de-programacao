package io.github.aplaraujo.exercicio_1_spring.controllers;

import io.github.aplaraujo.exercicio_1_spring.dto.RectangleAreaRequest;
import io.github.aplaraujo.exercicio_1_spring.dto.RectangleAreaResponse;
import io.github.aplaraujo.exercicio_1_spring.services.RectangleAreaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rectangle")
public class RectangleAreaController {
    private final RectangleAreaService service;

    public RectangleAreaController(RectangleAreaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<RectangleAreaResponse> calculate(@RequestBody RectangleAreaRequest request) {
        RectangleAreaResponse response = service.calculate(
                request.getWidth(),
                request.getHeight(),
                request.getMeter()
        );
        return ResponseEntity.ok(response);
    }
}
