package com.estiben.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import com.estiben.springboot.di.app.springboot_di.models.Product;

public class ProductRepository {
    private List<Product> data;

    public ProductRepository(){
        this.data = Arrays.asList(
            new Product(1L, "Teclado", 25L),
            new Product(2L, "Mouse", 10L),
            new Product(3L, "Monitor", 250L),
            new Product(4L, "CPU", 50L)
        );
    }

    public List<Product> findALl(){
        return this.data;
    }
}
