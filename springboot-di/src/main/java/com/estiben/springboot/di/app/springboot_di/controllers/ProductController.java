package com.estiben.springboot.di.app.springboot_di.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estiben.springboot.di.app.springboot_di.models.Product;
import com.estiben.springboot.di.app.springboot_di.services.ProductService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService service = new ProductService();

    @GetMapping("/products")
    public List<Product> findAll() {
        return service.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable Long id) {
        return service.getById(id);
    }
    
    
}
