package com.estiben.springboot.di.app.springboot_di.repositories;

import java.util.List;

import com.estiben.springboot.di.app.springboot_di.models.Product;

public interface IProductRepository {
    List<Product> findAll();
    Product getById(Long id);
}
