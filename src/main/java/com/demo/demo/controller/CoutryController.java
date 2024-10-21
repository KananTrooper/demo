package com.demo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.demo.entity.Country;
import com.demo.demo.service.CountryService;

public class CoutryController {
    @Autowired
    CountryService countryService;

    @RequestMapping("/findAll")
    @CrossOrigin(origins = "*")
    public List<Country> findAll() {
        return countryService.findAll();
    }

    @RequestMapping("/save")
    @CrossOrigin(origins = "*")
    public Country save(@RequestBody Country country) {
        return countryService.save(country);
    }
}
