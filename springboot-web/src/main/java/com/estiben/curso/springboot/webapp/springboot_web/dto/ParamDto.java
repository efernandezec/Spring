package com.estiben.curso.springboot.webapp.springboot_web.dto;

public class ParamDto {
    private String message;

    public ParamDto(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
