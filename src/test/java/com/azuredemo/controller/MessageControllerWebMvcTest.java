package com.azuredemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MessageController.class)
class MessageControllerWebMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getMessage_returnsOkAndBody() throws Exception {
        mockMvc.perform(get("/msg"))
                .andExpect(status().isOk())
                .andExpect(content().string("<h2>Hello Deployement is successful<h2>"));
    }
}
