package com.example.demovalidation.controller;

import com.example.demovalidation.model.Home;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@AllArgsConstructor
public class TempHomeController {
   RestTemplate restTemplate;

   @RequestMapping(value = "/template/all", method = RequestMethod.GET)
   public String getProductList() {
      HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      HttpEntity <String> entity = new HttpEntity<String>(headers);
      
      return restTemplate.exchange(
         "http://localhost:8080/home/all", HttpMethod.GET, entity, String.class).getBody();
   }
   @RequestMapping(value = "/template/create", method = RequestMethod.POST)
   public String createProducts(@RequestBody Home home) {
      HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      HttpEntity<Home> entity = new HttpEntity<Home>(home,headers);

      return restTemplate.exchange(
              "http://localhost:8080/home/create", HttpMethod.POST, entity, String.class).getBody();
   }
   @RequestMapping(value = "/template/products/{id}", method = RequestMethod.DELETE)
   public String deleteProduct(@PathVariable("id") Long id) {
      HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      HttpEntity<Home> entity = new HttpEntity<Home>(headers);

      return restTemplate.exchange(
              "http://localhost:8080/home/delete/{id}", HttpMethod.DELETE, entity, String.class, id).getBody();
   }
}