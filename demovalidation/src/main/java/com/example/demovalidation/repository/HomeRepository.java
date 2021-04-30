package com.example.demovalidation.repository;

import com.example.demovalidation.model.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {
    @Override
    List<Home> findAll();

    Optional<Home> findById(Long id);
    Home save(Home home);
}