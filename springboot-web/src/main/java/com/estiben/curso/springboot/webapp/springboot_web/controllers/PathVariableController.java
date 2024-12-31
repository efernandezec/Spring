package com.estiben.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estiben.curso.springboot.webapp.springboot_web.dto.ParamDto;
import com.estiben.curso.springboot.webapp.springboot_web.models.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("api/var")
public class PathVariableController {
    
    @Value("${config.username}")
    private String username;

    // @Value("${config.message}")
    // private String message;

    @Value("${config.code}")
    private Integer code;

    @Value("${config.listOfValues}")
    private String[] listOfValues;

    @GetMapping("/values")
    public Map<String, Object> values(@Value("${config.message}") String message) {
        Map<String, Object> json = new HashMap<>();
        json.put("username", username);
        json.put("message", message);
        json.put("code", code);
        json.put("listOfValues", listOfValues);

        return json;
    }
    
    @GetMapping("/path/{message}")
    public ParamDto pathMessage(@PathVariable String message) {
        ParamDto param= new ParamDto(message);
        return param;
    }

    @GetMapping("mix/{message}/{code}")
    public Map<String, Object> mix(@PathVariable String message, @PathVariable Integer code) {
        
        Map<String, Object> json = new HashMap<>();
        json.put("message", message);
        json.put("code", code);
        return json;
    }

    @PostMapping("create")
    public User create(@RequestBody User user) {
        //TODO: process POST request
        user.setName(user.getName().toUpperCase());
        return user;
    }
    
    
    
}
