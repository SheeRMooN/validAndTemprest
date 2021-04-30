package com.example.demovalidation.service;

import com.example.demovalidation.model.Home;
import com.example.demovalidation.repository.HomeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class HomeService {
    private HomeRepository repository;

    public Home save(Home home){
        return repository.save(home);
    }

    public List<Home> findAll() {
        return repository.findAll();
    }
    public Optional<Home> findById(Long id){
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}