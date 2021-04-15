package com.example.hibernatetest.controllers;

import com.example.hibernatetest.models.Book;
import com.example.hibernatetest.models.Kompis;
import com.example.hibernatetest.repositories.BookRepository;
import com.example.hibernatetest.repositories.KompisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/kompis")

//Testar här

public class KompisController {
    @Autowired
    private KompisRepository kompisRepo;
    @GetMapping(path ="/add")
    public String addKompis(@RequestParam String name, @RequestParam int phone){
        Kompis k = new Kompis();
        k.setName(name);
        k.setPhone(phone);
        kompisRepo.save(k);
        return "Kompis was saved";
    }
}
