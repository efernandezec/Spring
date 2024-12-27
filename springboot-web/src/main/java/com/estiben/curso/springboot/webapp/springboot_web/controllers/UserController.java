package com.estiben.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.estiben.curso.springboot.webapp.springboot_web.models.User;


@Controller
public class UserController {




    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Estiben", "Fernández");
        model.addAttribute("title", "Hola mundo from Spring!!");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/lists")
    // Tambien se puede usar el Model anterior
    public String lists(ModelMap model){

        User user1 = new User("Estiben", "Fernández", "esfer@gmail.com");
        User user2 = new User("Johana", "Pamplona", "jopam@gmail.com");
        User user3 = new User("Celeste", "Maria");

        List<User> users = Arrays.asList(user1, user2, user3);

        model.addAttribute("title", "Hola mundo from Spring!!");
        model.addAttribute("users", users);
        return "lists";
    }

}
