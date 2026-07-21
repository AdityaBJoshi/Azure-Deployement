package com.azuredemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MessageControllerTest {

    private final MessageController controller = new MessageController();

    @Test
    void getMessage_returnsOkStatus() {
        ResponseEntity<String> response = controller.getMessage();

        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(200, response.getStatusCode().value());
    }

    @Test
    void getMessage_returnsExpectedBody() {
        ResponseEntity<String> response = controller.getMessage();

        assertNotNull(response.getBody());
        assertEquals("<h2>Hello Deployement is successful<h2>", response.getBody());
        assertTrue(response.getBody().contains("Hello Deployement is successful"));
    }
}
