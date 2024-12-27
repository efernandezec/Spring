package com.estiben.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estiben.curso.springboot.webapp.springboot_web.dto.ParamDto;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("api")
public class ParamController {

    @GetMapping("param")
    // Si no se le cambia el name, la query param debe ser igual al nombre del parametro (message)
    // Ejem: http://localhost:8080/api/param?message=Holi,como vas
    public ParamDto foo(
        @RequestParam(required = false, defaultValue = "Valor por defecto") String message ){
        ParamDto paramDto = new ParamDto(message);
        return paramDto;
    }
}
