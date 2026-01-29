package io.github.aplaraujo.exercicio_3_spring.controllers;

import io.github.aplaraujo.exercicio_3_spring.dto.AgeResponse;
import io.github.aplaraujo.exercicio_3_spring.services.AgeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AgeController.class)
public class AgeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private AgeService service;

    @Test
    void shouldReturnCalculationResult() throws Exception {
        Mockito.when(service.calculate("Maria Silva", 19, "Joao Melo", 20)).thenReturn(new AgeResponse(19.5));

        mockMvc.perform(post("/age")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                    {
                      "name1": "Maria Silva",
                      "age1": 19,
                      "name2": "Joao Melo",
                      "age2": 20
                    }
                """))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.average").value(19.5));
    }
}
