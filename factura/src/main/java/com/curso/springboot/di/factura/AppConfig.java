package com.curso.springboot.di.factura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.curso.springboot.di.factura.models.Item;
import com.curso.springboot.di.factura.models.Product;

@Configuration
@PropertySource(value = "classpath:config.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice(){
        Product product1 = new Product("Camara sony", 500);        
        Product product2 = new Product("Camara LG", 420);
        Item item1 = new Item(product1, 5);
        Item item2 = new Item(product2, 3);
        List<Item> items = Arrays.asList(item1, item2);

        return items;
    }
}
