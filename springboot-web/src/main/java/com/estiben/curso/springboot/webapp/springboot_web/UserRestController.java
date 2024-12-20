package com.estiben.curso.springboot.webapp.springboot_web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("details2")
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo from Spring!!");
        body.put("name", "Estiben");
        body.put("lastName", "Fernández");

        return body;
    }
}
