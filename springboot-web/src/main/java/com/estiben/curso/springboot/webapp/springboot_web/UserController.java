package com.estiben.curso.springboot.webapp.springboot_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(){
        
        return "details";
    }

}
