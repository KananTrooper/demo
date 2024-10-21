package com.demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.demo.entity.Country;

public interface CoutryRepository extends JpaRepository<Country, Integer> {
    
}
