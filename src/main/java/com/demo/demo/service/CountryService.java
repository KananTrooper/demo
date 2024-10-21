package com.demo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.entity.Country;
import com.demo.demo.repository.CoutryRepository;

@Service
public class CountryService {
    @Autowired
    CoutryRepository countryRepository;

    public Country save(Country country) {
        return countryRepository.save(country);
    }

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    public void delete(Integer countryid) {
         countryRepository.deleteById(countryid);
    }

    public List<Country> saveAll(List<Country> country) {
        return countryRepository.saveAll(country);
    }
}
