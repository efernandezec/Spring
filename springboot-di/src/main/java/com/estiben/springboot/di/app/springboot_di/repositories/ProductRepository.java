package com.estiben.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.estiben.springboot.di.app.springboot_di.models.Product;

@Controller
public class ProductRepository implements IProductRepository{
    private List<Product> data;

    public ProductRepository(){
        this.data = Arrays.asList(
            new Product(1L, "Teclado", 25L),
            new Product(2L, "Mouse", 10L),
            new Product(3L, "Monitor", 250L),
            new Product(4L, "CPU", 50L)
        );
    }

    @Override
    public List<Product> findAll(){
        return this.data;
    }

    @Override
    public Product getById(Long id){
        return data.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
    }
}
