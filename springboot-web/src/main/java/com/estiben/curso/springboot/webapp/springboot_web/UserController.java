package com.estiben.curso.springboot.webapp.springboot_web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola mundo from Spring!!");
        model.addAttribute("name", "Estiben");
        model.addAttribute("lastName", "Fernández");
        return "details";
    }

}
