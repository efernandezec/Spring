package com.estiben.springboot.di.app.springboot_di.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.estiben.springboot.di.app.springboot_di.models.Product;
import com.estiben.springboot.di.app.springboot_di.repositories.IProductRepository;

@Service
public class ProductService implements IProductService{

    @Autowired
    @Qualifier("foo")
    // @Qualifier("productRepository")
    private IProductRepository repository;


    public List<Product> findAll(){
        return repository
            .findAll()
            .stream()
            .map(product -> {
                Double newPrice = product.getPrice()*1.25d;

                //Si no se usara el Cloneable en el Model
                // Product newProduct = new Product(product.getId(), product.getName(), newPrice.longValue()); 
                
                Product newProduct = (Product) product.clone();
                newProduct.setPrice(newPrice.longValue());
                return newProduct;
            })
            .collect(Collectors.toList());
    }
    public Product getById(Long id){
        return repository.getById(id);

    }
}
