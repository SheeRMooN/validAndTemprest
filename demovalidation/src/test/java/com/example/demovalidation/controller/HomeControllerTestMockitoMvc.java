package com.example.demovalidation.controller;

import com.example.demovalidation.model.Home;
import com.example.demovalidation.service.HomeService;
import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@WebMvcTest(HomeController.class)
@SpringBootTest
class HomeControllerTestMockitoMvc {
    @Autowired
    HomeService service;
    @Autowired
    MockMvc mockMvc;

//    @Test
//    void testfindAll(){
//            Home home = new Home(20L, "Gupta","","");
//            List<Home> employees = Arrays.asList(home);
//
//            Mockito.when(service.findAll()).thenReturn(employees);
//
//            mockMvc.perform(get("/employee"))
//                    .andExpect(status().isOk())
//                    .andExpect(jsonPath("$", Matchers.hasSize(1)))
//                    .andExpect(jsonPath("$[0].firstName", Matchers.is("Lokesh")));
//
//    }
}