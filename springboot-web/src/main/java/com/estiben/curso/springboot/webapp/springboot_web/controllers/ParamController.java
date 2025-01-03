package com.estiben.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estiben.curso.springboot.webapp.springboot_web.dto.ParamDto;
import com.estiben.curso.springboot.webapp.springboot_web.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("api/param")
public class ParamController {

    @GetMapping("/foo")
    // Si no se le cambia el name, la query param debe ser igual al nombre del parametro (message)
    // Ejem: http://localhost:8080/api/param?message=Holi,como vas
    public ParamDto foo(
        @RequestParam(required = false, defaultValue = "Valor por defecto") String message ){
        ParamDto paramDto = new ParamDto(message);
        return paramDto;
    }

    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam(required = false) Integer code) {
        ParamMixDto params = new ParamMixDto(text, code);
        return params;
    }

    // Query Params dinamicos
    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request) {
        Integer code = 0;
        String message = request.getParameter("message");

        try{
            code = Integer.parseInt(request.getParameter("code"));
        }
        catch(NumberFormatException e){
            System.out.println(e);

        }
        ParamMixDto paramsDto = new ParamMixDto(message, code);

        return paramsDto;   
    }
    
    
}
