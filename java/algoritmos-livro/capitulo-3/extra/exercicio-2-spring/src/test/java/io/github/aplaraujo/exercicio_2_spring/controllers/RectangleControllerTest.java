package io.github.aplaraujo.exercicio_2_spring.controllers;

import io.github.aplaraujo.exercicio_2_spring.dto.RectangleResponse;
import io.github.aplaraujo.exercicio_2_spring.services.RectangleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(RectangleController.class)
public class RectangleControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private RectangleService service;

    double areaExpected, perimeterExpected, diagonalExpected;

    @BeforeEach
    void setUp() {
        areaExpected = 20.0;
        perimeterExpected = 18.0;
        diagonalExpected = 6.4031242374328485;
    }

    @Test
    void shouldReturnCalculationResult() throws Exception {
        when(service.calculate(4.0, 5.0)).thenReturn(new RectangleResponse(areaExpected, perimeterExpected, diagonalExpected));

        mockMvc.perform(post("/rectangle").contentType(MediaType.APPLICATION_JSON).content(
                """
                {
                    "width": 4.0,
                    "height": 5.0
                }
                """
        ))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.area").value(areaExpected))
                .andExpect(jsonPath("$.perimeter").value(perimeterExpected))
                .andExpect(jsonPath("$.diagonal").value(diagonalExpected));
    }
}
