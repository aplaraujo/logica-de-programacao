package io.github.aplaraujo.exercicio_6_spring.controllers;

import io.github.aplaraujo.exercicio_6_spring.dto.CircleResponse;
import io.github.aplaraujo.exercicio_6_spring.services.CircleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CircleController.class)
class CircleControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private CircleService service;

    double expected;

    @BeforeEach
    void setUp() {
        expected = 254.46900465000002;
    }

    @Test
    void shouldReturnCalculationResult() throws Exception {
        when(service.calculate(9.0)).thenReturn(new CircleResponse(expected));

        mockMvc.perform(post("/circle")
                .contentType(MediaType.APPLICATION_JSON)
                .content(
                        """
                        {
                            "radius": 9.0
                        }
                        """
                )
        )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.area").value(expected));
    }
}