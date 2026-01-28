package io.github.aplaraujo.exercicio_1_spring.controllers;

import io.github.aplaraujo.exercicio_1_spring.dto.RectangleAreaResponse;
import io.github.aplaraujo.exercicio_1_spring.services.RectangleAreaService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(RectangleAreaController.class)
public class RectangleAreaControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private RectangleAreaService service;

    @Test
    void shouldCalculateAreaAndPriceResult() throws Exception {
        when(service.calculate(10.0, 30.0, 200.00)).thenReturn(new RectangleAreaResponse(300.0, 60000.0));

        mockMvc.perform(post("/calculations")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                        {
                            "width": 10.0,
                            "height": 30.0,
                            "meter": 200.0
                        }
                        """)
        )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.area").value(300.0))
                .andExpect(jsonPath("$.price").value(60000.0));
    }
}
