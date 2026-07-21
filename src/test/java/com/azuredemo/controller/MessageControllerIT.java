package com.azuredemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MessageControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getMessage_endToEnd_returnsOkAndBody() throws Exception {
        mockMvc.perform(get("/msg"))
                .andExpect(status().isOk())
                .andExpect(content().string("<h2>Hello Deployement is successful<h2>"));
    }
}
