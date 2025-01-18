package com.estiben.springboot.di.app.springboot_di.services;

import java.util.List;

import com.estiben.springboot.di.app.springboot_di.models.Product;

public interface IProductService {
    List<Product> findAll();
    Product getById(Long id);
}
