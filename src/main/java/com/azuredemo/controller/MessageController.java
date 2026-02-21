package com.azuredemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class MessageController {


    @GetMapping
    public ResponseEntity<String> getMessage()
    {
        return ResponseEntity.ok("<h2>Hello Deployement is successful<h2>");
    }
}
