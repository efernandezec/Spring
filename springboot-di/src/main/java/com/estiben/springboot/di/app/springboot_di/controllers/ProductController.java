package com.estiben.springboot.di.app.springboot_di.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estiben.springboot.di.app.springboot_di.models.Product;
import com.estiben.springboot.di.app.springboot_di.services.IProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private IProductService service;

    @GetMapping("/products")
    public List<Product> findAll() {
        return service.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable Long id) {
        return service.getById(id);
    }
    
    
}
