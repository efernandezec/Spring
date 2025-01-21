package com.curso.springboot.di.factura.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Client {

    @Value("${client.name}")
    private String name;
    
    @Value("${client.lastname}")
    private String lastname;

    
    // Constructor con @Value para inyectar propiedades
    // public Client(@Value("${client.name}") String name, 
    // @Value("${client.lastname}") String lastname) {
    // this.name = name;
    // this.lastname = lastname;
    // }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    

}
