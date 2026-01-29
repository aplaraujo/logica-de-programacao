package io.github.aplaraujo.exercicio_5_spring.controllers;

import io.github.aplaraujo.exercicio_5_spring.dto.ChangeResponse;
import io.github.aplaraujo.exercicio_5_spring.services.ChangeService;
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

@WebMvcTest(ChangeController.class)
public class ChangeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private ChangeService service;

    @Test
    void shouldReturnCalculationResult() throws Exception {
        Mockito.when(service.calculate(30.00, 3, 100.00)).thenReturn(new ChangeResponse(90.0, 10.0));

        mockMvc.perform(post("/change")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                        {
                            "price": 30.00,
                            "quantity": 3,
                            "amount": 100.00
                        }
                        """))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.total").value(90.0))
                .andExpect(jsonPath("$.change").value(10.0));
    }
}
