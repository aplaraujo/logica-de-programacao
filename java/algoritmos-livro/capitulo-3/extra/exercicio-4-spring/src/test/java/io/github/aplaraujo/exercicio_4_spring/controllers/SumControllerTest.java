package io.github.aplaraujo.exercicio_4_spring.controllers;

import io.github.aplaraujo.exercicio_4_spring.dto.SumResponse;
import io.github.aplaraujo.exercicio_4_spring.services.SumService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SumController.class)
public class SumControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private SumService service;

    @Test
    void shouldReturnCalculationResult() throws Exception {
        Mockito.when(service.calculate(8, 10)).thenReturn(new SumResponse(18));

        mockMvc.perform(post("/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                         {
                            "a": 8,
                            "b": 10
                         }
                         """)
        )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.sum").value(18));
    }
}
