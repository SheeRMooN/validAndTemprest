package com.example.demovalidation.controller;

import com.example.demovalidation.model.Home;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestWebService {
    @Autowired
   TestRestTemplate restTemplateTest;

    @Test
   void getHomeTemp() {
        ResponseEntity<List<Home>> response = restTemplateTest.exchange(
                "/person",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Home>>() {
                });
        List<Home> list = response.getBody();
        assertEquals(1, list.size());
   }

}