package com.estiben.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estiben.curso.springboot.webapp.springboot_web.dto.ParamDto;
import com.estiben.curso.springboot.webapp.springboot_web.models.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("api/var")
public class PathVariableController {
    
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
