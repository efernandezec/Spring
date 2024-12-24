package com.estiben.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estiben.curso.springboot.webapp.springboot_web.dto.UserDTO;
import com.estiben.curso.springboot.webapp.springboot_web.models.User;

@RestController
@RequestMapping("api")
public class UserRestController {

    @GetMapping("details-dto")
    public UserDTO detailsDTO(){
        User user = new User("Estiben", "Fernández");
        UserDTO userDTO = new UserDTO(
            "Este es un titulo DTO",
            user.getName().concat(" ").concat(user.getLastname()),
            user);
        return userDTO;
    }

    @GetMapping("details")
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();

        User user = new User("Estiben", "Fernández");
        body.put("title", "Hola mundo from Spring!!");
        body.put("user", user);
        return body;
    }
}
