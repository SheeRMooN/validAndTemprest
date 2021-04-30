package com.example.demovalidation.controller;

import com.example.demovalidation.model.Home;
import com.example.demovalidation.service.HomeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/home")
public class HomeController {
    HomeService service;

    @PostMapping("/create")
    public Home save(@RequestBody Home home){
        return service.save(home);
    }
    @GetMapping("/all")
    public List<Home> findAll(){
        return service.findAll();
    }
    @GetMapping("/post/{id}")
    public Optional<Home> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteId(@PathVariable Long id){
        service.delete(id);
        return "success delete";
    }
}